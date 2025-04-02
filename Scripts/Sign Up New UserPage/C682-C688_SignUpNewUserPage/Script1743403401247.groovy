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

'Start the application using the specified APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)
Mobile.delay(10)

'Tap on the Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next'), 0)
Mobile.delay(3)

'Enter email address again for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering confirmation email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to continue'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name in the first name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (2)'), 'steve', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name in the last name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (3)'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter too short password to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (5)'), 'pass')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Verify that password does not meet security requirements error message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Password does not meet security requirements'), 0)
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name again'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (6)'), 'steve', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name again'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (7)'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter password that exceeds maximum length to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (8)'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on Confirm Password field'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Tap on Confirm Password field again'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Enter confirmation password that exceeds maximum length'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (9)'), '1234567890123456789012')
Mobile.delay(3)

'Tap on Confirm Password field again'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Tap on password hide/show icon'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image'), 0)
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on Confirm Password field'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Tap on password hide/show icon again'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image'), 0)
Mobile.delay(3)

'Tap on a view in the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.view.View'), 0)
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Enter password that exceeds maximum length again'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - 1234567890123456789012'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on Confirm Password field'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Tap on password hide/show icon'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image'), 0)
Mobile.delay(3)

'Tap on another password hide/show icon'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image'), 0)
Mobile.delay(3)

'Tap on a different view in the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.view.View (1)'), 0)
Mobile.delay(3)

'Enter password that exceeds maximum length again'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - 1234567890123456789012 (1)'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on another password hide/show icon'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image (1)'), 0)
Mobile.delay(3)

'Enter password that exceeds maximum length again'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - 1234567890123456789012 (2)'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on Account Email Address label'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Account Email Address'), 0)
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on password hide/show icon'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Image'), 0)
Mobile.delay(3)

'Enter password that exceeds maximum length again'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - 1234567890123456789012'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Tap on Confirm Password field'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Confirm Password'), 0)
Mobile.delay(3)

'Tap on password field'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - 1234567890123456789012 (1)'), 0)
Mobile.delay(3)

'Verify that password does not meet security requirements error message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Password does not meet security requirements'), 0)
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name that exceeds maximum length to test validation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (10)'), 'AlexanderMaximilianChristopherNathanielJonathanMontgomeryWilliams', 0)
Mobile.delay(3)

'Enter last name that exceeds maximum length to test validation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (11)'), 'AlexanderMaximilianChristopherNathanielJonathanMontgomeryWilliams', 0)
Mobile.delay(3)

'Tap on Next button to attempt to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (2)'), 0)
Mobile.delay(3)

'Verify that first name length error message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  First name must be 50 characters or less'), 0)
Mobile.delay(3)

'Verify that last name length error message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Last name must be 50 characters or less'), 0)
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name in the first name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (12)'), 'john', 0)
Mobile.delay(3)

'Enter valid password'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (13)'), 'password', 0)
Mobile.delay(3)

'Enter matching password in confirm password field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (14)'), 'password')
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (2)'), 0)
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name in the first name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (15)'), 'john', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name in the last name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (16)'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter valid password'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (17)'), 'password', 0)
Mobile.delay(3)

'Enter non-matching password in confirm password field to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (18)'), 'password1')
Mobile.delay(3)

'Tap on Next button to attempt to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (2)'), 0)
Mobile.delay(3)

'Verify that passwords must match error message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Passwords must match'), 0)
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Walterjr@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter last name in the first name field (swapped)'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (20)'), 'smith', 0)
Mobile.delay(3)

'Enter first name in the last name field (swapped)'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText - smith'), 'john', 0)
Mobile.delay(3)

'Enter valid password'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (21)'), 'password')
Mobile.delay(3)

'Enter matching password in confirm password field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (22)'), 'password')
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (3)'), 0)
Mobile.delay(3)

'Verify that Terms and Conditions page is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Terms and Conditions'), 0)
Mobile.delay(3)

'Close the application'
Mobile.closeApplication()
Mobile.delay(3)