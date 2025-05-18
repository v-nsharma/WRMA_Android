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

'Launch the mobile application with reset to ensure a clean state'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to initialize completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the main screen'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.widget.Button - Login or Sign Up'), 0)

'Allow the login screen to load'
Mobile.delay(10)

'Enter the Elite tier user email address'
Mobile.setText(findTestObject('Object Repository/EliteTier/android.widget.EditText'), 'curtis@combs.net', 0)

'Hide the keyboard after email input'
Mobile.hideKeyboard()

'Pause before continuing to the next screen'
Mobile.delay(10)

'Tap on the "Next" button to proceed to password entry'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.widget.Button - Next'), 0)

'Wait for the next screen (authentication or cookies) to load'
Mobile.delay(40)

'Tap to accept all cookies as required for the login flow'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.widget.Button - Accept All Cookies'), 0)

'Brief pause after accepting cookies'
Mobile.delay(5)

'Re-enter the user email on the login form'
Mobile.setText(findTestObject('Object Repository/EliteTier/android.widget.EditText (1)'), 'curtis@combs.net', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Pause before entering password'
Mobile.delay(5)

'Enter the user password'
Mobile.setText(findTestObject('Object Repository/EliteTier/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Short delay before logging in'
Mobile.delay(5)

'Tap the "LOGIN" button to authenticate the user'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.widget.Button - LOGIN'), 0)

'Wait for the home/dashboard screen to finish loading'
Mobile.delay(20)

'Verify WOW Loyalty label is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Elite Tier label is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - Elite Tier'), 0)

'Tap on "My Stay" to view the user\'s booking/stay information'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.view.View - My Stay'), 0)

'Wait for the My Stay section to load'
Mobile.delay(20)

'Confirm WOW Loyalty label is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - WOW Loyalty'), 0)

'Confirm Elite Tier label is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - Elite Tier'), 0)

'Tap on "My Account" to view user profile/account info'
Mobile.tap(findTestObject('Object Repository/EliteTier/android.view.View - My Account'), 0)

'Wait for the My Account screen to load'
Mobile.delay(20)

'Verify WOW Loyalty label appears in My Account'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Elite Tier label appears in My Account'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EliteTier/android.widget.TextView - Elite Tier'), 0)

'Close the application to end the session'
Mobile.closeApplication()
