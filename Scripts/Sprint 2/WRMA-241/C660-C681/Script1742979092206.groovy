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
import com.kms.katalon.core.exception.StepFailedException
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
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import org.junit.Assert
import com.kms.katalon.core.exception.StepFailedException


class EmailValidationTests {
	
	private static final String APK_PATH = 'C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk'
	
	def testInvalidEmailFormat() {
		'Retrieve test data from "InvalidEmail" Excel file'
		TestData excelData = findTestData("Data Files/InvalidEmail")
		
		'Get the total number of rows available in the Excel sheet'
		int rowCount = excelData.getRowNumbers()
		
		'Start the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(5)
		
		'Tap on the "Login or Sign Up" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		
		'Loop through each row in the Excel sheet'
		for (int i = 1; i <= rowCount; i++) {
			'Fetch the invalid email from the current row'
			String invalidEmail = excelData.getValue("email-Address", i)
			
			println "Testing invalid email from Excel (Row ${i}): ${invalidEmail}"
			
			'Wait for the email input field'
			Mobile.waitForElementPresent(findTestObject("Object Repository/Repo/android.widget.EditText-LoginorSignUp"), 20)
			
			'Enter the invalid email'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), invalidEmail)
			
			'Retrieve the actual error message'
			String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Invalid email format'), 0).trim()
			
			'Define the expected error message'
			String expectedErrorMessage = "Invalid email format"
			
			'Compare actual and expected error messages'
			Assert.assertEquals("Error message validation failed at row ${i}",
				expectedErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim(),
				actualErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim())
		}
		
		'Close the mobile application'
		Mobile.closeApplication()
	}
	
	def testTeamMemberEmailError() {
		'Retrieve test data from "C678" file'
		TestData testData = findTestData("Data Files/C678")
		
		'Extract emails from the test data file'
		String email1 = testData.getValue('email', 1)
		String email2 = testData.getValue('email', 2)
		
		'Start the mobile application'
		Mobile.startApplication(APK_PATH, false)
		Mobile.delay(10)
		
		'Tap on the "Login or Sign Up" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(10)
		
		'Enter the first email'
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		
		'Tap on the "Next" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
		Mobile.delay(10)
		
		'Tap on the "Reset" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
		Mobile.delay(10)
		
		'Enter the second email'
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)
		Mobile.delay(10)
		
		'Tap on the "Next" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
		Mobile.delay(10)
		
		'Retrieve the actual error message'
		String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  The email address used is a Team Member email address.  Please select Create Team Member Account below'), 0)
		
		'Define the expected error message'
		String expectedText = " The email address used is a Team Member email address.  Please select Create Team Member Account below."
		
		'Verify the error message'
		assert actualText.contains(expectedText) : "ERROR: Expected text not found! Actual text: " + actualText
		
		'Close the mobile application'
		Mobile.closeApplication()
	}
	
	def testEmailAddressMismatch() {
		'Retrieve test data from the "C679" file'
		TestData testData = findTestData("Data Files/C679")
		
		'Get the total number of rows in the test data file'
		int rowCount = testData.getRowNumbers()
		
		'Loop through the test data file'
		for (int i = 1; i <= rowCount; i++) {
			'Retrieve emails from the test data file'
			String email1 = testData.getValue('email', i)
			String email2 = testData.getValue('email', i+1)
			
			'Launch the application'
			Mobile.startApplication(APK_PATH, false)
			Mobile.delay(10)
			
			'Tap on the "Login or Sign-Up" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
			Mobile.delay(10)
			
			'Enter the first email'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
			Mobile.delay(10)
			
			'Tap the "Next" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
			Mobile.delay(10)
			
			'Enter the second email'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email2)
			Mobile.delay(10)
			
			'Retrieve the actual error message'
			String actualText = Mobile.getText(findTestObject("Object Repository/Repo/android.widget.TextView -  Email addresses must match"), 0).trim()
			
			'Define the expected error message'
			String expectedText = "Email addresses must match."
			
			'Verify the error message'
			assert actualText == expectedText : "ERROR: Text does not match! Expected: '${expectedText}', Actual: '${actualText}'"
			
			'Close the application'
			Mobile.closeApplication()
			
			'Exit the loop after the first iteration'
			break
		}
	}
	
	def testAlreadyUsedEmailAddress() {
		'Retrieve test data from the "C680" file'
		TestData excelData = findTestData("Data Files/C680")
		
		'Get the total number of rows in the test data file'
		int rowCount = excelData.getRowNumbers()
		
		'Loop through the first two rows of the test data file'
		for (int i = 1; i <= 2; i++) {
			'Retrieve emails from the test data file'
			String email1 = excelData.getValue('email', i)
			String email2 = excelData.getValue('email', i+1)
			
			'Launch the application'
			Mobile.startApplication(APK_PATH, false)
			Mobile.delay(10)
			
			'Tap on the "Login or Sign-Up" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
			Mobile.delay(10)
			
			'Enter the first email'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
			Mobile.delay(10)
			
			'Tap the "Next" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
			Mobile.delay(10)
			
			'Tap the Reset button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
			Mobile.hideKeyboard()
			Mobile.delay(10)
			
			'Enter the second email'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)
			Mobile.delay(10)
			
			'Tap on the Next button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 0)
			Mobile.hideKeyboard()
			Mobile.delay(10)
			
			'Retrieve the actual error message'
			String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  The email address is already in use'), 0)
			
			'Define the expected error message'
			String expectedText = " The email address is already in use."
			
			'Verify the error message'
			assert actualText.contains(expectedText) : "ERROR: Expected text not found! Actual text: " + actualText
			
			'Close the application'
			Mobile.closeApplication()
			
			'Exit the loop after the first iteration'
			break
		}
	}
	
	def testCopyPasteEmailFunctionality() {
		'Retrieve test data from the "C681" file'
		TestData testData = findTestData("Data Files/C681")
		
		'Extract the first email from the test data file'
		String email1 = testData.getValue('email', 1)
		
		'Launch the application'
		Mobile.startApplication(APK_PATH, false)
		
		'Tap on the "Login or Sign-Up" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
		Mobile.delay(10)
		
		'Enter the correct email'
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		
		'Tap on the "Next" button'
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
		Mobile.delay(10)
		
		'Try to copy the email address'
		try {
			Mobile.tap(findTestObject('Object Repository/TextField'), 0)
			Mobile.tapAndHold(findTestObject('Object Repository/TextField'), 2, 0)
			Mobile.delay(2)
			
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/CopyButton'), 3)) {
				Mobile.tap(findTestObject('Object Repository/CopyButton'), 0)
				println('✅ Email copied successfully.')
			} else {
				println('❌ "Copy" button not found.')
			}
		} catch (StepFailedException e) {
			println('⚠️ Error occurred during copy: ' + e.getMessage())
		}
		
		'Try to paste the copied email'
		try {
			Mobile.tap(findTestObject('Object Repository/ConfirmEmailField'), 0)
			Mobile.tapAndHold(findTestObject('Object Repository/ConfirmEmailField'), 2, 0)
			Mobile.delay(2)
			
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/PasteButton'), 3)) {
				Mobile.tap(findTestObject('Object Repository/PasteButton'), 0)
				println('✅ Successfully pasted the copied email.')
			} else {
				println('❌ "Paste" button not found.')
			}
		} catch (StepFailedException e) {
			println('⚠️ Error occurred during paste: ' + e.getMessage())
		}
		
		'Close the application'
		Mobile.closeApplication()
	}
	
	def testMultipleEmailsFunctionality() {
		'Retrieve test data from "Emails" file'
         TestData excelData = findTestData("Data Files/Emails");

		try {
			'Start the mobile application'
			Mobile.startApplication(APK_PATH, false)

			'Tap on the "Login or Sign Up" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 10, FailureHandling.STOP_ON_FAILURE)

			'Retrieve test data from the "C681" file'
			TestData testData = findTestData("Data Files/Emails")
			
			'Extract the first email from the test data file'
			String email1 = testData.getValue('email', 1)

			'Enter the first email into the email input field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1, FailureHandling.STOP_ON_FAILURE)

			'Tap on the "Next" button'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 10, FailureHandling.STOP_ON_FAILURE)

			'Tap on the "Reset" button to clear the email field'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 10, FailureHandling.STOP_ON_FAILURE)

			'Hide the keyboard'
			Mobile.hideKeyboard()

			'Retrieve the second email from the test data file'
			String email2 = testData.getValue('email', 2)
			println("Second Email: ${email2}")

			'Enter the second email into the confirm email address field'
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email2, FailureHandling.STOP_ON_FAILURE)

			'Wait for UI changes'
			Mobile.delay(3)

			'Tap on the confirm email input field to trigger validation'
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 10, FailureHandling.STOP_ON_FAILURE)

			try {
				'Locate the test object for the invalid email format error message'
				def testObject = findTestObject('Object Repository/Repo/android.widget.TextView - Invalid email format')
				
				'Throw an error if the test object is not found'
				if (testObject == null) {
					throw new Exception("Test object 'Invalid email format' not found in the Object Repository.")
				}
				
				'Print the located test object'
				println("Test object found: ${testObject}")

				'Wait for the error message'
				Mobile.waitForElementPresent(testObject, 10, FailureHandling.STOP_ON_FAILURE)

				'Retrieve the actual error message'
				String errorMessage = Mobile.getText(testObject, 10, FailureHandling.STOP_ON_FAILURE)
				println("Error Message: ${errorMessage}")

			} catch (Exception e) {
				'Handle exception if error message object is not found'
				println("❌ An error occurred: ${e.getMessage()}")
			}

		} catch (StepFailedException e) {
			'Handle step failure exception'
			println("❌ An error occurred: ${e.getMessage()}")
		}

		'Close the mobile application'
		Mobile.closeApplication()
	}
	
	def runAllTests() {
		testInvalidEmailFormat()
		testTeamMemberEmailError()
		testEmailAddressMismatch()
		testAlreadyUsedEmailAddress()
		testCopyPasteEmailFunctionality()
		testMultipleEmailsFunctionality()
	}
}

def emailValidationTests = new EmailValidationTests()
emailValidationTests.runAllTests()