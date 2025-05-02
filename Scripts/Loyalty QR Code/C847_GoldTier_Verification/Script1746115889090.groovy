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

'Launch the mobile application with reset to clear any previous data'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.81.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the Login or Sign Up button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Silver/android.widget.EditText'), 'angela016@ameritech.net', 0)

'Hide the keyboard after typing email'
Mobile.hideKeyboard()

'Wait before proceeding to the next step'
Mobile.delay(10)

'Tap on the Next button to move to the password screen'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.Button - Next'), 0)

'Wait for the next screen (authentication) to load'
Mobile.delay(40)

'Tap on the Accept All Cookies button'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.Button - Accept All Cookies'), 0)

'Wait for the cookies popup to close'
Mobile.delay(10)

'Re-enter the email address on the login screen'
Mobile.setText(findTestObject('Object Repository/GoldTier/android.widget.EditText (1)'), 'angela016@ameritech.net', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Wait before entering password'
Mobile.delay(10)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/GoldTier/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Wait before tapping the login button'
Mobile.delay(5)

'Tap on the LOGIN button to sign in the user'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.Button - LOGIN'), 0)

'Wait for the dashboard/home screen to load'
Mobile.delay(20)

'Verify the presence of WOW Loyalty text on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify the presence of Gold Tier text on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - Gold Tier'), 0)

'Tap on the My Stay section'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.view.View - My Stay'), 0)

'Wait for the My Stay section to load'
Mobile.delay(20)

'Verify WOW Loyalty is displayed in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Gold Tier is displayed in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - Gold Tier'), 0)

'Tap on View Stay Details to see more info'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.TextView - View Stay Details'), 0)

'Wait for Stay Details screen to load'
Mobile.delay(10)

'Verify WOW Loyalty text is shown in Stay Details'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - WOW Loyalty (1)'), 0)

'Verify Gold Tier text is shown in Stay Details'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - Gold Tier (1)'), 0)

'Tap on the back button to return to the previous screen'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.widget.Button - back'), 0)

'Wait for the transition to complete'
Mobile.delay(10)

'Tap on the My Account section/tab'
Mobile.tap(findTestObject('Object Repository/GoldTier/android.view.View - My Account'), 0)

'Wait for My Account section to load'
Mobile.delay(20)

'Verify WOW Loyalty is displayed in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - WOW Loyalty'), 0)

'Verify Gold Tier is displayed in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/GoldTier/android.widget.TextView - Gold Tier'), 0)

'Close the application'
Mobile.closeApplication()
