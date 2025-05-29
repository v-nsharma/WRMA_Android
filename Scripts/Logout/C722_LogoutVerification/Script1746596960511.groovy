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

'Start the application from the specified APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-106.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText'), '0525041tm@wg.com', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait before proceeding to next step'
Mobile.delay(10)

'Tap on the "Next" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Next'), 0)

'Wait for the authentication process and next screen to load'
Mobile.delay(60)

'Tap on "Accept All Cookies" to dismiss the cookie popup'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup is handled'
Mobile.delay(10)

'Re-enter the email address on the login screen'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText (1)'), '0525041tm@wg.com', 0)

'Hide the keyboard after re-entering email'
Mobile.hideKeyboard()

'Wait before entering password'
Mobile.delay(10)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Wait before submitting login form'
Mobile.delay(10)

'Tap on the "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - LOGIN'), 0)

'Wait for login to complete and home screen to load'
Mobile.delay(20)

'Tap on the menu button (usually hamburger icon)'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - menu'), 0)

'Wait after opening the menu'
Mobile.delay(10)

'Tap on the "Account" tab inside the menu'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.TabWidget'), 0)

'Wait after navigating to account tab'
Mobile.delay(10)

'Tap on the "LOGOUT" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - LOGOUT'), 0)

'Wait for logout process to complete'
Mobile.delay(10)

'Verify the "Login or Sign Up" button is visible again, confirming logout'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.Button - Login or Sign Up'), 0)

'Close the application'
Mobile.closeApplication()
