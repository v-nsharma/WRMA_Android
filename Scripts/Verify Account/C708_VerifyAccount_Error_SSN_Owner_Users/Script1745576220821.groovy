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
Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Login or Sign Up'), 0)

'Pause to ensure the login screen has loaded'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText'), '0425201TM@WG.COM', 0)

'Hide the keyboard to avoid obstructing UI elements'
Mobile.hideKeyboard()

'Wait before proceeding to the next action'
Mobile.delay(10)

'Tap the "Next" button to continue to the password screen'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next'), 0)

'Allow time for the next screen to fully load'
Mobile.delay(40)

'Re-enter the email address in the username field on the login form'
Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (1)'), '0425201TM@WG.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Pause briefly before entering the password'
Mobile.delay(10)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait briefly before logging in'
Mobile.delay(10)

'Tap on the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - LOGIN'), 0)

'Pause to allow the post-login screen to load'
Mobile.delay(15)

'Tap on the "My Account" tab to navigate to account options'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - My Account'), 0)

'Pause to ensure the account screen has loaded'
Mobile.delay(10)

'Tap on "Add An Account Number" to begin linking a new account'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - Add An Account Number'), 0)

'Wait for the account entry screen to load'
Mobile.delay(10)

'Enter the account number into the input field'
Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (3)'), '99868581242', 0)

'Pause before proceeding to the next step'
Mobile.delay(10)

'Tap the "Next" button to proceed to verification method selection'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next (1)'), 0)

Mobile.delay(20)

'Tap on "Social Security Number" option for verification'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - Social Security Number'), 0)

'Pause to ensure SSN input field is ready'
Mobile.delay(10)

'Enter an invalid or test social security number'
Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (4)'), '12345', 0)

'Pause before submitting the SSN'
Mobile.delay(10)

'Tap the "Next" button to attempt account verification'
Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next (1)'), 0)

'Verify the error message indicating verification failure is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Error'), 0)

'Verify that the "Account Number" label is present for user reference'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Account Number'), 0)

'Verify that a detailed problem message is shown to the user'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - There was a problem adding or associating your account'), 0)

'Verify that the SSN mismatch warning is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Your social security number for this account does not match our records. Please try again'), 0)

'Verify the presence of "Back to Verify" button to retry the process'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.Button - Back to Verify'), 0)

'Close the mobile application'
Mobile.closeApplication()
