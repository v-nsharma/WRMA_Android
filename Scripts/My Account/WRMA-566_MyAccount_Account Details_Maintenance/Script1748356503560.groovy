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
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/PastDue/android.view.View - My Account'), 0)

Mobile.delay(20)

'Verify the "Maintenance / TaxUse Fee Payment Past Due" text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Maintenance  TaxUse Fee Payment Past Due'), 0)

'Verify the resort name "Westgate Vacation Villas Resort" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Westgate Vacation Villas Resort'), 0)

'Verify the amount due "7658.88" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Amount Due 7658.88'), 0)

'Verify the "Pay Now" button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastDue/android.widget.TextView - Pay Now'), 0)

Mobile.closeApplication()

