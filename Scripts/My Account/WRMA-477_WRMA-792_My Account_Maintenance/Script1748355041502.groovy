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

'Start the application using the given APK file and reset app state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (3).apk', true)

'Wait for the app to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to become visible'
Mobile.delay(10)

'Enter email address in the email input field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0525041tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the email address'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the next step'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication to complete and next screen to load (includes OTP screen or transition)'
Mobile.delay(60)

'Tap on "Accept All Cookies" button if cookie popup appears'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after dismissing cookie popup'
Mobile.delay(10)

'Re-enter the email address on the login screen if prompted again'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0525041tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after re-entering the email'
Mobile.delay(5)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the password'
Mobile.delay(5)

'Tap on the "LOGIN" button to attempt logging into the app'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete and dashboard to load'
Mobile.delay(40)

'Get the height of the device screen'
int deviceHeight = Mobile.getDeviceHeight()

'Get the width of the device screen'
int deviceWidth = Mobile.getDeviceWidth()

'Calculate horizontal center point of the screen'
int startX = deviceWidth / 2

'Calculate vertical start point for swipe (bottom 3/4 of screen)'
int startY = deviceHeight * 3 / 4

'Set vertical end point for swipe (top 1/4 of screen)'
int endX = startX
int endY = deviceHeight / 4

'Swipe up 4 times to scroll down the page'
for (int i = 0; i < 4; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify the "Maintenance / TaxUse Fee Payment Past Due" text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Maintenance  TaxUse Fee Payment Past Due'), 0)

'Verify the resort name "Westgate Vacation Villas Resort" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Westgate Vacation Villas Resort'), 0)

'Verify the amount due "7658.88" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Amount Due 7658.88'), 0)

'Verify the "Pay Now" button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Pay Now'), 0)

'Tap on the "Pay Now" button'
Mobile.tap(findTestObject('Object Repository/PastDue/android.widget.TextView - Pay Now'), 0)

'Wait for the "Pay Now" action to process'
Mobile.delay(10)

'Verify the message "Payments Coming Soon" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Payments Coming Soon'), 0)

'Verify the button "Go To Online Account Manager" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.Button - Go To Online Account Manager'), 0)

'Tap on "Go To Online Account Manager" button to redirect to external account page'
Mobile.tap(findTestObject('Object Repository/PastDue/android.widget.Button - Go To Online Account Manager'), 0)

'Wait for the web or next screen to load'
Mobile.delay(30)

'Verify that the "WESTGATE Online Account Management" text is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - WESTGATE Online Account Management'), 0)

'Close the application to end the test'
Mobile.closeApplication()