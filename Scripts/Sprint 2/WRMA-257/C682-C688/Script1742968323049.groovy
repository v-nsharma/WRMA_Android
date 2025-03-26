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
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Initialize test data from Excel file'
TestData testData = findTestData('Data Files/C682-688')

'Launch the mobile application'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)
Mobile.delay(10)

'Get total number of test cases from Excel'
int rowCount = testData.getRowNumbers()

'Iterate through each test case'
for (int row = 1; row <= rowCount; row++) {
	'Read test case ID from Excel'
	String testCaseID = testData.getValue('TestCaseID', row)
	
	'Read test data parameters from Excel'
	String email = testData.getValue('Email', row)
	String username = testData.getValue('Username', row)
	String firstName = testData.getValue('FirstName', row)
	String lastName = testData.getValue('LastName', row)
	String password = testData.getValue('Password', row)
	String confirmPassword = testData.getValue('ConfirmPassword', row)
	String resetFirstName = testData.getValue('ResetFirstName (for CS86)', row)

	'Log current test case execution'
	println("Executing Test Case: $testCaseID")
	
	'Tap on Login/Sign Up button'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
	Mobile.delay(5)
	
	'Enter email address in email field'
	Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)
	Mobile.hideKeyboard()
	Mobile.delay(5)
	
	'Tap Next button after email entry'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
	Mobile.delay(5)
	
	'Enter username in confirmation field'
	Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), username, 0)
	Mobile.hideKeyboard()
	Mobile.delay(5)
	
	'Tap Next button after username entry'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
	Mobile.delay(10)
	
	'Execute test case specific validations'
	switch(testCaseID) {
		case 'C682':
			'C682: Verify name with numbers validation'
			'Enter first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter last name in last name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Tap Next button to trigger validation'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)
			
			'Verify name validation error message'
			String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Names cannot contain numbers'), 0)
			String expectedPartialText = 'Names cannot contain numbers.'
			assert actualErrorMessage.contains(expectedPartialText)
			println("Test Case $testCaseID Passed: Name validation error displayed correctly")
			break
			
		case 'C683':
		case 'C684':
			'C683/C684: Verify password requirements validation'
			'Enter first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter last name in last name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter password in password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)
			Mobile.delay(5)
			
			'Enter confirm password in confirm password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)
			Mobile.delay(5)
			
			'Tap on password requirements text'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'),
				0)
			
			'Tap on registration button to trigger validation'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - New User Registration'), 0)
			Mobile.delay(5)
			
			'Verify password requirements error message'
			String errorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 0)
			String expectedPasswordText = 'Password does not meet security requirements'
			assert errorMessage.contains(expectedPasswordText)
			println("Test Case $testCaseID Passed: Password validation error displayed correctly")
			break
			
		case 'C685':
			'C685: Verify password mismatch validation'
			'Enter first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter last name in last name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter password in password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)
			Mobile.delay(5)
			
			'Enter different password in confirm password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)
			Mobile.delay(5)
			
			'Verify password mismatch error message'
			String mismatchError = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Passwords must match'), 0).trim()
			String expectedMismatchText = 'Passwords must match'
			assert mismatchError.contains(expectedMismatchText)
			println("Test Case $testCaseID Passed: Password mismatch error displayed correctly")
			break
			
		case 'C686':
			'C686: Verify first name length validation'
			'Enter first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Tap on reset button to clear field'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
			Mobile.delay(5)
			
			'Enter long first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), resetFirstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Re-enter long first name for verification'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), resetFirstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Tap Next button to trigger validation'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
			Mobile.delay(10)
			
			'Verify name length error message'
			String nameLengthError = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  First name must be 50 characters or less'), 0)
			String expectedLengthText = 'First name must be 50 characters or less'
			assert nameLengthError.contains(expectedLengthText)
			println("Test Case $testCaseID Passed: Name length validation error displayed correctly")
			break
			
		case 'C687':
			'C687: Verify successful navigation to Terms and Conditions'
			'Enter first name in first name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), firstName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter last name in last name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter password in password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)
			Mobile.delay(5)
			
			'Enter confirm password in confirm password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)
			Mobile.delay(5)
			
			'Tap Next button to proceed'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)
			Mobile.delay(5)
			
			'Verify Terms and Conditions page is displayed'
			String termsText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions'), 0)
			assert termsText.trim() == 'Terms and Conditions'
			println("Test Case $testCaseID Passed: Successfully navigated to Terms and Conditions")
			break
			
		case 'CS88':
			'CS88: Verify last name validation without first name'
			'Enter last name in last name field'
			Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), lastName, 0)
			Mobile.hideKeyboard()
			Mobile.delay(5)
			
			'Enter password in password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), password)
			Mobile.delay(5)
			
			'Enter confirm password in confirm password field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-ConfirmPassword'), confirmPassword)
			Mobile.delay(5)
			
			'Verify Next button is disabled when first name is missing'
			try {
				Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (2)'), 0)
				println("Test Case $testCaseID Failed: Next button should not be clickable without first name")
				assert false
			} catch (Exception e) {
				println("Test Case $testCaseID Passed: Next button is not clickable as expected")
				assert true
			}
			break
			
		default:
			'Handle unknown test case ID'
			println("Unknown Test Case ID: $testCaseID")
	}
	
	'Close application after each test case'
	Mobile.closeApplication()
	Mobile.delay(2)
	
	'Re-launch application for next test case'
	Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)
	Mobile.delay(5)
}

'Final application closure after all test cases'
Mobile.closeApplication()