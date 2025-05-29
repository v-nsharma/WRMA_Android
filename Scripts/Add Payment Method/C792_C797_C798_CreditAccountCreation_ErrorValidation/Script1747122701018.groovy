import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.util.KeywordUtil
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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-106.apk', true)

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
Mobile.delay(60)

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

for (int i = 0; i < 4; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Tap on the "Add A Payment Account" option.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.TextView - Add A Payment Account'), 0)

'Wait for 10 seconds for the add payment screen to load.'
Mobile.delay(10)

'Verify that the Credit/Debit card option is visible.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C792/android.view.View - CreditDebit'), 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Tap on the Credit/Debit card option to proceed.'
Mobile.tap(findTestObject('Object Repository/C792/android.widget.TextView'), 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter the card number.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText'), '6011000991001201', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter an invalid expiration month.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (1)'), '54', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter an invalid expiration year.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (2)'), '90', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter the CVV number.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (3)'), '123', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Verify validation message for invalid month is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C792/android.widget.TextView -  Enter a valid month'), 0)

'Verify validation message for future year is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C792/android.widget.TextView -  Year is too far into the future'), 0)

'Enter a valid expiration month.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (1)'), '12', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter a valid expiration year.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (2)'), '26', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter the cardholder first name.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (4)'), 'RobinsonCrusoe', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Enter the cardholder last name.'
Mobile.setText(findTestObject('Object Repository/C792/android.widget.EditText (5)'), 'jones', 0)

'Wait for 5 seconds.'
Mobile.delay(5)

'Tap on the "Save" button to submit card details.'
Mobile.tap(findTestObject('Object Repository/C792/android.widget.Button - Save'), 0)

'Wait for 15 seconds to allow backend to process the submission.'
Mobile.delay(15)

'Verify that the user is navigated back to "My Account" page.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C792/android.view.View - My Account (1)'), 0)

'Close the application.'
Mobile.closeApplication()
