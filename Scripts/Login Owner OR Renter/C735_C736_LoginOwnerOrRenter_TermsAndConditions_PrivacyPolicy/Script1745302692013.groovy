import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject

'Retrieve test data from "C739" data file'
TestData testData = findTestData('Data Files/LogiNewUser')

'Extract the email and password from the test data'
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

'Launch the mobile application'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.96.apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button to initiate login'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds before entering the email'
Mobile.delay(10)

'Enter the email address in the login field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email)

'Wait for 10 seconds to allow input processing'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the password entry'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Wait for 30 seconds'
Mobile.delay(45)

'Enter the email again in the OAM (Online Account Management) login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(10)

'Enter the password in the OAM password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(10)

'Tap on the Login button in the OAM screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

'Wait for 20 seconds to allow login processing'
Mobile.delay(20)

'Navigate to the "Home" screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5)

'Open the menu by tapping on the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(20)

'Check if the "Terms and Conditions" menu option is present and tap it'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 10, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Tap on the "Terms and Conditions" menu option'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
	'Log a comment if the "Terms and Conditions" menu option is not found'
	Mobile.comment('Terms and Conditions-Menu not found', FailureHandling.CONTINUE_ON_FAILURE)
}
Mobile.delay(20)

'Verify if the "Terms and Conditions" webview is present'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.view.View-Terms and conditions web'), 10, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Log a message if the "Terms and Conditions" webview is found'
	println("Element 'android.view.View - Terms & Conditions-Webview' exists.")
} else {
	'Log a message if the "Terms and Conditions" webview is not found'
	println("Element 'android.view.View - Terms & Conditions-Webview' does not exist after waiting.")
}
Mobile.delay(20)

'Tap on the "Cancel" button to close the webview'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.ImageButton-Cancel web'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(15)

'Open the menu again by tapping on the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(20)

'Tap on the "Privacy Policy" menu option'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-Menu'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(20)

'Verify if the "Privacy Policy" webview is present'
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-web'), 20, FailureHandling.STOP_ON_FAILURE)) {
	'Log a message if the "Privacy Policy" webview is found'
	println("Element 'android.widget.TextView - Privacy Policy-web' exists.")
} else {
	'Log a message if the "Privacy Policy" webview is not found'
	println("Element 'android.widget.TextView - Privacy Policy-web' does not exist after waiting.")
}

'Close the mobile application'
Mobile.closeApplication()


