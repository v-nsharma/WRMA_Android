import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Initializes testData by finding the test data file located at "Data Files/CS82 (1)".'
TestData testData = findTestData('Data Files/C682 (1)')

'Retrieves the value of the "email" field from the test data and assigns it to the variable email.'
String email = testData.getValue('email', 1)

'Retrieves the value of the "firstname" field from the second row of the test data and assigns it to the variable firstname.'
String firstname = testData.getValue('firstname', 1)

'Retrieves the value of the "lastname" field from the second row of the test data and assigns it to the variable lastname.'
String lastname = testData.getValue('lastname', 1)

'Launches the application'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Login or Sign Up" button in the Android application.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Pauses the execution for 10 seconds, waiting for the email input field to be ready.'
Mobile.delay(10)

'Inputs the value of email into the email field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Simulates a tap on the "confirm email address" field.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Pauses the execution for 10 seconds, waiting for the "confirm email address" field to be ready.'
Mobile.delay(10)

'Inputs the value of email into the "confirm email address" field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Simulates a tap on the "FirstName" field.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Inputs the value of firstname into the "FirstName" field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstname, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(10)

'Simulates a tap on the "LastName" field.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Inputs the value of lastname into the "LastName" field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastname, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(5)

'Simulates a tap on the "LastName" field, which is expected to show an error message.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Attempts to interact with a text view element that displays an error message.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView -  Names cannot contain numbers'), 
    0)

'Pauses the execution for 5 seconds, waiting for the "Next" button to be ready.'
Mobile.delay(5)

'Retrieves the text from the error message element and assigns it to actualErrorMessage'
String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Names cannot contain numbers'), 
    0)

'Compares actualErrorMessage with expectedPortailText'
String expectedPartialText = ' Names cannot contain numbers.'

'Prints the actual error message to the console.'
assert actualErrorMessage.contains(expectedPartialText)

'Prints the expected partial text to the console.'
println('Actual Error Message: ' + actualErrorMessage)

'Likely another method call, possibly for logging or further assertions.'
println('Expected Partial Text: ' + expectedPartialText)

'Pauses the execution for a specified amount of time.'
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - back-NewUserRegistrationPage'), 0)

Mobile.closeApplication()


