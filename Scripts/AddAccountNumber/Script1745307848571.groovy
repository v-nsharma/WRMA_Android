import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.webui.driver.DriverFactory
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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Launch the mobile application'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 10 seconds for app to load'
Mobile.delay(10)

'Tap on Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Enter email address in email field'
Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next'), 0)

'Wait for 40 seconds for next screen to load'
Mobile.delay(40)

'Re-enter email address in confirmation field'
Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (1)'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Enter password in password field'
Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on LOGIN button to sign in'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - LOGIN'), 0)

'Wait for 10 seconds after login'
Mobile.delay(10)

'Tap on My Account section'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.view.View - My Account'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on menu icon'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Image'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Select Terms and Conditions from menu'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Terms and Conditions'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap Done button after viewing terms'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Done'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Return to My Account section'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.view.View - My Account'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Select Add An Account Number option'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Add An Account Number'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Enter account number in input field'
Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (3)'), '26713899727', 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap Next button to proceed'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on calendar icon'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Image (1)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Select date from calendar (Wednesday, April 9)'
Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Wednesday, April 9'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap Next button to proceed'
Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Verify Error text element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Error'), 0)

'Verify Account Number text element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Account Number'), 0)

'Verify View element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View'), 0)

'Verify Select verification method text exists'
Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Select a verification method'),
	0)

'Verify second View element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View (1)'), 0)

'Check existence of all required UI elements and store results in variables'
boolean errorTextExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Error'), 0)
boolean accountNumberExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Account Number'), 0)
boolean viewExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View'), 0)
boolean selectVerificationExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Select a verification method'), 0)
boolean view1Exists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View (1)'), 0)

'Assert that all required UI elements are present, fail test if any are missing'
assert errorTextExists && accountNumberExists && viewExists && selectVerificationExists && view1Exists : "One or more UI elements are missing!"

'Close the mobile application'
Mobile.closeApplication()