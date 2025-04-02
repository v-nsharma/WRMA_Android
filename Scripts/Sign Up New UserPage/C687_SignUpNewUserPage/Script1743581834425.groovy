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

'Initializes testData by finding the test data file located at "Data Files"\r\n'
TestData testData = findTestData('Data Files/C687')

'Retrieves the value of the "email" field from the test data and assigns it to the variable email.'
String email = testData.getValue('email', 1)

'Retrieves the value of the "firstName" field from the test data and assigns it to the variable firstName.'
String firstName = testData.getValue('firstName', 1)

'Retrieves the value of the "lastName" field from the test data and assigns it to the variable lastName.'
String lastName = testData.getValue('lastName', 1)

'Retrieves the value of the "password" field from the test data and assigns it to the variable password.'
String password = testData.getValue('password', 1)

'Retrieves the value of the "confirmPassword" field from the test data and assigns it to the variable confirmPassword.'
String confirmPassword = testData.getValue('confirmPassword', 1)

'Launches the application'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Login or Sign Up" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of email into the login or sign-up field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 20 seconds.'
Mobile.delay(20)

'Inputs the value of email into the confirm email address field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of firstName into the first name field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of lastName into the last name field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates key presses in the password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates key presses in the confirm password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Verifies the presence or state of the "Next" button.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (3)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Retrieves the text from the "Terms and Conditions" element '
String termsText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions'), 
    0)

'Prints the retrieved text to the console.'
println('Retrieved Terms and Conditions Text: ' + termsText)

'Defines the expected text as "Terms and Conditions" and compares it with the retrieved text.'
String expectedTermsText = 'Terms and Conditions'

'Asserts that the retrieved text matches the expected text.'
assert termsText.trim() == expectedTermsText

'Prints a success message if the assertion passes.'
println("Terms and Conditions text assertion passed. Actual text: '$termsText'")

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Closes the application.'
Mobile.closeApplication()

