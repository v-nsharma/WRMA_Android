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

'Start the application with a fresh install'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.81.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/LoyaltyQR/android.widget.EditText'), 'ABLONDE5308@GMAIL.COM', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait before proceeding'
Mobile.delay(10)

'Tap the "Next" button to continue'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Next'), 0)

'Wait for the next screen to load (cookie consent)'
Mobile.delay(40)

'Tap on the "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Accept All Cookies'), 0)

'Wait for the login form'
Mobile.delay(10)

'Re-enter the email address'
Mobile.setText(findTestObject('Object Repository/LoyaltyQR/android.widget.EditText (1)'), 'ABLONDE5308@GMAIL.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before entering the password'
Mobile.delay(5)

'Enter the password'
Mobile.setText(findTestObject('Object Repository/LoyaltyQR/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before logging in'
Mobile.delay(10)

'Tap on the "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - LOGIN'), 0)

'Wait for the dashboard to load'
Mobile.delay(20)

'Verify that Home view and loyalty image are displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.view.View - Home'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.Image'), 0)

'Tap on the loyalty image to open the loyalty card'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Image'), 0)

'Wait for the loyalty card to load'
Mobile.delay(10)

'Verify loyalty card details are displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.Image - Loyalty Logo'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Member Since'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 2023'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Loyalty'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 763442947'), 0)

'Wait before navigating to Waterpark'
Mobile.delay(3)

'Tap on the "Waterpark" button or link'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Waterpark'), 0)

'Wait for the Waterpark screen'
Mobile.delay(10)

'Verify guest name and details on Waterpark pass'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda (1)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde (1)'), 0)

'Tap the back button'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Back'), 0)

'Wait before finishing the card view'
Mobile.delay(10)

'Tap on "Done" to close the loyalty card'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Done'), 0)

'Wait before switching tabs'
Mobile.delay(10)

'Navigate to "My Stay" section'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.view.View - My Stay'), 0)

'Wait for the My Stay screen'
Mobile.delay(20)

'Tap on the loyalty image again'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Image (1)'), 0)

'Wait for loyalty card to appear'
Mobile.delay(10)

'Verify loyalty card details again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.Image - Loyalty Logo'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Member Since'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 2023'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Loyalty'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 763442947'), 0)

'Wait before viewing Waterpark again'
Mobile.delay(3)

'Tap on Waterpark again from the My Stay view'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Waterpark'), 0)

'Wait for the Waterpark screen to load'
Mobile.delay(5)

'Verify Waterpark pass guest details again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda (1)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde (1)'), 0)

'Wait before exiting Waterpark screen'
Mobile.delay(5)

'Tap the back button'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Back'), 0)

'Wait before closing the loyalty card'
Mobile.delay(10)

'Tap on "Done" to close the loyalty view'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Button - Done'), 0)

'Wait before changing to "My Account" tab'
Mobile.delay(10)

'Navigate to "My Account" section'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.view.View - My Account'), 0)

'Wait for the account section to load'
Mobile.delay(20)

'Tap on the loyalty image in account section'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.Image (1)'), 0)

'Wait for the card to appear'
Mobile.delay(10)

'Verify loyalty card details again from My Account view'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.Image - Loyalty Logo'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Member Since'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 2023'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Loyalty'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - 763442947'), 0)

'Wait before navigating to Waterpark again'
Mobile.delay(3)

'Tap on Waterpark again from My Account'
Mobile.tap(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Waterpark'), 0)

'Wait for Waterpark screen'
Mobile.delay(5)

'Verify final Waterpark pass guest details'
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Amanda (1)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/LoyaltyQR/android.widget.TextView - Blonde (1)'), 0)

'Close the application after test completion'
Mobile.closeApplication()
