import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import org.junit.Assert

class UserRegistrationTests {
	
	private static final String APK_PATH = '/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk'
	
	def testNameValidationWithNumbers() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(20)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'C682') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String firstName = testData.getValue('FirstName', row)
				String lastName = testData.getValue('LastName', row)
				
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
				Mobile.delay(20)
				
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
				Assert.assertTrue("Name validation error not displayed correctly", actualErrorMessage.contains(expectedPartialText))
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def testPasswordRequirementsValidation() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'C683' || testCaseID == 'C684') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String firstName = testData.getValue('FirstName', row)
				String lastName = testData.getValue('LastName', row)
				String password = testData.getValue('Password', row)
				String confirmPassword = testData.getValue('ConfirmPassword', row)
				
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
				Mobile.delay(20)
				
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
				Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
				
				'Tap on registration button to trigger validation'
				Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - New User Registration'), 0)
				Mobile.delay(5)
				
				'Verify password requirements error message'
				String errorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Password does not meet security requirements'), 0)
				String expectedPasswordText = 'Password does not meet security requirements'
				Assert.assertTrue("Password validation error not displayed correctly", errorMessage.contains(expectedPasswordText))
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def testPasswordMismatchValidation() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'C685') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String firstName = testData.getValue('FirstName', row)
				String lastName = testData.getValue('LastName', row)
				String password = testData.getValue('Password', row)
				String confirmPassword = testData.getValue('ConfirmPassword', row)
				
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
				Mobile.delay(20)
				
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
				Assert.assertTrue("Password mismatch error not displayed correctly", mismatchError.contains(expectedMismatchText))
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def testFirstNameLengthValidation() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'C686') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String firstName = testData.getValue('FirstName', row)
				String resetFirstName = testData.getValue('ResetFirstName (for CS86)', row)
				
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
				Mobile.delay(20)
				
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
				Mobile.delay(20)
				
				'Verify name length error message'
				String nameLengthError = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  First name must be 50 characters or less'), 0)
				String expectedLengthText = 'First name must be 50 characters or less'
				Assert.assertTrue("Name length validation error not displayed correctly", nameLengthError.contains(expectedLengthText))
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def testTermsAndConditionsNavigation() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'C687') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String firstName = testData.getValue('FirstName', row)
				String lastName = testData.getValue('LastName', row)
				String password = testData.getValue('Password', row)
				String confirmPassword = testData.getValue('ConfirmPassword', row)
				
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
				Mobile.delay(20)
				
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
				Assert.assertEquals("Not navigated to Terms and Conditions page", "Terms and Conditions", termsText.trim())
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def testLastNameValidationWithoutFirstName() {
		'Retrieve test data'
		TestData testData = findTestData('Data Files/C682-688')
		
		'Launch the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on Login/Sign Up button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(20)
		
		for (int row = 1; row <= testData.getRowNumbers(); row++) {
			String testCaseID = testData.getValue('TestCaseID', row)
			
			if (testCaseID == 'CS88') {
				String email = testData.getValue('Email', row)
				String username = testData.getValue('Username', row)
				String lastName = testData.getValue('LastName', row)
				String password = testData.getValue('Password', row)
				String confirmPassword = testData.getValue('ConfirmPassword', row)
				
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
				Mobile.delay(20)
				
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
					Assert.fail("Next button should not be clickable without first name")
				} catch (Exception e) {
					println("Next button is not clickable as expected")
				}
				
				break
			}
		}
		
		'Close application'
		Mobile.closeApplication()
	}
	
	def runAllTests() {
		testNameValidationWithNumbers()
		testPasswordRequirementsValidation()
		testPasswordMismatchValidation()
		testFirstNameLengthValidation()
		testTermsAndConditionsNavigation()
		testLastNameValidationWithoutFirstName()
	}
}

def userRegistrationTests = new UserRegistrationTests()
userRegistrationTests.runAllTests()