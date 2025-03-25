import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

'Initializes testData by finding the test data file located at "Data Files"'
TestData testData = findTestData('Data Files/C698-C696 (1)')

'Retrieves the value of the "email" field from the first row of the test data and assigns it to the variable email.'
String email = testData.getValue('email', 1)

'Retrieves the value of the "firstname" field from the first row of the test data and assigns it to the variable firstName.'
String firstName = testData.getValue('firstname', 1)

'Retrieves the value of the "lastname" field from the first row of the test data and assigns it to the variable lastName.'
String lastName = testData.getValue('lastname', 1)

'Retrieves the value of the "password" field from the first row of the test data and assigns it to the variable password.'
String password = testData.getValue('password', 1)

'Retrieves the value of the "confirmpassword" field from the first row of the test data and assigns it to the variable confirmPassword.'
String confirmPassword = testData.getValue('confirmpassword', 1)

' Launches the application located at "C:\\Users\\Oi\\Vignesh\\gd\\WKBK_Android\\App Folder'
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

'Inputs the value of email into the confirm email address field.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Pauses the execution for 20 seconds.'
Mobile.delay(20)

'Inputs the value of firstName into the first name field.\r\n\r\n'
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

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

' Simulates key presses in the confirm password field.'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Simulates a tap on the "Next" button.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Scroll down\r\n'
Mobile.scrollToText('etc).')

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Tap on Agree to terms and conditions'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Agree to Terms  Conditions'), 0)

'Pauses the execution for 30 seconds.'
Mobile.delay(30)

'Enter email in OAM webview'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 30 seconds.'
Mobile.delay(30)

'Enter password in OAM webview'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hides the on-screen keyboard.'
Mobile.hideKeyboard()

'Pauses the execution for 30 seconds.'
Mobile.delay(30)

'Tap on Login Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - LOGIN'), 0)

'Pauses the execution for 30 seconds.'
Mobile.delay(30)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Verify element present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 
    0)

String elementText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 
    0).trim()

println('Text of the element: ' + elementText)

String expectedText = 'Resend Confirmation Email'.trim()

assert elementText.equals(expectedText)

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Tap on resend confirmation mail button\r\n'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Resend Confirmation Email'), 0)

'Verify Nwxt button exists\r\n'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Next (3)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Tap on Next Button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (3)'), 0)

'Pauses the execution for 5 seconds.'
Mobile.delay(5)

'Print the assertion result'
println('All text assertions passed successfully!')

'Pauses the execution for 10 seconds.'
Mobile.delay(10)

'Close the application'
Mobile.closeApplication()

