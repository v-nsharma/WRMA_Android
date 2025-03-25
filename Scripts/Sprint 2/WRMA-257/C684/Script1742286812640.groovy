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

'Initializes testData by finding the test data file and retrieves values for email, username, password, and confirmPassword.'
TestData testData = findTestData('Data Files/C684 (1)')

'Initializes testData by finding the test data file and retrieves values for email, username, password, and confirmPassword.'
String email = testData.getValue('Email', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, password, and confirmPassword.'
String username = testData.getValue('Username', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, password, and confirmPassword.'
String password = testData.getValue('Password', 1)

'Initializes testData by finding the test data file and retrieves values for email, username, password, and confirmPassword.'
String confirmPassword = testData.getValue('ConfirmPassword', 1)

String firstName = testData.getValue('FirstName', 1)

String lastName = testData.getValue('LastName', 1)

'Launches the application located at the specified path'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Login" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of email into the email field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of username into the username field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), username, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of firstName into the first name field.\r\n\r\n'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of lastName into the last name field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates key presses in the password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates key presses in the confirmation password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on a specified element.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - New User Registration'), 0)

'Pauses the execution for 15 seconds.'
Mobile.delay(15)

'Simulates a tap on a specified element.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Simulates key presses in a specified field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Pauses the execution for 15 seconds.\r\n\r\n'
Mobile.delay(15)

'Simulates a tap on a specified element.\r\n\r\n'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 
    0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 15 seconds.'
Mobile.delay(15)

'Verifies the presence or state of a text view element.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 
    0)

'Pauses the execution for 15 seconds.'
Mobile.delay(15)

'Retrieves the text from the specified element.'
String errorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 
    0)

'Compares the retrieved text with an expected value.'
errorMessage = errorMessage.trim()

'Likely another comparison or assignment statement.'
String expectedPartialText = 'Password does not meet security requirements'

'Asserts that the retrieved text matches the expected value.'
assert errorMessage.contains(expectedPartialText)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Closes the application.'
Mobile.closeApplication()

