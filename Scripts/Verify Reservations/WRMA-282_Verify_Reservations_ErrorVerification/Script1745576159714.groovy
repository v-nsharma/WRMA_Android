import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository as OR
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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

'Wait for the application to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Login or Sign Up'), 0)

'Pause to ensure the login screen has loaded'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard to avoid obstructing UI elements'
Mobile.hideKeyboard()

'Wait before proceeding to the next action'
Mobile.delay(10)

'Tap the "Next" button to continue to the password screen'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

'Allow time for the next screen to fully load'
Mobile.delay(40)

'Re-enter the email address in the username field on the login form'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Pause briefly before entering the password'
Mobile.delay(10)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (5)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait briefly before logging in'
Mobile.delay(10)

'Tap on the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - LOGIN'), 0)

'Pause to allow the post-login screen to load'
Mobile.delay(10)

'Tap on the image icon to navigate to user options'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image (1)'), 0)

'Pause to ensure user menu has loaded'
Mobile.delay(10)

'Tap on the "Terms and Conditions" link'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Terms and Conditions'), 0)

'Pause to allow the Terms and Conditions page to load'
Mobile.delay(10)

'Tap the "Done" button after reviewing the Terms and Conditions'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Done'), 0)

'Pause briefly before continuing to the account screen'
Mobile.delay(10)

'Tap on the "My Account" option to navigate to account management'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.view.View - My Account'), 0)

'Pause to allow the account screen to load'
Mobile.delay(10)

'Tap on "Add An Account Number" to begin linking a new account'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Add An Account Number'), 0)

'Wait for the account entry screen to load'
Mobile.delay(10)

'Enter the account number into the input field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), '26713899727', 0)

'Pause before submitting the account number'
Mobile.hideKeyboard()

'Pause briefly before moving to the next step'
Mobile.delay(10)

'Tap the "Next" button to proceed with the account linking'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (2)'), 0)

'Pause to ensure the next step has loaded'
Mobile.delay(10)

'Tap on the image to continue'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image'), 0)

'Pause before selecting a date for verification'
Mobile.delay(10)

'Tap on the specific date button to choose the date for verification'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Friday, April 11'), 0)

'Pause briefly before proceeding to the next step'
Mobile.delay(10)

'Tap on the "Next" button to continue'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

'Pause to ensure that the next screen has fully loaded'
Mobile.delay(10)

'Verify the presence of the "Back to Verify" button'
Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

'Check if the "Back to Verify" button exists on the screen'
boolean isElementPresent = Mobile.verifyElementExist(OR.findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

'Assert that the "Back to Verify" button exists, otherwise throw an error'
assert isElementPresent : "Element 'Back to Verify' button does not exist on the screen!"

'Pause briefly before clicking the "Back to Verify" button'
Mobile.delay(10)

'Tap on the "Back to Verify" button to retry the verification'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

'Close the mobile application'
Mobile.closeApplication()
