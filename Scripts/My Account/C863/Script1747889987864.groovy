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

'Start the mobile application and reset it before launching.'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (2).apk', true)

'Wait for 10 seconds to allow the app to load properly.'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to allow the login screen to appear.'
Mobile.delay(10)

'Enter the email address in the login field.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText'), 'angela016@ameritech.net', 0)

'Hide the on-screen keyboard after entering email.'
Mobile.hideKeyboard()

'Wait for 10 seconds after entering the email.'
Mobile.delay(10)

'Tap on the "Next" button to proceed with login.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Next'), 0)

'Wait 40 seconds to allow the next screen (e.g., webview) to load.'
Mobile.delay(40)

'Tap on the "Accept All Cookies" button.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Accept All Cookies'), 0)

'Wait for 10 seconds after accepting cookies.'
Mobile.delay(10)

'Re-enter the email address on the webview login screen.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (1)'), 'angela016@ameritech.net', 0)

'Hide the on-screen keyboard after entering email.'
Mobile.hideKeyboard()

'Wait for 5 seconds after entering the email.'
Mobile.delay(5)

'Enter the password in the password input field.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard after entering password.'
Mobile.hideKeyboard()

'Wait for 5 seconds after entering the password.'
Mobile.delay(5)

'Tap on the "LOGIN" button to submit the credentials.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - LOGIN'), 0)

'Wait for 20 seconds to allow login process to complete.'
Mobile.delay(20)

'Tap again on the "My Account" option for further navigation.'
Mobile.tap(findTestObject('Object Repository/C863/android.view.View - My Account'), 0)

'Wait for 10 seconds after tapping "My Account".'
Mobile.delay(10)

'Scroll down until the text "since 2014" is visible.'
Mobile.scrollToText('since 2014')

'Wait for 10 seconds after scrolling.'
Mobile.delay(10)

'Tap on "View Account Details / Make Payments" option.'
Mobile.tap(findTestObject('Object Repository/C863/android.widget.TextView - View Account Details  Make Payments'), 0)

'Wait for 5 seconds before continuing.'
Mobile.delay(5)

'Tap on the "Mortgage" button to view mortgage details.'
Mobile.tap(findTestObject('Object Repository/C863/android.widget.Button - Mortgage'), 0)

'Wait for 5 seconds after selecting mortgage.'
Mobile.delay(5)

'Verify that the "Congratulations" message is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C863/android.view.View - Congratulations'), 0)

'Verify that the message "Your mortgage is paid in full" is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C863/android.widget.TextView - Your mortgage is paid in full'), 0)

'Close the application after verification.'
Mobile.closeApplication()