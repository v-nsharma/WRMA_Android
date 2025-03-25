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

'Launch the Westgate mobile application from the specified APK file path'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

'Wait for 10 seconds to allow the application to fully initialize'
Mobile.delay(10)

'Select the "Continue as a Guest" option to bypass login and use basic features'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

'Wait 10 seconds for the guest session to properly initialize'
Mobile.delay(10)

'Open the main application menu by tapping the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait 20 seconds to ensure the menu fully expands (extra time for slower devices)'
Mobile.delay(20)

'Select the first tab in the widget (typically contains version information)'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget (1)'), 0)

'Wait 10 seconds for the version information screen to load completely'
Mobile.delay(10)

'Capture the actual version text displayed in the app interface'
String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.Button - Version 2.81.111'), 0)

'Display the captured version text in the console for verification'
println("Actual Text: " + actualText)

'Define the expected version number that should be displayed'
String expectedText = "Version 2.81.111"

'Display the expected version in the console for comparison'
println("Expected Text: " + expectedText)

'Verify the actual version matches expected version, fail test with message if mismatch'
assert actualText == expectedText : "Version mismatch. Expected: ${expectedText}, Actual: ${actualText}"

'Display success message in console if version verification passes'
println("Version verification successful!")

'Wait 10 seconds before closing app to ensure all operations complete'
Mobile.delay(10)

'Terminate the application session and close the app'
Mobile.closeApplication()

