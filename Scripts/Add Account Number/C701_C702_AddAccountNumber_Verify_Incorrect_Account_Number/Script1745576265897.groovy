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

'Launch the application from specified APK path with data clearing'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-Version 2.99.68.apk', true)

'Wait 10 seconds for app initialization'
Mobile.delay(10)

'Tap on Login or Sign Up button to begin authentication'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Login or Sign Up'), 0)

'Wait 10 seconds for login screen to load'
Mobile.delay(10)

'Enter email address in email field'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText'), '0425201TM@WG.COM', 0)

'Hide the keyboard after email entry'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Tap Next button to proceed to password screen'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Next'), 0)

'Extended wait (40s) for OAM login screen to fully load'
Mobile.delay(40)

'Re-enter email in OAM username field for verification'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (1)'), '0425201TM@WG.COM', 0)

'Hide the keyboard after username entry'
Mobile.hideKeyboard()

'Wait 10 seconds before password entry'
Mobile.delay(10)

'Enter password in password field'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after password entry'
Mobile.hideKeyboard()

'Wait 10 seconds before final login attempt'
Mobile.delay(10)

'Tap LOGIN button to complete authentication'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - LOGIN'), 0)

'Wait 10 seconds for login completion'
Mobile.delay(10)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.TextView - My Account'), 0)

'Wait 10 seconds for account screen to load'
Mobile.delay(10)

'Select Add An Account Number option'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.TextView - Add An Account Number'), 0)

'Wait 10 seconds for account number screen'
Mobile.delay(10)

'Enter invalid short account number (3 digits)'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (3)'), '123', 0)

'Wait 10 seconds for validation'
Mobile.delay(10)

'Verify error message for short account number appears'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView -  Account number should be 7-11 digits'),
	0)

'Reset the account number field'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - reset'), 0)

'Wait 10 seconds after reset'
Mobile.delay(10)

'Enter invalid long account number (12 digits)'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (4)'), '123456789012', 0)

'Wait 10 seconds for validation'
Mobile.delay(10)

'Verify error message for long account number appears'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView -  Account number should be 7-11 digits'),
	0)

'Wait 10 seconds before navigation'
Mobile.delay(10)

'Navigate back from account number screen'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - back'), 0)

'Wait 10 seconds after navigation'
Mobile.delay(10)

'Re-enter Add An Account Number flow'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.TextView - Add An Account Number'), 0)

'Wait 10 seconds for screen to load'
Mobile.delay(10)

'Enter valid length but non-existent account number (8 digits)'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (5)'), '45634725', 0)

'Wait 10 seconds after entry'
Mobile.delay(10)

'Attempt to proceed with account number'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Next (1)'), 0)

'Wait 10 seconds for validation'
Mobile.delay(10)

'Verify error dialog appears'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView - Error'), 0)

'Verify error message for invalid account number'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView - Your account number could not be found. Please try again'),
	0)

'Verify Try Again button exists in error dialog'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.Button - Try Again'), 0)

'Close the application after test completion'
Mobile.closeApplication()