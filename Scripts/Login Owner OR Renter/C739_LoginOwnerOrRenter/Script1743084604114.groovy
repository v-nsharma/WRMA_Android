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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject

'Retrieve test data from "C739" data file'
TestData testData = findTestData("Data Files/C739")

'Extract the email and password from the test data'
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

'Launch the mobile application'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)

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

'Wait for 30 seconds to allow the next screen to load'
Mobile.delay(30)

'Enter the email address again in the OAM login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 30 seconds to ensure the email field is processed'
Mobile.delay(30)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 30 seconds before tapping the login button'
Mobile.delay(30)

'Tap on the "OAM Login" button to authenticate the user'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

'Wait for 10 seconds to allow the home screen to load'
Mobile.delay(30)

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
Mobile.delay(10)

'Print success messages to the console for verification'
println("Text 'Home' is present.")
println("Text 'My Stay' is present.")
println("Text 'My Account' is present.")

'Close the mobile application'
Mobile.closeApplication()


