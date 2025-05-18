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

'Launch application from specified APK path with data clearing enabled'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app initialization'
Mobile.delay(10)

'Tap Login/Sign Up button to begin authentication flow'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Login or Sign Up'), 0)

'Wait 10 seconds for login screen to load'
Mobile.delay(10)

'Enter test email in email field'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText'), '0425201TM@WG.COM', 0)

'Hide keyboard after email entry'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Tap Next button to proceed to OAM login'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Next'), 0)

'Extended wait (40s) for OAM screen to load completely'
Mobile.delay(40)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (1)'), '0425201TM@WG.COM', 0)

'Hide keyboard after username entry'
Mobile.hideKeyboard()

'Wait 10 seconds before password entry'
Mobile.delay(10)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (2)'), 'password', 0)

'Hide keyboard after password entry'
Mobile.hideKeyboard()

'Wait 10 seconds before final login'
Mobile.delay(10)

'Tap LOGIN button to complete authentication'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - LOGIN'), 0)

'Wait 10 seconds for login to complete'
Mobile.delay(10)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.TextView - My Account'), 0)

'Wait 10 seconds for account screen to load'
Mobile.delay(10)

'Select Add An Account Number option'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.TextView - Add An Account Number'), 0)

'Wait 10 seconds for account entry screen'
Mobile.delay(10)

'Enter valid test account number (11 digits)'
Mobile.setText(findTestObject('Object Repository/C701-C702/android.widget.EditText (5)'), '99868581242', 0)

'Wait 10 seconds after account number entry'
Mobile.delay(10)

'Attempt to proceed with account number'
Mobile.tap(findTestObject('Object Repository/C701-C702/android.widget.Button - Next (1)'), 0)

'Wait 10 seconds for validation response'
Mobile.delay(10)

'Verify error dialog appears'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView - Error'), 0)

'Verify account not found error message'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView - Your account number could not be found. Please try again'),
	0)

'Verify Try Again button exists in error dialog'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.Button - Try Again'), 0)

'Close application after test completion'
Mobile.closeApplication()