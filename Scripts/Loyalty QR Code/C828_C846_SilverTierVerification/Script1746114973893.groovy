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

'Tap on the Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to load'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Silver/android.widget.EditText'), 'rfrancis@twc.com', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Wait before proceeding to the next screen'
Mobile.delay(10)

'Tap on the Next button to proceed to the authentication screen'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.Button - Next'), 0)

'Wait for the authentication screen to fully load'
Mobile.delay(40)

'Tap on the Accept All Cookies button'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.Button - Accept All Cookies'), 0)

'Wait for cookies popup to dismiss'
Mobile.delay(10)

'Enter the email address again in the second email input field'
Mobile.setText(findTestObject('Object Repository/Silver/android.widget.EditText (1)'), 'rfrancis@twc.com', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Wait before entering the password'
Mobile.delay(10)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/Silver/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Wait before tapping the login button'
Mobile.delay(5)

'Tap on the LOGIN button to sign in'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.Button - LOGIN'), 0)

'Wait for the dashboard/home screen to load'
Mobile.delay(20)

'Verify that the WOW Loyalty text is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - WOW Loyalty'), 0)

'Verify that the Silver Tier text is visible on the dashboard'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - Silver Tier'), 0)

'Tap on the My Stay tab or section'
Mobile.tap(findTestObject('Object Repository/Silver/android.view.View - My Stay'), 0)

'Wait for the My Stay section to load'
Mobile.delay(20)

'Verify that the WOW Loyalty text is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - WOW Loyalty'), 0)

'Verify that the Silver Tier text is visible in My Stay section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - Silver Tier'), 0)

'Tap on the View Stay Details option'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.TextView - View Stay Details'), 0)

'Wait for stay details to load'
Mobile.delay(10)

'Verify that the WOW Loyalty text is visible in Stay Details view'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - WOW Loyalty (1)'), 0)

'Verify that the Silver Tier text is visible in Stay Details view'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - Silver Tier (1)'), 0)

'Tap on the back button to return to the previous screen'
Mobile.tap(findTestObject('Object Repository/Silver/android.widget.Button - back'), 0)

'Wait for the screen to return'
Mobile.delay(10)

'Tap on the My Account tab or section'
Mobile.tap(findTestObject('Object Repository/Silver/android.view.View - My Account'), 0)

'Wait for the My Account section to load'
Mobile.delay(10)

'Verify that the WOW Loyalty text is visible in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - WOW Loyalty'), 0)

'Verify that the Silver Tier text is visible in My Account section'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Silver/android.widget.TextView - Silver Tier'), 0)

'Close the application'
Mobile.closeApplication()
