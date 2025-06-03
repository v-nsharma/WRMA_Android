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

'Start the application with a reset state using the given APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

'Wait for 10 seconds to allow the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the input field'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText'), '0525070tm@wg.com', 0)

'Hide the on-screen keyboard to proceed'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the email'
Mobile.delay(10)

'Tap on the "Next" button to continue'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Next'), 0)

'Wait for 60 seconds to allow authentication process and screen transition (including OTP verification)'
Mobile.delay(60)

'Tap on the "Accept All Cookies" button if the cookie consent popup appears'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Accept All Cookies'), 0)

'Wait for 10 seconds after closing the cookie popup'
Mobile.delay(10)

'Re-enter the email address if prompted again on the login screen'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText (1)'), '0525070tm@wg.com', 0)

'Hide the keyboard after entering the email again'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the email'
Mobile.delay(10)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the password'
Mobile.delay(10)

'Tap on the "LOGIN" button to log into the app'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - LOGIN'), 0)

'Wait for 60 seconds to allow login process and dashboard to load'
Mobile.delay(60)

'Verify that the "WOW LoyaltyMember Tier" section is displayed on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyTier/android.view.View - WOW LoyaltyMember Tier'), 0)

'Wait for 10 seconds before interacting with the Loyalty Tier view'
Mobile.delay(10)

'Tap on the "WOW LoyaltyMember Tier" section to view detailed info'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.view.View - WOW LoyaltyMember Tier'), 0)

'Verify that the "WOW Loyalty Program" label is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyTier/android.widget.TextView - WOW Loyalty Program'), 0)

'Verify that the "LOYALTY NUMBER 920430572" is visible on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyTier/android.widget.TextView - LOYALTY NUMBER 920430572'), 0)

'Close the application after completing the validation steps'
Mobile.closeApplication()