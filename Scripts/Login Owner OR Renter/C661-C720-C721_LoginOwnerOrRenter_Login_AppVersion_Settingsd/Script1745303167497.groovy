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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
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

'Retrieve test data for login credentials and expected app version'
TestData testData = findTestData('Data Files/LogiNewUser')

'Extract email, password, and expected app version from test data'
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)
String expectedVersion = testData.getValue('version', 1)

'Launch the mobile application'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Enter email address in the login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on the Next button to proceed to the password screen'
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


'Tap on the Home button to navigate to the main screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on the Menu button to open the navigation menu'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on the Settings tab to open app settings'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget-Settings'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Retrieve the actual version displayed in the application'
String actualVersion = Mobile.getText(findTestObject('Object Repository/Settings/android.widget.Button - Version 2.99.102'), 0)

'Compare the actual version with the expected version from test data'
if (actualVersion == expectedVersion) {
    println("✅ Version verification passed. Expected: $expectedVersion, Actual: $actualVersion")
} else {
    println("❌ Version verification failed. Expected: $expectedVersion, Actual: $actualVersion")
}
assert actualVersion == expectedVersion : "Version mismatch! Expected: $expectedVersion, but got: $actualVersion"


'Close the application'
Mobile.closeApplication()

WebUI.closeBrowser()
