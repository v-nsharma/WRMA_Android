import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'Launch the application on the physical device'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Wait for 3 seconds for the app to load'
Mobile.delay(3)

'Verify the text "You are Moments Away From Customized Vacation Experiences" is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Youre Moments Away FromCustomized Vacation Experiences'),
	0)

'Wait for 3 seconds'
Mobile.delay(3)

'Get the text "You are Moments Away From Customized Vacation Experiences" and print it'
String text = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Youre Moments Away FromCustomized Vacation Experiences'),
	0)

println('Text: ' + text)

'Wait for 3 seconds'
Mobile.delay(3)

'Verify the "Login or Sign Up" button is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 3 seconds'
Mobile.delay(3)

'Verify the bottom navigation bar "Home" is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Wait for 3 seconds'
Mobile.delay(3)

'Verify the bottom navigation bar "My Account" is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Wait for 3 seconds'
Mobile.delay(3)

'Tap on the non-clickable text "Vacation More. Get More"'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Vacation More. Get More'), 0)

'Wait for 3 seconds'
Mobile.delay(3)

'Verify that tapping on "Vacation More. Get More" does not redirect to the next page'
Mobile.verifyElementVisible(findTestObject('Object Repository/Repo/android.widget.TextView - Vacation More. Get More'),
	0)

'Wait for 3 seconds'
Mobile.delay(3)

'Verify the text "Explore Westgate Loyalty" is visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Repo/android.widget.TextView - Explore Westgate Loyalty'),
	0)

'Wait for 3 seconds'
Mobile.delay(3)

'Tap on the clickable text "Continue as a Guest"'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

'Wait for the "Continue as a Guest" element to be present after tapping'
boolean isElementVisible = Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'),
	10)

'Check if the element is visible and log the result'
if (!(isElementVisible)) {
	KeywordUtil.markFailed('Failed: Expected element not found after tapping \'Continue as a Guest\'')
} else {
	KeywordUtil.logInfo('Success: Tapped on \'Continue as a Guest\' and expected element is present.')
}

'Wait for 5 seconds'
Mobile.delay(5)

'Tap on the menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait for 30 seconds for the menu to open'
Mobile.delay(30)

'Tap on the "Terms and Conditions" option in the menu'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 0)

'Wait for 30 seconds for the Terms and Conditions page to load'
Mobile.delay(30)

'Verify the Terms and Conditions webview is present'
boolean isElementPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View-Terms and conditions web'),
	10)

'Assert that the Terms and Conditions webview exists'
assert isElementPresent : 'Element \'android.view.View - Terms & Conditions-Webview\' does not exist'

'Print the result of the element verification'
println("Element exists: $isElementPresent")

'Wait for 30 seconds'
Mobile.delay(30)

'Tap on the cancel button to close the webview'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.ImageButton-Cancel web'), 0)

'Wait for 15 seconds'
Mobile.delay(15)

'Tap on the menu button again to open the menu fly-out'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

'Wait for 30 seconds for the menu to open'
Mobile.delay(30)

'Tap on the "Privacy Policy" option in the menu'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-Menu'), 0)

'Wait for 30 seconds for the Privacy Policy page to load'
Mobile.delay(30)

'Verify the Privacy Policy webview is present'
boolean isPrivacyElementPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-web'),
	0)

'Assert that the Privacy Policy webview exists'
assert isPrivacyElementPresent : 'Element \'android.widget.TextView - Privacy Policy-web\' does not exist'

'Print the result of the element verification'
println("Element exists: $isPrivacyElementPresent")

'Close the application successfully'
Mobile.closeApplication()