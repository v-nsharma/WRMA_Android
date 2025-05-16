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

'Start the mobile application with reset (fresh start)'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.75.apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Login or Sign Up'), 0)

'Wait for login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Loyalty/android.widget.EditText'), 'REDBUGS11@YAHOO.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()


'Wait for any UI transitions or loading'
Mobile.delay(10)

'Tap on the "Next" button to proceed with email entry'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Next'), 0)

'Wait for 40 seconds to allow next screen to load completely'
Mobile.delay(40)

'Accept all cookies on the cookie consent screen'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Accept All Cookies'), 0)

'Wait briefly for the login form to become active'
Mobile.delay(10)

'Re-enter the email in the login screen'
Mobile.setText(findTestObject('Object Repository/Loyalty/android.widget.EditText (1)'), 'REDBUGS11@YAHOO.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait briefly before entering password'
Mobile.delay(5)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/Loyalty/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before tapping login'
Mobile.delay(10)

'Tap on the "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - LOGIN'), 0)

'Wait for login to complete and dashboard to load'
Mobile.delay(20)

'Assert that the profile image is displayed after login'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Image'), 0)

'Wait before interacting with the profile image'
Mobile.delay(10)

'Tap on the profile image (possibly to access welcome message)'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Image'), 0)

'Wait for UI to update'
Mobile.delay(10)

'Assert that the "Done" button is visible in the popup'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Tap on the "Done" button to dismiss popup'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Wait before navigating to "My Stay"'
Mobile.delay(10)

'Tap on "My Stay" tab'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.view.View - My Stay'), 0)

'Wait for My Stay content to load'
Mobile.delay(10)

'Assert that an image related to My Stay is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Image (1)'), 0)

'Tap on the image (e.g., to view booking details)'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Image (1)'), 0)

'Wait for details to appear'
Mobile.delay(10)

'Assert that the "Done" button is visible in the popup'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Tap on the "Done" button to close popup'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Wait before navigating to "My Account"'
Mobile.delay(10)

'Tap on "My Account" tab'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.view.View - My Account'), 0)

'Wait for My Account content to load'
Mobile.delay(10)

'Assert that an image related to My Account is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Image (1)'), 0)

'Tap on the image (e.g., to view account information)'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Image (1)'), 0)

'Wait for popup to appear'
Mobile.delay(10)

'Assert that the "Done" button is visible in the popup'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Tap on the "Done" button to close the popup'
Mobile.tap(findTestObject('Object Repository/Loyalty/android.widget.Button - Done'), 0)

'Wait before closing the app'
Mobile.delay(10)

'Close the mobile application'
Mobile.closeApplication()

