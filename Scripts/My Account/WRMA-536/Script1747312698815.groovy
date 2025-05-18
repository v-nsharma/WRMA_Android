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

'Launch the mobile application with a fresh install'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address into the email input field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0525041tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the email address'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the next login step'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and the next screen to load'
Mobile.delay(40)

'Tap on the "Accept All Cookies" button in the popup'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after handling the cookies popup'
Mobile.delay(10)

'Re-enter the email address on the main login screen'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0525041tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after re-entering the email address'
Mobile.delay(5)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the password'
Mobile.delay(5)

'Tap on the "LOGIN" button to sign into the application'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for the login process to complete and the dashboard to load'
Mobile.delay(20)

'Tap on the "My Account" section from the dashboard or menu'
Mobile.tap(findTestObject('Object Repository/WRMA536/android.view.View - My Account'), 0)

'Wait for the My Account section to fully load'
Mobile.delay(5)

'Verify that the "Mortgage Payment is Past Due" message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.view.View'), 0)

'Verify that the text "Mortgage Payment is Past Due" is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Mortgage Payment is Past Due'), 0)

'Verify that the property name "Westgate Vacation Villas Resort" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Westgate Vacation Villas Resort'), 0)

'Verify that the "Amount Due" value of 16371.8 is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Amount Due 16371.8'), 0)

'Verify that the "Pay Now" button is present on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Pay Now'), 0)

'Close the mobile application'
Mobile.closeApplication()
