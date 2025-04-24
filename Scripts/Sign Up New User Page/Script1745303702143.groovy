import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Initializes testData by finding the test data file located at Data Files'
TestData testData = findTestData('Data Files/LogiNewUser')

'Retrieves the value of the "email" field from the first row of the test data and assigns it to the variable email.'
String email = testData.getValue('email', 2)

'Retrieves the value of the "firstname" field from the first row of the test data and assigns it to the variable firstName.'
String firstName = testData.getValue('firstname', 2)

'Retrieves the value of the "lastname" field from the first row of the test data and assigns it to the variable lastName.'
String lastName = testData.getValue('lastname', 2)

'Retrieves the value of the "password" field from the first row of the test data and assigns it to the variable password.'
String password = testData.getValue('password', 2)

'Retrieves the value of the "confirmpassword" field from the first row of the test data and assigns it to the variable confirmPassword.'
String confirmPassword = testData.getValue('confirm password', 2)

' Launches the application '
Mobile.startApplication(GlobalVariable.appUrl, true)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Login or Sign Up" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of email into the login or sign-up field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of email into the confirm email address field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 20 seconds.'
Mobile.delay(20)

'Inputs the value of firstName into the first name field.\r\n\r\n'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of lastName into the last name field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates key presses in the password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

' Simulates key presses in the confirm password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Confirm Password'), confirmPassword)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Scroll down until the text "etc)." is visible'
int deviceHeight = Mobile.getDeviceHeight()
int deviceWidth = Mobile.getDeviceWidth()

int startX = deviceWidth / 2
int startY = deviceHeight * 3 / 4
int endX = startX
int endY = deviceHeight / 4

for (int i = 0; i < 8; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

try {
	Mobile.scrollToText('etc)')
} catch (Exception e) {
	KeywordUtil.markWarning("Text 'etc)' not found after 4 scrolls.")
}

'Wait for 5 seconds'
Mobile.delay(5)

'Tap on Agree to terms and conditions'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Agree to Terms  Conditions'), 0)

Mobile.delay(30)

'Enter email in OAM webview'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 30 seconds.'
Mobile.delay(10)

'Enter password in OAM webview'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 30 seconds.'
Mobile.delay(10)

'Tap on Login Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - LOGIN'), 0)

'Pauses the execution for 30 seconds.'
Mobile.delay(20)

'Verify element present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 
    0)

String elementText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 
    0).trim()

println('Text of the element: ' + elementText)

String expectedText = 'Resend Confirmation Email'.trim()

assert elementText.equals(expectedText)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Tap on resend confirmation mail button\r\n'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 0)

'Verify Nwxt button exists\r\n'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Next (3)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (3)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Print the assertion result'
println('All text assertions passed successfully!')

'Close the application'
Mobile.closeApplication()

WebUI.closeBrowser()


