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
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/app-debug.apk', true)

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

Mobile.delay(20)

'Verify if the "Home" element is present on the screen'
boolean homeElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Assert that the "Home" element is found, else throw an error'
assert homeElementExists : "Element 'Home' does not exist."

'Retrieve the text displayed on the "Home" element'
String homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Assert that the retrieved text matches the expected value "Home"'
assert homeText == "Home" : "Text mismatch for 'Home'. Expected: 'Home', Actual: '${homeText}'"

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Verify if the "My Stay" element is present on the screen'
boolean myStayElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Stay'), 0)

'Assert that the "My Stay" element is found, else throw an error'
assert myStayElementExists : "Element 'My Stay' does not exist."

'Retrieve the text displayed on the "My Stay" element'
String myStayText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Stay'), 0)

'Assert that the retrieved text matches the expected value "My Stay"'
assert myStayText == "My Stay" : "Text mismatch for 'My Stay'. Expected: 'My Stay', Actual: '${myStayText}'"

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Verify if the "My Account" element is present on the screen'
boolean myAccountElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Assert that the "My Account" element is found, else throw an error'
assert myAccountElementExists : "Element 'My Account' does not exist."

'Retrieve the text displayed on the "My Account" element'
String myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Assert that the retrieved text matches the expected value "My Account"'
assert myAccountText == "My Account" : "Text mismatch for 'My Account'. Expected: 'My Account', Actual: '${myAccountText}'"

'Wait for 10 seconds before proceeding'
Mobile.delay(5)

'Print success messages to the console for verification'
println("Text 'Home' is present.")
println("Text 'My Stay' is present.")
println("Text 'My Account' is present.")

Mobile.delay(10)

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
if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-web'), 20, FailureHandling.CONTINUE_ON_FAILURE)) {
	'Log a message if the "Privacy Policy" webview is found'
	println("Element 'android.widget.TextView - Privacy Policy-web' exists.")
} else {
	'Log a message if the "Privacy Policy" webview is not found'
	println("Element 'android.widget.TextView - Privacy Policy-web' does not exist after waiting.")
}

'Close the mobile application'
Mobile.closeApplication()

WebUI.closeBrowser()



