import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

'Retrieve test data from the "C699" data file'
TestData testData = findTestData('Data Files/C699')

'Extract email, first name, last name, password, and confirm password from the test data file'
String email = testData.getValue('email', 1)

String firstName = testData.getValue('firstname', 1)

String lastName = testData.getValue('lastname', 1)

String password = testData.getValue('password', 1)

String confirmPassword = testData.getValue('confirm password', 1)

'Launch the mobile application with reset enabled (clears previous session data)'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Wait for 10 seconds to allow the application to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button to proceed to the authentication page'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to ensure the login screen loads properly'
Mobile.delay(10)

'Enter the retrieved email into the email input field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hide the keyboard to avoid UI conflicts'
Mobile.hideKeyboard()

'Wait for 10 seconds to stabilize the UI'
Mobile.delay(10)

'Tap on the "Next" button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Wait for 10 seconds for the next screen to load'
Mobile.delay(10)

'Enter the retrieved email again to confirm email address'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds to ensure input is processed'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the personal information section'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds for the transition to complete'
Mobile.delay(10)

'Enter the first name'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Enter the last name'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Enter the password'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Wait for 10 seconds'
Mobile.delay(10)

'Enter the confirm password'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on the "Next" button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Wait for 20 seconds for page transition'
Mobile.delay(20)

'Scroll down until the text "etc)." is visible'
Mobile.scrollToText('etc).')

'Wait for 5 seconds'
Mobile.delay(5)

'Tap on the "Agree to Terms & Conditions" button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Agree to Terms  Conditions'), 0)

'Wait for 30 seconds to allow time for agreement processing'
Mobile.delay(30)

'Enter the email address in the login field on the OAM (Online Account Management) screen'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(30)

'Enter the password in the OAM login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(30)

'Tap on the "Login" button to attempt authentication'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

'Wait for 30 seconds to allow time for authentication processing'
Mobile.delay(30)

'Tap on the "Next" button to proceed with verifying the account'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next-(VerifyAccount)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Verify the existence of the message that indicates email verification has been skipped'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Youve chosen to skip the email verification process. While you can explore the app as a guest, please note that certain features and functionalities may be limited'), 
    0)

'Wait for 10 seconds'
Mobile.delay(10)

'Verify the existence of the message about limited feature access'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - To fully access all features'), 
    0)

'Wait for 10 seconds'
Mobile.delay(10)

'Capture the message about skipping email verification'
String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Youve chosen to skip the email verification process. While you can explore the app as a guest, please note that certain features and functionalities may be limited'), 
    0)

'Define the expected text'
String expectedText = 'You\'ve chosen to skip the email verification process. While you can explore the app as a guest, please note that certain features and functionalities may be limited.'

'Assert that the displayed message matches the expected text'
assert actualText == expectedText

'Verify that the "Next" button exists on the screen'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Tap the "Next" button to proceed further'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Wait for 10 seconds'
Mobile.delay(10)

'Close the application after completing the test'
Mobile.closeApplication()

