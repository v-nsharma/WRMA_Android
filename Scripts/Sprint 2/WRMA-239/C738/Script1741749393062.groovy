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

'Launch the mobile application'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the "Continue as a Guest" button to proceed without logging in'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)

'Wait for 10 seconds to allow the home screen to load'
Mobile.delay(10)

'Verify if the "Home" element exists on the screen'
boolean homeElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Assert that the "Home" element is present; if not, throw an error'
assert homeElementExists : "Element 'Home' does not exist."

'Retrieve the text displayed on the "Home" element'
String homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Assert that the retrieved text matches the expected value "Home"'
assert homeText == "Home" : "Text mismatch for 'Home'. Expected: 'Home', Actual: '${homeText}'"

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Verify if the "My Account" element exists on the screen'
boolean myAccountElementExists = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Assert that the "My Account" element is present; if not, throw an error'
assert myAccountElementExists : "Element 'My Account' does not exist."

'Retrieve the text displayed on the "My Account" element'
String myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Assert that the retrieved text matches the expected value "My Account"'
assert myAccountText == "My Account" : "Text mismatch for 'My Account'. Expected: 'My Account', Actual: '${myAccountText}'"

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Print confirmation message to the console for successful verification'
println("Text 'Home' is available.")
println("Text 'My Account' is available.")

'Close the application'
Mobile.closeApplication()
