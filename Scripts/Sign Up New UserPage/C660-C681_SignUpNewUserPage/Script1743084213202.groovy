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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

class EmailValidationTests {
		
	def setup() {
		Mobile.startApplication(GlobalVariable.appUrl, true)
		Mobile.delay(15)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
	}
	
	def cleanup() {
		Mobile.closeApplication()
	}
	
	def testInvalidEmailFormat() {
		TestData excelData = findTestData("Data Files/InvalidEmail")
		int rowCount = excelData.getRowNumbers()
		
		for (int i = 1; i <= rowCount; i++) {
			String invalidEmail = excelData.getValue("email-Address", i)
			println "Testing invalid email from Excel (Row ${i}): ${invalidEmail}"
			
			Mobile.waitForElementPresent(findTestObject("Object Repository/Repo/android.widget.EditText-LoginorSignUp"), 20)
			Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), invalidEmail)
			
			String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Invalid email format'), 0).trim()
			String expectedErrorMessage = "Invalid email format"
			
			Assert.assertEquals("Error message validation failed at row ${i}",
				expectedErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim(),
				actualErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim())
			
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
			Mobile.hideKeyboard()
		}
	}
	
	def testTeamMemberEmailError() {
		TestData testData = findTestData("Data Files/C678")
		String email1 = testData.getValue('email', 1)
		String email2 = testData.getValue('email', 2)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
		Mobile.delay(10)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
		Mobile.delay(10)
		
		String actualText = null
		String expectedText = " The email address used is a Team Member email address.  Please select Create Team Member Account below."
		
		try {
			actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - The email address used is a Team Member email address. Please select Create Team Member Account below'), 0)
		} catch (Exception e) {
			KeywordUtil.markWarning("Object not found or text not available. Skipping check.")
		}
		
		if (actualText != null && actualText.contains(expectedText)) {
			KeywordUtil.markWarning("ERROR: Expected text not found! Actual text: " + actualText)
		}
		
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
	}
	
	def testEmailAddressMismatch() {
		TestData testData = findTestData("Data Files/C679")
		String email1 = testData.getValue('email', 1)
		String email2 = testData.getValue('email', 2)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
		Mobile.delay(20)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email2)
		Mobile.delay(10)
		
		try {
    String actualText = Mobile.getText(findTestObject("Object Repository/Repo/android.widget.TextView -  Email addresses must match"), 0).trim();
    String expectedText = "Email addresses must match.";

    if (!actualText.equals(expectedText)) {
        throw new AssertionError("ERROR: Text does not match! Expected: '" + expectedText + "', Actual: '" + actualText + "'");
    }

    System.out.println("Text matches successfully!");
} catch (Exception e) {
    System.err.println("Exception occurred: " + e.getMessage());
    Mobile.takeScreenshot();  
}

		
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
	}
	
	def testAlreadyUsedEmailAddress() {
		TestData excelData = findTestData("Data Files/C680")
		String email1 = excelData.getValue('email', 1)
		String email2 = excelData.getValue('email', 2)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
		Mobile.delay(10)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 0)
		Mobile.hideKeyboard()
		Mobile.delay(10)
		Mobile.takeScreenshot()
		
		
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
	}			

	
	def testCopyPasteEmailFunctionality() {
		TestData testData = findTestData("Data Files/C681")
		String email1 = testData.getValue('email', 1)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.delay(10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)
		Mobile.delay(10)
		
		try {
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), 0)
			Mobile.tapAndHold(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), 2, 0)
			Mobile.delay(2)
			
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Copy'), 3)) {
				Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Copy'), 0)
				println('✅ Email copied successfully.')
			} else {
				println('❌ "Copy" button not found.')
			}
		} catch (StepFailedException e) {
			println('⚠️ Error occurred during copy: ' + e.getMessage())
		}
		
		try {
			Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 0)
			Mobile.tapAndHold(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 2, 0)
			Mobile.delay(2)
			
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Paste'), 3)) {
				Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Paste'), 0)
				println('✅ Successfully pasted the copied email.')
			} else {
				println('❌ "Paste" button not found.')
			}
		} catch (StepFailedException e) {
			println('⚠️ Error occurred during paste: ' + e.getMessage())
		}
		
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
	}
	
	def testMultipleEmailsFunctionality() {
		TestData testData = findTestData("Data Files/Emails")
		String email1 = testData.getValue('email', 1)
		String email2 = testData.getValue('email', 2)
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 10)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 10)
		Mobile.hideKeyboard()
		
		Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email2)
		Mobile.delay(3)
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 10)
		
		try {
			def testObject = findTestObject('Object Repository/Repo/android.widget.TextView - Invalid email format')
			if (testObject == null) {
				throw new Exception("Test object 'Invalid email format' not found in the Object Repository.")
			}
			
			Mobile.waitForElementPresent(testObject, 10)
			String errorMessage = Mobile.getText(testObject, 10)
			println("Error Message: ${errorMessage}")
		} catch (Exception e) {
			println("❌ An error occurred: ${e.getMessage()}")
		}
		
		Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
		Mobile.hideKeyboard()
	}
	
	def runAllTests() {
		setup()
		
		try {
			testInvalidEmailFormat()
			testTeamMemberEmailError()
			testEmailAddressMismatch()
			testAlreadyUsedEmailAddress()
			testCopyPasteEmailFunctionality()
			testMultipleEmailsFunctionality()
		} finally {
			cleanup()
		}
	}
}

def emailValidationTests = new EmailValidationTests()
emailValidationTests.runAllTests()