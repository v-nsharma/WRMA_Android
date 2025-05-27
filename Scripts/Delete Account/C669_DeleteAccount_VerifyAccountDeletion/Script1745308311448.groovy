import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

'Load test data from Data Files/C669 for account deletion test case'
def testData = findTestData('Data Files/C669')
'Get email from test data (row 1)'
def email = testData.getValue('email', 1)
'Get password from test data (row 1)'
def password = testData.getValue('password', 1)
'Get delete confirmation text from test data (row 1)'
def deleteConfirmation = testData.getValue('delete_confirmation', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)
'Wait 10 seconds for app to load completely'
Mobile.delay(10)

'Tap on Login or Sign Up button to begin authentication flow'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
'Extended wait (20s) for login screen to load'
Mobile.delay(10)

'Enter email from test data in username field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-NewUserName-LoginPage'), email, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 10 seconds'
Mobile.delay(10)

'Proceed to next screen by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
'Extended wait (30s) for OAM login screen to load'
Mobile.delay(60)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds'
Mobile.delay(20)

'Enter password from test data in password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)
'Hide the on-screen keyboard'
Mobile.hideKeyboard()
'Wait 20 seconds'
Mobile.delay(20)

'Complete login by tapping Login button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)
'Wait 20 seconds for home screen to load'
Mobile.delay(20)

'Navigate to Home section'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
'Wait 10 seconds'
Mobile.delay(10)

'Open app menu by tapping menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)
'Wait 10 seconds for menu to open'
Mobile.delay(10)

'Navigate to Settings tab'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget-Settings'), 0)
'Wait 10 seconds for settings to load'
Mobile.delay(10)

'Initiate account deletion by tapping Delete My Account button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Delete My Account'), 0)
'Wait 10 seconds for deletion confirmation screen'
Mobile.delay(10)

'Verify account deletion warning message is displayed'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Deleting your account will also delete your Online Account Management profile, and if youre a W.O.W. Loyalty Member or participate in the Westgate Travel Partner program, your benefits will be disrupted'), 10)

'Verify additional account deletion information is displayed'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - If you proceed, it can take up to two days for your account to be fully purged from our system'), 10)

'Wait 10 seconds before proceeding with deletion'
Mobile.delay(10)

'Enter required confirmation text from test data to proceed with deletion'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-DeleteConfirmationMessage'), deleteConfirmation, 0)
'Wait 10 seconds'
Mobile.delay(10)

'Confirm account deletion by tapping Delete button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Delete'), 0)
'Wait 10 seconds for deletion to process'
Mobile.delay(10)

'Verify deletion confirmation message is displayed'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Sorry to see you go'), 10)

'Wait 10 seconds'
Mobile.delay(10)

'Complete the flow by tapping Done button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Done'), 0)
'Wait 10 seconds'
Mobile.delay(10)

'Close the mobile application'
Mobile.closeApplication()