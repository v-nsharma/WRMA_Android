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

'Application is launched successfully in the Physical device'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

Mobile.delay(5)

'User taps on Continue as Guest option'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

Mobile.delay(5)

'Tap the Menu and The Menu fly-out is opened'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

Mobile.delay(5)

'Tap the Privacy Policy section'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-Menu'), 0)

'User should be redirected to the external website where the Privacy Policy page is hosted.The bottom navigation bar ("Home," "My Account" for logged out version) should remain accessible, ensuring consistent navigation throughout the user experience.'
Mobile.delay(30)

boolean isElementPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Privacy Policy-web'), 0)

assert isElementPresent : "Element 'android.widget.TextView - Privacy Policy-web' does not exist"
println("Element exists: ${isElementPresent}")

'Appplication is closed Successfully'
Mobile.closeApplication()


