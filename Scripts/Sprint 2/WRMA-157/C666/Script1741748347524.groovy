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

'Launch the mobile application from the specified APK path'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

'Wait for 10 seconds to allow the app to load completely'
Mobile.delay(10)

'Tap on the "Continue as a Guest" text view to enter guest mode'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

'Wait for 10 seconds for the guest mode to initialize'
Mobile.delay(10)

'Tap on the menu button to open the application menu'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait for 10 seconds for the menu to fully open'
Mobile.delay(10)

'Tap on the tab widget (likely the "About" or "Settings" tab) to view version information'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget (1)'), 0)

'Wait for 10 seconds for the version information to load'
Mobile.delay(10)

'Get the actual version text displayed in the app'
String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.Button - Version 2.81.111'), 0)

'Print the actual version text to console for verification'
println("Actual Text: " + actualText)

'Define the expected version text that should be displayed'
String expectedText = "Version 2.81.111"

'Print the expected version text to console for reference'
println("Expected Text: " + expectedText)

'Assert that the actual version matches the expected version, with a descriptive error message if they differ'
assert actualText == expectedText : "Version mismatch. Expected: ${expectedText}, Actual: ${actualText}"

'Print confirmation message if version verification is successful'
println("Version verification successful!")

'Close the mobile application'
Mobile.closeApplication()