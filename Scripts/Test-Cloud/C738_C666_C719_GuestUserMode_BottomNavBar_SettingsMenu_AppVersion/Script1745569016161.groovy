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

'Launch the Westgate mobile application'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the application to load completely'
Mobile.delay(10)

'Navigate through initial screen by tapping "Continue as a Guest"'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

'Wait for guest mode initialization'
Mobile.delay(10)

'Open application menu'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait for menu to fully expand'
Mobile.delay(20)

'Navigate to version information tab'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget-Settings'), 0)

'Wait for version information to load'
Mobile.delay(10)

'Capture the actual version text'
String actualVersionText = Mobile.getText(findTestObject('Object Repository/testing/android.widget.Button - Version 2.99.68'), 0)

'Verify application version'
String expectedVersionText = "Version 2.99.68"
assert actualVersionText == expectedVersionText : "Version mismatch. Expected: ${expectedVersionText}, Actual: ${actualVersionText}"

println("Version verification successful: ${actualVersionText}")

'Return to home screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)
Mobile.delay(10)

'Verify "Home" element exists'
boolean homeElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
assert homeElementExists : "Element 'Home' does not exist."

'Retrieve and verify "Home" text'
String homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
assert homeText == "Home" : "Text mismatch for 'Home'. Expected: 'Home', Actual: '${homeText}'"

println("Home screen verification successful.")

'Navigate to "My Account" section'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
Mobile.delay(10)

'Verify "My Account" element exists'
boolean myAccountElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
assert myAccountElementExists : "Element 'My Account' does not exist."

'Retrieve and verify "My Account" text'
String myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)
assert myAccountText == "My Account" : "Text mismatch for 'My Account'. Expected: 'My Account', Actual: '${myAccountText}'"

println("My Account screen verification successful.")

println("All test verifications completed successfully!")

'Close the mobile application'
Mobile.closeApplication()

WebUI.closeBrowser()


