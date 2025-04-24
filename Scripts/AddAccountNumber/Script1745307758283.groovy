import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.webui.driver.DriverFactory
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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 10 seconds for app to load completely'
Mobile.delay(10)

'Tap on the Login or Sign Up button to begin authentication process'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds for login screen to load'
Mobile.delay(10)

'Enter email address "SELENAWB@GMAIL.COM" in the email field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'CGARNER024@GMAIL.COM', 0)

'Hide the on-screen keyboard after text entry'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Proceed to next screen by tapping Next button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

'Extended wait (40 seconds) for next screen to load completely'
Mobile.delay(40)

'Confirm email by re-entering "SELENAWB@GMAIL.COM" in confirmation field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (1)'), 'CGARNER024@GMAIL.COM', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Enter password "password" in the password field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds before login attempt'
Mobile.delay(10)

'Complete login process by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - LOGIN'), 0)

'Wait for 10 seconds after successful login'
Mobile.delay(10)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.view.View - My Account'), 0)

'Wait for 10 seconds for account screen to load'
Mobile.delay(10)

'Select "Add An Account Number" option to begin account setup'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Add An Account Number'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Enter account number "69099564838" in the input field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (3)'), '69099564838', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Proceed to next step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds for next screen to load'
Mobile.delay(10)

'Select "First Payment Due Date" option to set payment date'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - First Payment Due Date'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Verify "First Payment Due Date" text element exists on screen'
Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - First Payment Due Date (1)'),
	0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on calendar icon to open date picker'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image'), 0)

'Wait for 10 seconds for calendar to appear'
Mobile.delay(10)

'Select specific date "Wednesday, April 9" from calendar'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Wednesday, April 9'), 0)

'Wait for 10 seconds after date selection'
Mobile.delay(10)

'Proceed to next step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Check if error text element exists on screen and store result'
boolean isErrorTextPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Error'), 0)

'Check if account number text exists on screen and store result'
boolean isAccountNumberPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Account Number'), 0)

'Check if view element exists on screen and store result'
boolean isViewPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.view.View'), 0)

'Assert all required elements are present, fail test if any are missing'
assert isErrorTextPresent && isAccountNumberPresent && isViewPresent : "One or more expected elements are not present!"

'Wait for 10 seconds'
Mobile.delay(10)

'Navigate back to verification screen by tapping Back button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Verify "Monthly Payment Amount" text element exists on screen'
Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Monthly Payment Amount'),
	0)

'Wait for 10 seconds'
Mobile.delay(10)

'Select Monthly Payment Amount field to edit'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Monthly Payment Amount'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Enter monthly payment amount "1000" in the input field'
Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (4)'), '1000', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Proceed to next step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Check if "Verify Account" text exists on screen and store result'
boolean isVerifyAccountPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Verify Account'), 0)

'Check if generic text view exists on screen and store result'
boolean isTextPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.view.View'), 0)

'Check if error message exists on screen and store result'
boolean isErrorMessagePresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - There was a problem adding or associating your account'), 0)

'Assert all required UI elements are present, fail test if any are missing'
assert isVerifyAccountPresent && isTextPresent && isErrorMessagePresent : "One or more expected UI elements are missing!"

'Close the mobile application'
Mobile.closeApplication()