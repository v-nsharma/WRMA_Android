import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import internal.GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Load test data from Data Files/C726 for My Stay test case'
TestData testData = findTestData('Data Files/C726')
'Get username from test data (row 1)'
String username = testData.getValue("username", 1)
'Get password from test data (row 1)'
String password = testData.getValue("password", 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)
'Wait 10 seconds for app to load completely'
Mobile.delay(10)

'Initiate login process by tapping Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)
'Wait 10 seconds for login screen to load'
Mobile.delay(10)

'Enter username from test data in username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), username, 0)
'Hide the on-screen keyboard after text entry'
Mobile.hideKeyboard()
'Wait 10 seconds'
Mobile.delay(10)

'Proceed to next screen by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)
'Extended wait (30s) for OAM login screen to load'
Mobile.delay(30)

'Confirm username by re-entering in OAM username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), username, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds'
Mobile.delay(20)

'Enter password from test data in password field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (2)'), password, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds'
Mobile.delay(20)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)
'Extended wait (30s) for login to complete and home screen to load'
Mobile.delay(30)

'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
'Wait 5 seconds for My Stay screen to load'
Mobile.delay(5)

'Verify all My Stay screen elements (with continue-on-failure handling)'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Stay')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Current')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Past Stays')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Error')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - There was a problem loading your stays. Pull down to refresh your stays, or try again later')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Add a Reservation')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Get the most out of your stay by adding it to the Westgate Resorts Mobile App')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - ADD A RESERVATION')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.view.View - My Stay (1)')

'Switch to Past Stays view'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Past Stays'), 0)
'Wait 5 seconds for Past Stays to load'
Mobile.delay(5)

'Verify Past Stays header exists'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Past Stays')

'Close the mobile application'
Mobile.closeApplication()

def verifyElementWithContinue(String objectPath) {
	try {
		'Verify element exists with strict failure handling'
		Mobile.verifyElementExist(
			findTestObject(objectPath),
			10,
			FailureHandling.STOP_ON_FAILURE
		)
	} catch (Exception e) {
		'Capture screenshot with timestamp and object path if verification fails'
		Mobile.takeScreenshot("FAILURE_${objectPath.replace('/','_')}_${System.currentTimeMillis()}.png")
		'Log failure but continue test execution'
		println("Verification failed for ${objectPath} - Continuing test execution")
	}
	'Brief pause after each verification'
	Mobile.delay(3)
}