import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Initializes testData by finding the test data file located at "Data Files/C485 (1)".'
TestData testData = findTestData('Data Files/C685 (1)')

'Retrieves the value of the "Email" field from the test data and assigns it to the variable email.'
String email = testData.getValue('Email', 1)

'Retrieves the value of the "Username" field from the test data and assigns it to the variable username.'
String username = testData.getValue('Username', 1)

'Retrieves the value of the "FirstName" field from the test data and assigns it to the variable firstName.'
String firstName = testData.getValue('FirstName', 1)

'Retrieves the value of the "LastName" field from the test data and assigns it to the variable lastName.'
String lastName = testData.getValue('LastName', 1)

'Retrieves the value of the "Password" field from the test data and assigns it to the variable password.'
String password = testData.getValue('Password', 1)

'Retrieves the value of the "ConfirmPassword" field from the test data and assigns it to the variable confirmPassword.'
String confirmPassword = testData.getValue('ConfirmPassword', 1)

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

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Inputs the value of username into the confirm email address field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), username, 0)

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

'Retrieves the text from a specified element and assigns it to actualErrorMessage.'
String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Passwords must match'), 
    0).trim()

'Defines the expected partial message as "Password must match".'
String expectedPartialMessage = 'Passwords must match'

'Asserts that the actual error message contains the expected partial message'
assert actualErrorMessage.contains(expectedPartialMessage)

'Prints the actual error message to the console.'
println("Actual Error Message: '$actualErrorMessage'")

'Verifies the presence or state of a text view element displaying the error message.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView -  Passwords must match'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Closes the application.'
Mobile.closeApplication()

