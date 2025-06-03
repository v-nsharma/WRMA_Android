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

'Start the mobile application and reset app state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

'Wait for 10 seconds to allow the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText'), '0525070tm@wg.com', 0)

'Hide the on-screen keyboard to proceed'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the email'
Mobile.delay(10)

'Tap on the "Next" button to continue login process'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Next'), 0)

'Wait for 60 seconds to allow authentication and OTP verification'
Mobile.delay(60)

'Tap on the "Accept All Cookies" button if cookie consent popup is shown'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - Accept All Cookies'), 0)

'Wait for 10 seconds after accepting cookies'
Mobile.delay(10)

'Re-enter the email address if prompted again on the login screen'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText (1)'), '0525070tm@wg.com', 0)

'Hide the keyboard after entering the email again'
Mobile.hideKeyboard()

'Wait for 10 seconds after re-entering the email'
Mobile.delay(10)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/LoyaltyTier/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the password'
Mobile.delay(10)

'Tap on the "LOGIN" button to submit login credentials'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.widget.Button - LOGIN'), 0)

'Wait for 60 seconds to allow login process and dashboard to load'
Mobile.delay(60)

'Verify that the "WOW LoyaltyMember Tier" section is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyTier/android.view.View - WOW LoyaltyMember Tier'), 0)

'Wait for 10 seconds before interacting with the Loyalty Tier view'
Mobile.delay(10)

'Tap on the "WOW LoyaltyMember Tier" section to view detailed loyalty information'
Mobile.tap(findTestObject('Object Repository/LoyaltyTier/android.view.View - WOW LoyaltyMember Tier'), 0)

'Wait for 10 seconds to allow the detailed loyalty view to load'
Mobile.delay(10)

'Verify that the "Get Support" text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.TextView - Get Support'), 0)

'Verify that the customer feedback/support prompt is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.TextView - Provide customer feedback, or please contact us for support'), 0)

'Verify that the "CALL 888-852-2959" support button is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - CALL 888-852-2959'), 0)

'Tap on the "United States" button to view country support options'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - United States'), 0)

'Wait for 5 seconds for country options to load'
Mobile.delay(5)

'Verify that the "United States" button is present in country options'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - United States (1)'), 0)

'Verify that the "United Kingdom" button is present in country options'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - United Kingdom'), 0)

'Verify that the "Brazil" button is present in country options'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - Brazil'), 0)

'Tap on the "Cancel" button to close the country options popup'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Cancel'), 0)

'Close the mobile application'
Mobile.closeApplication()