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

'Start the mobile application using the specified APK file and reset the app data'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (3).apk', true)

'Wait for the app to fully load before proceeding'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button located on the home screen'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to become available'
Mobile.delay(10)

'Enter the user email address into the email input field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), 'TONYCULTON0618@GMAIL.COM', 0)

'Hide the on-screen keyboard after typing the email'
Mobile.hideKeyboard()

'Pause to ensure the email input is registered'
Mobile.delay(10)

'Tap on the "Next" button to proceed with the login process'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication process or OTP screen to finish loading'
Mobile.delay(60)

'Tap on the "Accept All Cookies" button to accept cookie policy if the popup appears'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait briefly after interacting with the cookies popup'
Mobile.delay(10)

'Re-enter the user email address in the email field if prompted again'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), 'TONYCULTON0618@GMAIL.COM', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Pause to ensure the re-entered email is properly handled'
Mobile.delay(5)

'Enter the user password into the password field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Pause to allow password field to capture the input'
Mobile.delay(5)

'Tap on the "LOGIN" button to attempt signing in to the app'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for the dashboard or home screen to load after successful login'
Mobile.delay(40)

'Get the height of the mobile device screen for swipe calculations'
int deviceHeight = Mobile.getDeviceHeight()

'Get the width of the mobile device screen for swipe calculations'
int deviceWidth = Mobile.getDeviceWidth()

'Calculate the X coordinate (middle of the screen) for vertical swipe'
int startX = deviceWidth / 2

'Set the Y coordinate to start the swipe from 3/4th of the screen height (bottom)'
int startY = deviceHeight * 3 / 4

'Set the Y coordinate to end the swipe at 1/4th of the screen height (top)'
int endX = startX
int endY = deviceHeight / 4

'Perform swipe up gesture 4 times to scroll down the page'
for (int i = 0; i < 4; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Assert that "Mortgage Payment is Due" text element is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Mortgage Payment is Due'), 0)

'Assert that "Westgate Vacation Villas Resort" text is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Westgate Vacation Villas Resort'), 0)

'Assert that the "Amount Due 240.37" is visible on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Amount Due 240.37'), 0)

'Assert that the "Pay Now" button is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Pay Now'), 0)

'Close the mobile application after completing the test steps'
Mobile.closeApplication()