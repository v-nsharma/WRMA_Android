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

'Launch the mobile application with reset to ensure a fresh start'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the application to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the Platinum tier user\'s email address into the email field'
Mobile.setText(findTestObject('Object Repository/Platinum/android.widget.EditText'), 'wjack8120@aol.com', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Pause briefly before proceeding'
Mobile.delay(10)

'Tap the "Next" button to go to the password entry screen'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.Button - Next'), 0)

'Wait for the authentication screen to load'
Mobile.delay(40)

'Tap on "Accept All Cookies" to proceed with login'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.Button - Accept All Cookies'), 0)

'Wait for the cookie confirmation to process'
Mobile.delay(10)

'Re-enter the user\'s email address on the login form'
Mobile.setText(findTestObject('Object Repository/Platinum/android.widget.EditText (1)'), 'wjack8120@aol.com', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Short pause before entering the password'
Mobile.delay(5)

'Enter the user\'s password into the password field'
Mobile.setText(findTestObject('Object Repository/Platinum/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Pause briefly before submitting the login'
Mobile.delay(5)

'Tap on the "LOGIN" button to authenticate the user'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.Button - LOGIN'), 0)

'Wait for the home/dashboard screen to load'
Mobile.delay(20)

'Verify the WOW Loyalty label is displayed on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - WOW Loyalty'), 0)

'Verify the Platinum Tier label is displayed on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - Platinum Tier'), 0)

'Tap on the "My Stay" section to view booking details'
Mobile.tap(findTestObject('Object Repository/Platinum/android.view.View - My Stay'), 0)

'Wait for the "My Stay" screen to fully load'
Mobile.delay(20)

'Verify WOW Loyalty label appears in the My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - WOW Loyalty'), 0)

'Verify Platinum Tier label appears in the My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - Platinum Tier'), 0)

'Tap on the "View Stay Details" option to see more information'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.TextView - View Stay Details'), 0)

'Wait for stay details to load'
Mobile.delay(10)

'Confirm WOW Loyalty label is visible in the Stay Details screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - WOW Loyalty (1)'), 0)

'Confirm Platinum Tier label is visible in the Stay Details screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - Platinum Tier (1)'), 0)

'Tap the back button to return to the previous screen'
Mobile.tap(findTestObject('Object Repository/Platinum/android.widget.Button - back'), 0)

'Pause after navigating back'
Mobile.delay(10)

'Tap on the "My Account" section/tab'
Mobile.tap(findTestObject('Object Repository/Platinum/android.view.View - My Account'), 0)

'Wait for My Account screen to fully load'
Mobile.delay(20)

'Verify the WOW Loyalty label is displayed in My Account'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - WOW Loyalty'), 0)

'Verify the Platinum Tier label is displayed in My Account'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Platinum/android.widget.TextView - Platinum Tier'), 0)

'Close the mobile application to end the session'
Mobile.closeApplication()
