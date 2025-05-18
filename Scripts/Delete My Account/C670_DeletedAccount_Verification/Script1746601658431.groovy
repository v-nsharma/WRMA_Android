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

'Start the application using the specified APK file'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/Delete/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Delete/android.widget.EditText'), '03205118TM@WG.COM', 0)

'Hide the keyboard to continue'
Mobile.hideKeyboard()

'Wait briefly after entering the email'
Mobile.delay(5)

'Tap on the "Next" button to proceed'
Mobile.tap(findTestObject('Object Repository/Delete/android.widget.Button - Next'), 0)

'Wait for the registration screen to appear'
Mobile.delay(5)

'Verify "New User" heading is displayed on the registration screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Delete/android.widget.TextView - New User'), 0)

'Verify "Westgate Online Account Registration" heading is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Delete/android.widget.TextView - Westgate Online Account Registration'), 0)

'Verify that the email used for registration is correctly displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Delete/android.widget.TextView - Youre creating an account with 03205118TMWG.COM'), 0)

'Verify that the account benefits description is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Delete/android.widget.TextView - Creating a new user account will provide access to the Westgate Resorts Mobile App, Westgate Owner Account Management System, Westgate Owner Referral Site, and much more'), 0)

'Close the application after verification is complete'
Mobile.closeApplication()
