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

'Wait for the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address into the email input field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), 'MSNEEDJONES@GMAIL.com', 0)

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
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), 'MSNEEDJONES@GMAIL.com', 0)

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
Mobile.delay(30)

'Tap on the "My Account" option in the dashboard'
Mobile.tap(findTestObject('Object Repository/Mortgage/android.view.View - My Account'), 0)

'Wait for the My Account page to load'
Mobile.delay(5)

'Tap on the user profile view to open more options'
Mobile.tap(findTestObject('Object Repository/Mortgage/android.view.View'), 0)

'Wait for options to load'
Mobile.delay(5)

'Tap on the "Mortgage" button to view mortgage details'
Mobile.tap(findTestObject('Object Repository/Mortgage/android.widget.Button - Mortgage'), 0)

'Wait for mortgage information to load'
Mobile.delay(5)

'Verify that the mortgage payment due text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Mortgage/android.widget.TextView - Your mortgage payment of 148.83 is due on June 3, 2025'), 0)

'Verify that the "Next Payment Due" section is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Mortgage/android.view.View - Next Payment Due'), 0)

'Verify that the "PAY NOW" button is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Mortgage/android.widget.Button - PAY NOW'), 0)

'Tap on the Mortgage section again if needed'
Mobile.tap(findTestObject('Object Repository/Mortgage/android.widget.Button - Mortgage (1)'), 0)

'Close the application'
Mobile.closeApplication()