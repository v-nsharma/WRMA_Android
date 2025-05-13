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

'Launch the specified Android application and reset its state.'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.90.apk', true)

'Wait for 10 seconds to allow the app to load properly.'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to allow the login screen to appear.'
Mobile.delay(10)

'Enter the username/email into the email input field.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText'), '0525071TM@WG.COM', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the email.'
Mobile.delay(10)

'Tap on the "Next" button to proceed with login.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Next'), 0)

'Wait for 40 seconds to allow the next screen (e.g., webview) to load.'
Mobile.delay(40)

'Tap on the "Accept All Cookies" button.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Accept All Cookies'), 0)

'Wait for 10 seconds after accepting cookies.'
Mobile.delay(10)

'Re-enter the email address in the email field.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (1)'), '0525071TM@WG.COM', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 5 seconds after entering the email.'
Mobile.delay(5)

'Enter the password in the password input field.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 5 seconds after entering the password.'
Mobile.delay(5)

'Tap on the "LOGIN" button to submit the credentials.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - LOGIN'), 0)

'Wait for 20 seconds to allow the login process to complete.'
Mobile.delay(20)

'Tap on the "My Account" section after successful login.'
Mobile.tap(findTestObject('Object Repository/C795/android.view.View - My Account'), 0)

'Wait for 10 seconds for the account page to load.'
Mobile.delay(10)

'Scroll down'
int deviceHeight = Mobile.getDeviceHeight()
int deviceWidth = Mobile.getDeviceWidth()

int startX = deviceWidth / 2
int startY = deviceHeight * 3 / 4
int endX = startX
int endY = deviceHeight / 4

for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify that the "Payment Wallet" label is visible on the screen.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - Payment Wallet'), 0)

'Verify that the "Visa" card type label is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - Visa'), 0)

'Verify that the last 4 digits of the Visa card (1201) are shown.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - 1201'), 0)

'Verify that the expiration date label "Exp. Date" is present.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - Exp. Date'), 0)

'Verify that the Visa card expiration date "122026" is displayed correctly.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - 122026'), 0)

'Verify that the "Checking Account" section is shown.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - Checking Account'), 0)

'Verify that the last 4 digits of the checking account (4234) are displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - 4234'), 0)

'Verify that the routing number label is present.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - Routing Number'), 0)

'Verify that the routing number "110000000" is displayed correctly.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Credit/android.widget.TextView - 110000000'), 0)

'Close the mobile application after verification is complete.'
Mobile.closeApplication()

