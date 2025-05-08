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

'Start the application from the given APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for login screen'
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(10)

'Tap on "Next" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and next screen to load'
Mobile.delay(40)

'Tap on "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup interaction'
Mobile.delay(10)

'Re-enter email address on login screen'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(5)

'Enter password'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering password'
Mobile.delay(5)

'Tap on "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete'
Mobile.delay(20)

'Tap on "My Account"'
Mobile.tap(findTestObject('Object Repository/Resort/android.view.View - My Account'), 0)

'Wait for account section to load'
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.TextView - Add An Account Number'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/C791/android.widget.EditText'), '99831853223', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Button - Next'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/C791/android.widget.EditText (1)'), '7728b671', 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Button - Next'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Image'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.TextView - Pamela Hillary'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Button - Confirm Identity'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Button - Next (1)'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/C791/android.widget.Button - Next'), 0)

Mobile.delay(5)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C791/android.widget.TextView - Account number has been added'), 
    0)

Mobile.closeApplication()

