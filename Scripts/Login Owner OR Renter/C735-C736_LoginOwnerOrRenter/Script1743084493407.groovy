import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable

'Read test data from Excel file'
TestData loginData = findTestData('Data Files/C735 (1)')
String email = loginData.getValue('email', 1)
String password = loginData.getValue('password', 1)

'Launch the application on the device'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(20)

'Tap on the "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)

'Enter the email address in the login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginOrSignUp'), email, 0, FailureHandling.STOP_ON_FAILURE)
Mobile.hideKeyboard()
Mobile.delay(20)

'Tap on the "Next" button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)

'Enter the email address in the OAM login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.TextView - Email Address-oam'), email, 0, FailureHandling.STOP_ON_FAILURE)
Mobile.hideKeyboard()
Mobile.delay(30)

'Enter the password in the OAM password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.TextView - Password-oam'), password, 0, FailureHandling.STOP_ON_FAILURE)
Mobile.hideKeyboard()
Mobile.delay(30)

'Tap on the "Login" button to log in'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(10)

'Navigate to the "Home" screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5)

'Open the menu by tapping on the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)

'Check if the "Terms and Conditions" menu option is present and tap it'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 10, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Tap on the "Terms and Conditions" menu option'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
	'Log a comment if the "Terms and Conditions" menu option is not found'
	Mobile.comment('Terms and Conditions-Menu not found', FailureHandling.CONTINUE_ON_FAILURE)
}
Mobile.delay(30)

'Verify if the "Terms and Conditions" webview is present'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.view.View-Terms and conditions web'), 30, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Log a message if the "Terms and Conditions" webview is found'
	println("Element 'android.view.View - Terms & Conditions-Webview' exists.")
} else {
	'Log a message if the "Terms and Conditions" webview is not found'
	println("Element 'android.view.View - Terms & Conditions-Webview' does not exist after waiting.")
}
Mobile.delay(30)

'Tap on the "Cancel" button to close the webview'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.ImageButton-Cancel web'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(15)

'Open the menu again by tapping on the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)

'Tap on the "Privacy Policy" menu option'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-Menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)

'Verify if the "Privacy Policy" webview is present'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-web'), 30, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Log a message if the "Privacy Policy" webview is found'
	println("Element 'android.widget.TextView - Privacy Policy-web' exists.")
} else {
	'Log a message if the "Privacy Policy" webview is not found'
	println("Element 'android.widget.TextView - Privacy Policy-web' does not exist after waiting.")
}

'Close the application successfully'
Mobile.closeApplication()