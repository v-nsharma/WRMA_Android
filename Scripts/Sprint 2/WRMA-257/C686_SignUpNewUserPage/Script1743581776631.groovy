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

' Initializes testData by finding the test data file located at "Data Files"\r\n'
TestData testData = findTestData('Data Files/C686')

'Retrieves the value of the "email" field from the first row of the test data and assigns it to the variable email.'
String email = testData.getValue('email', 1)

'Retrieves the value of the "firstName" field from the first row of the test data and assigns it to the variable firstName.'
String firstName = testData.getValue('firstName', 1)

'Retrieves the value of the "resetFirstName" field from the first row of the test data and assigns it to the variable resetFirstName.'
String resetFirstName = testData.getValue('resetFirstName', 1)

'Launches the application\r\n'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Login or Sign Up" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of email into the login or sign-up field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Simulates a tap on the "Next" button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'inputs the value of email into the confirm email address field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Retrieves the text from the first name field and assigns it to enteredFirstName.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Retrieves the text from the first name field and assigns it to enteredFirstName.'
String enteredFirstName = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.EditText - JonathanChristopherMaximilianAlexanderMontgomeryWilliams'), 
    0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

' Simulates a tap on the "reset" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of resetFirstName into the first name field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), resetFirstName, 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of resetFirstName into the first name field again.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), resetFirstName, 0)

'Hides on the screen keyboard'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Retrieves the text from the error message element and assigns it to errorMessage.'
String errorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  First name must be 50 characters or less'), 
    0)

'Processes the errorMessage to ensure it is in the correct format.'
errorMessage = errorMessage.trim()

'Prints the error message to the console.'
println('Error Message: ' + errorMessage)

'Defines the expected partial message as "First name must be 50 characters or less"'
String expectedPartialText = 'First name must be 50 characters or less'

'Asserts that the errorMessage contains the expected partial message.'
assert errorMessage.contains(expectedPartialText)

'Prints a success message if the assertion passes, including the actual error message.'
println("Error message assertion passed. Actual message: '$errorMessage'")

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Verifies the presence or state of a text view element displaying the error message.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView -  First name must be 50 characters or less'), 
    0)

'Closes the application.'
Mobile.closeApplication()

