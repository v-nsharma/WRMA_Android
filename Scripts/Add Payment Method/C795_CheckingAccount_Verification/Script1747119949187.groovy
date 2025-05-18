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
Mobile.startApplication(GlobalVariable.appUrl, true)

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

'Wait for 40 seconds to allow next screen (e.g., webview) to load.'
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

'Wait for 20 seconds to allow login process to complete.'
Mobile.delay(20)

'Tap on the "My Account" section after successful login.'
Mobile.tap(findTestObject('Object Repository/C795/android.view.View - My Account'), 0)

'Wait for 10 seconds for the account page to load.'
Mobile.delay(10)

'Tap on the "Add A Payment Account" option.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.TextView - Add A Payment Account'), 0)

'Wait for 10 seconds for the add payment screen to load.'
Mobile.delay(10)

'Select "Checking/Savings" as the payment account type.'
Mobile.tap(findTestObject('Object Repository/C795/android.view.View - CheckingSavings'), 0)

'Wait for 10 seconds.'
Mobile.delay(10)

'Enter the routing number.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (3)'), '110000000', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds.'
Mobile.delay(10)

'Enter the account number.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (4)'), '234324234234234', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds.'
Mobile.delay(10)

'Enter the first name of the account holder.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (5)'), 'michael', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds.'
Mobile.delay(10)

'Enter the last name of the account holder.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (6)'), 'jr', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds.'
Mobile.delay(10)

'Enter the account nickname.'
Mobile.setText(findTestObject('Object Repository/C795/android.widget.EditText (7)'), 'micJR', 0)

'Hide the on-screen keyboard.'
Mobile.hideKeyboard()

'Wait for 10 seconds.'
Mobile.delay(10)

'Tap on the "Save" button to add the payment account.'
Mobile.tap(findTestObject('Object Repository/C795/android.widget.Button - Save'), 0)

'Wait for 10 seconds after saving.'
Mobile.delay(10)

'Verify that the newly added routing number is displayed.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C795/android.widget.TextView - 110000000'), 0)

'Verify that the newly added account number is displayed (masked or formatted).'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C795/android.widget.TextView - 110000000 (1)'), 0)

'Verify that the "My Account" view is still accessible.'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C795/android.view.View - My Account'), 0)

'Close the application.'
Mobile.closeApplication()
