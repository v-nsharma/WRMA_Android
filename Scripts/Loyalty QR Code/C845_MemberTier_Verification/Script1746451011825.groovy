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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the Member Tier user email address'
Mobile.setText(findTestObject('Object Repository/MemberTier/android.widget.EditText'), '0425070TM@WG.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait before continuing'
Mobile.delay(10)

'Tap on the "Next" button'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.widget.Button - Next (1)'), 0)

'Wait for cookie consent screen'
Mobile.delay(10)

'Tap on "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.widget.Button - Accept All Cookies'), 0)

'Wait for the login form to load completely'
Mobile.delay(40)

'Re-enter the email address in the login form'
Mobile.setText(findTestObject('Object Repository/MemberTier/android.widget.EditText (1)'), '0425070TM@WG.COM', 0)

'Hide the keyboard after re-entering the email'
Mobile.hideKeyboard()

'Wait before entering the password'
Mobile.delay(10)

'Enter the password for the user'
Mobile.setText(findTestObject('Object Repository/MemberTier/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait before attempting login'
Mobile.delay(10)

'Tap on the "LOGIN" button to authenticate'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.widget.Button - LOGIN'), 0)

'Wait for dashboard to load'
Mobile.delay(10)

'Verify WOW Loyalty label is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Member Tier label is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - Member Tier'), 0)

'Tap on "My Stay" to view booking or stay info'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.view.View - My Stay'), 0)

'Wait for My Stay section to load'
Mobile.delay(20)

'Confirm WOW Loyalty label is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - WOW Loyalty'), 0)

'Confirm Member Tier label is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - Member Tier'), 0)

'Tap on user avatar or icon to open profile popup'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.view.View'), 0)

'Wait for profile popup to appear'
Mobile.delay(20)

'Verify WOW Loyalty label appears in the account popup'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - WOW Loyalty (1)'), 0)

'Verify Member Tier label appears in the account popup'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - Member Tier (1)'), 0)

'Tap on the back button to close the profile popup'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.widget.Button - back'), 0)

'Wait before navigating to account section'
Mobile.delay(10)

'Tap on "My Account" to view profile details'
Mobile.tap(findTestObject('Object Repository/MemberTier/android.view.View - My Account'), 0)

'Wait for My Account section to load'
Mobile.delay(20)

'Verify WOW Loyalty label is visible in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Member Tier label is visible in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MemberTier/android.widget.TextView - Member Tier'), 0)

'Close the application to end the session'
Mobile.closeApplication()
