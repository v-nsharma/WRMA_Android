import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import io.appium.java_client.AppiumDriver
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
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Launch the application'
Mobile.startApplication(GlobalVariable.appUrl, true)
//Mobile.startApplication('8be092e2-8aba-45d4-a086-ad912593f36c', true)


'Retrieve test data from the "C699" data file'
TestData testData = findTestData('Data Files/WRMA-107')

'Extract email, first name, last name, password, and confirm password from the test data file'
String email = testData.getValue('Email', 1)

String password = testData.getValue('Password', 1)

Mobile.delay(10)

'Verify Home element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

Mobile.delay(5)

'Tap on Home'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

Mobile.delay(10)

'Verify Home element exists after tapping'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home (1)'), 0)

Mobile.delay(5)

'Verify Slide text is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView-Slide'), 0)

'Perform Swipe action'
def startX = 1000

def startY = 2000

def endX = 200

def endY = 1000

try {
	Mobile.swipe(startX, startY, endX, endY)
	println("Swipe action successful")
} catch (Exception e) {
	println("Swipe action failed: " + e.getMessage())
}

Mobile.delay(5)

'Get and verify Home text'
def homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home (1)'), 0).trim()

println('Home Text: ' + homeText)

Mobile.verifyEqual(homeText, 'Home', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

'Verify My Account element exists'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account (1)'), 0)

Mobile.delay(5)

'Get and verify My Account text'
def myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account (1)'), 0).trim()

println('My Account Text: ' + myAccountText)

Mobile.verifyEqual(myAccountText, 'My Account', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(15)

'Scroll to text: Recommended for you'
Mobile.scrollToText('Recommended for you')

Mobile.delay(5)

'Verify Recommended for you text is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - RECOMMENDED FOR YOU'), 0)

Mobile.delay(5)

'Get and verify Recommended for you text'
def recommendedText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - RECOMMENDED FOR YOU'), 
    0).trim()

println('Recommended Text: ' + recommendedText)

Mobile.verifyEqual(recommendedText, 'RECOMMENDED FOR YOU', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

'Verify Things to Do section is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - THINGS TO DO'), 0)

Mobile.delay(5)

'Get and verify Things to Do text'
def thingsToDoText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - THINGS TO DO'), 0).trim()

println('Things to Do Text: ' + thingsToDoText)

Mobile.verifyEqual(thingsToDoText, 'THINGS TO DO', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

'Verify Gain Access section is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View-gain access'), 0)

Mobile.delay(5)

'Get and verify Gain Access text'
def gainAccessText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Gain access to a'), 
    0).trim()

println('Gain Access Text: ' + gainAccessText)

Mobile.verifyEqual(gainAccessText, 'Gain access to a', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

'Verify Login button is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Login'), 0)

Mobile.delay(5)

'Get and verify Login text'
def loginText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Login'), 0).trim()

println('Login Text: ' + loginText)

Mobile.verifyEqual(loginText, 'Login', FailureHandling.STOP_ON_FAILURE)

'Tap on Login'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Login'), 0)

Mobile.delay(30)

'Verify WESTGATE Online Account Management text is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - WESTGATE Online Account Management'), 0)

Mobile.delay(5)

'Get and verify WESTGATE Online Account Management text'
def westgateText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - WESTGATE Online Account Management'), 0).trim()

println('WESTGATE Text: ' + westgateText)

Mobile.verifyEqual(westgateText, 'WESTGATE Online Account Management', FailureHandling.CONTINUE_ON_FAILURE)

'Enter the email address in the login field on the OAM (Online Account Management) screen'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(10)

'Enter the password in the OAM login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(10)

'Tap on the "Login" button to attempt authentication'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

Mobile.delay(10)

'Verify "Home" element exists'
boolean homeElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
assert homeElementExists : "Element 'Home' does not exist."

'Retrieve and verify "Home" text'
homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
assert homeText == "Home" : "Text mismatch for 'Home'. Expected: 'Home', Actual: '${homeText}'"

println("Home screen verification successful.")

'Navigate to "My Account" section'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
Mobile.delay(10)

'Verify "My Account" element exists'
boolean myAccountElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
assert myAccountElementExists : "Element 'My Account' does not exist."

'Retrieve and verify "My Account" text'
myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
assert myAccountText == "My Account" : "Text mismatch for 'My Account'. Expected: 'My Account', Actual: '${myAccountText}'"

println("My Account screen verification successful.")

println("All test verifications completed successfully!")

'Close the application'
Mobile.closeApplication()


