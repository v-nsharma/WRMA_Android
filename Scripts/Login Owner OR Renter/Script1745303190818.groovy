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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory

'Launch the mobile application with reset enabled (true clears any previous session data)'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 5 seconds to allow the application to fully load'
Mobile.delay(15)

'Tap on the "Login or Sign Up" button to navigate to the authentication screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to ensure that the login screen is completely loaded'
Mobile.delay(10)

'Retrieve test data from the "C728 (1)" Excel file'
TestData testData = TestDataFactory.findTestData('Data Files/C728 (1)')

'Extract the email value from the first row of the test data'
String email = testData.getValue('Email', 1)

'Enter the retrieved email address into the email input field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email)

'Wait for 10 seconds to allow the input field to process the entered email'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the subsequent screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Wait for 10 seconds to allow the next screen to load'
Mobile.delay(10)

'Tap on the "reset" button to clear the email field or reset the form'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)

'Hide the keyboard to prevent any interference with further actions'
Mobile.hideKeyboard()

'Wait for 10 seconds to ensure the reset action is completed'
Mobile.delay(10)

'Enter the same email into the "New User Email" field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-NewUserEmail'), email)

'Retrieve the email text from the "New User Email" field to verify it was entered correctly'
String enteredEmail = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.EditText-NewUserEmail'), 0)

'Assert that the email retrieved from the field matches the expected email'
assert enteredEmail == email

'Wait for 5 seconds to ensure all UI elements are updated'
Mobile.delay(5)

'Close the mobile application after test completion'
Mobile.closeApplication()

