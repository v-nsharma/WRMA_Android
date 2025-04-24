import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

'Load test data from Data Files/C751 for My Stay verification test case'
TestData testData = findTestData('Data Files/C751')
'Get test email from first row of test data'
String email = testData.getValue('email', 1)
'Get test password from first row of test data'
String password = testData.getValue('password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)
'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Tap the Login/Sign Up button to begin authentication flow'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)
'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter the test email in username field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), email, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)
'Extended wait (45s) for OAM login screen to load'
Mobile.delay(45)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), email, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds before password entry'
Mobile.delay(20)

'Enter the test password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), password, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds before login attempt'
Mobile.delay(20)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)
'Wait 20 seconds for login to complete and home screen to load'
Mobile.delay(20)

'Verify My Stay section exists on home screen'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
'Brief 5 second wait after verification'
Mobile.delay(5)

'Navigate to My Stay section by tapping on it'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
'Extended wait (30s) for My Stay details to load'
Mobile.delay(30)

'Verify UPCOMING STAYS header is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - UPCOMING STAYS'), 0)
'Wait 10 seconds after verification'
Mobile.delay(10)

'Locate the specific stay view element in object repository'
TestObject myStayView = findTestObject('Object Repository/Repo/MyStay/android.view.View (1)')

'Check if stay view element exists (10s timeout)'
boolean isElementPresent = Mobile.verifyElementExist(myStayView, 10)
'Check if stay view element is visible (10s timeout)'
boolean isElementVisible = Mobile.verifyElementVisible(myStayView, 10)

'If element is both present and visible, attempt to interact with it'
if (isElementPresent && isElementVisible) {
	KeywordUtil.logInfo("Element is present and visible - attempting to tap")

	try {
		'Try to tap on the stay view element'
		Mobile.tap(myStayView, 0)
		KeywordUtil.logInfo("Element was successfully tapped")
	} catch (Exception e) {
		'Mark test as failed if tap action fails'
		KeywordUtil.markFailed("Failed to tap element: " + e.getMessage())
	}
} else {
	'Mark test as failed if element not present/visible'
	KeywordUtil.markFailed("Element was not present or visible")
}

'Assert that element was both present and visible'
assert isElementPresent && isElementVisible : "Element was either not present or not visible"

'Close the mobile application'
Mobile.closeApplication()