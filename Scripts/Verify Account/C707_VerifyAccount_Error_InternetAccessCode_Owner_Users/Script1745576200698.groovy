import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Start the mobile application from the specified APK file and reinstall if already installed'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the application to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.Button - Login or Sign Up'), 0)

'Pause to ensure the login screen has loaded'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/SSN/android.widget.EditText'), '0525041tm@wg.com', 0)

'Hide the keyboard to avoid obstructing UI elements'
Mobile.hideKeyboard()

'Wait before proceeding to the next action'
Mobile.delay(10)

'Tap the "Next" button to continue to the password screen'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.Button - Next'), 0)

'Allow time for the next screen to fully load'
Mobile.delay(60)

'Re-enter the email address in the username field on the login form'
Mobile.setText(findTestObject('Object Repository/SSN/android.widget.EditText (1)'), '0525041tm@wg.com', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Pause briefly before entering the password'
Mobile.delay(10)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/SSN/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait briefly before logging in'
Mobile.delay(10)

'Tap on the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.Button - LOGIN'), 0)

'Pause to allow the post-login screen to load'
Mobile.delay(20)

'Tap on the "My Account" tab to navigate to account options'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.TextView - My Account'), 0)

'Pause to ensure the account screen has loaded'
Mobile.delay(10)

'Tap on "Add An Account Number" to begin linking a new account'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.TextView - Add An Account Number'), 0)

'Wait for the account entry screen to load'
Mobile.delay(10)

'Enter the account number into the input field'
Mobile.setText(findTestObject('Object Repository/SSN/android.widget.EditText (3)'), '99949128443', 0)

'Hide the keyboard after entering the account number'
Mobile.hideKeyboard()

'Wait before proceeding to the next step'
Mobile.delay(10)

'Tap the "Next" button to proceed to the verification code input'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.Button - Next (1)'), 0)

Mobile.delay(20)

'Enter the verification code for the account'
Mobile.setText(findTestObject('Object Repository/SSN/android.widget.EditText (4)'), '1234567', 0)

'Hide the keyboard after entering the code'
Mobile.hideKeyboard()

'Tap the "Next" button to complete the account verification step'
Mobile.tap(findTestObject('Object Repository/SSN/android.widget.Button - Next (1)'), 0)

'Pause to allow the result screen to load'
Mobile.delay(10)

'Verify that the error message is displayed indicating an invalid or failed attempt'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SSN/android.widget.TextView - Error'), 0)

'Verify that the "Account Number" label is displayed for user reference'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SSN/android.widget.TextView - Account Number'), 0)

'Verify that the "Back to Verify" button is available to retry the process'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SSN/android.widget.Button - Back to Verify'), 0)

'Close the mobile application'
Mobile.closeApplication()
