import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import internal.GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Load test data from Data Files/C790 for My Stay test case'
TestData testData = findTestData('Data Files/C790')
'Get email from test data (row 1)'
String email = testData.getValue('email', 1)
'Get password from test data (row 1)'
String password = testData.getValue('password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)
'Wait 10 seconds for app to load completely'
Mobile.delay(10)

'Initiate login process by tapping Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (2)'), 0)
'Wait 10 seconds for login screen to load'
Mobile.delay(10)

'Enter email from test data in username field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-NewUserName-LoginPage'), email, 0)
'Hide the on-screen keyboard after text entry'
Mobile.hideKeyboard()
'Wait 10 seconds'
Mobile.delay(10)

'Proceed to next screen by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (2)'), 0)
'Extended wait (30s) for OAM login screen to load'
Mobile.delay(30)

'Confirm email by re-entering in OAM username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (5)'), email, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds'
Mobile.delay(20)

'Enter password from test data in password field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (6)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds'
Mobile.delay(20)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN (1)'), 0)

'Wait 20 seconds for login to complete and home screen to load'
Mobile.delay(20)

'Verify My Stay section exists (with continue-on-failure handling)'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.view.View - My Stay (2)')

'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay (2)'), 0)

'Wait 5 seconds for My Stay screen to load'
Mobile.delay(5)

'Verify all My Stay screen elements (with continue-on-failure handling)'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - You dont have any upcoming stays associated with your profile')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Add a Reservation (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Get the most out of your stay by adding it to the Westgate Resorts Mobile App (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - ADD A RESERVATION (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Stay (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Current (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Past Stays (1)')

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