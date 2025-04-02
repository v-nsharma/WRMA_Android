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

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
TestData testData = findTestData('Data Files/C683')

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.\r\n'
String email = testData.getValue('Email', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
String username = testData.getValue('Username', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
String firstName = testData.getValue('FirstName', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
String lastName = testData.getValue('LastName', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
String password = testData.getValue('Password', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, firstName, lastName, password, and confirmation.'
String confirmPassword = testData.getValue('ConfirmPassword', 1)

'Launches the application located at the specified path.'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Pauses the execution for a specified amount of time.'
Mobile.delay(10)

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for a specified amount of time.'
Mobile.delay(10)

'Inputs the value of email into the email field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard.\r\n\r\n'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 10 seconds, waiting for the username confirmation field to be ready.'
Mobile.delay(10)

'Inputs the value of username into the username field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), username, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds, waiting for the first name field to be ready.'
Mobile.delay(10)

'Inputs the value of firstName into the first name field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds'
Mobile.delay(10)

'Inputs the value of firstName into the last name field again.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the confirmation password field to be ready'
Mobile.delay(10)

'Inputs the value of password into the password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Pauses the execution for a specified amount of time.'
Mobile.delay(10)

'Inputs the value of confirm password into the password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)

'Pauses the execution for a specified amount of time.\r\n\r\n'
Mobile.delay(10)

'Likely interacts with a text view element\r\n'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - New User Registration'), 0)

'Pauses the execution for a specified amount of time.'
Mobile.delay(15)

'Likely interacts with a top element'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), 0)

'Hides the on-screen keyboard'
Mobile.hideKeyboard()

'Simulates key presses in a specified field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Pauses the execution for a specified amount of time'
Mobile.delay(15)

'Likely interacts with a top element'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 
    0)

'Verifies the presence or state of a text view element.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 
    0)

'Pauses the execution for a specified amount of time.'
Mobile.delay(15)

'Retrieves the text from the specified element.'
String errorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 
    0)

'Compares the retrieved text with an expected value'
errorMessage = errorMessage.trim()

'Likely another comparison or assignment statement.'
String expectedPartialText = 'Password does not meet security requirements'

'Asserts that the retrieved text matches the expected value.'
assert errorMessage.contains(expectedPartialText)

'Pauses the execution for a specified amount of time.'
Mobile.delay(5)

'Likely closes or interacts with the application, but details are not provided.'
Mobile.closeApplication()

