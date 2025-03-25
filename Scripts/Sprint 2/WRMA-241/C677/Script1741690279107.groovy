import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory // Import for findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ObjectRepository

'Retrieve test data from "Emails" file using TestDataFactory'
TestData emails = TestDataFactory.findTestData("Data Files/Emails")

try {
	'Start the mobile application using the specified APK file'
	Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

	'Tap on the "Login or Sign Up" button to navigate to the login screen'
	Mobile.tap(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 10, FailureHandling.STOP_ON_FAILURE)

	'Retrieve the first email from the test data file'
	String email1 = emails.getValue("email", 1)
	println("First Email: ${email1}")

	'Enter the first email into the email input field'
	Mobile.sendKeys(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1, FailureHandling.STOP_ON_FAILURE)

	'Tap on the "Next" button to proceed with email entry'
	Mobile.tap(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 10, FailureHandling.STOP_ON_FAILURE)

	'Tap on the "Reset" button to clear the email field'
	Mobile.tap(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.Button - reset'), 10, FailureHandling.STOP_ON_FAILURE)

	'Hide the keyboard to ensure UI elements are visible'
	Mobile.hideKeyboard()

	'Retrieve the second email from the test data file'
	String email2 = emails.getValue("email", 2)
	println("Second Email: ${email2}")

	'Enter the second email into the confirm email address field'
	Mobile.sendKeys(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), email2, FailureHandling.STOP_ON_FAILURE)

	'Wait for 3 seconds to allow UI changes to reflect'
	Mobile.delay(3)

	'Tap on the confirm email input field to trigger validation'
	Mobile.tap(ObjectRepository.findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 10, FailureHandling.STOP_ON_FAILURE)

	try {
		'Locate the test object for the invalid email format error message'
		def testObject = ObjectRepository.findTestObject('Object Repository/Repo/android.widget.TextView - Invalid email format')
		
		'Throw an error if the test object is not found in the repository'
		if (testObject == null) {
			throw new Exception("Test object 'android.widget.TextView - Invalid email format' not found in the Object Repository.")
		}
		
		'Print the located test object'
		println("Test object found: ${testObject}")

		'Wait for the error message to appear on the screen'
		Mobile.waitForElementPresent(testObject, 10, FailureHandling.STOP_ON_FAILURE)

		'Retrieve the actual error message displayed in the UI'
		String errorMessage = Mobile.getText(testObject, 10, FailureHandling.STOP_ON_FAILURE)
		println("Error Message: ${errorMessage}")

	} catch (Exception e) {
		'Handle exception if error message object is not found and capture a screenshot for debugging'
		println("❌ An error occurred: ${e.getMessage()}")
		Mobile.takeScreenshot('C:\\Users\\GVVIGN~1\\AppData\\Local\\Temp\\error_screenshot.png')
	}

} catch (StepFailedException e) {
	'Handle step failure exception and capture a screenshot for debugging'
	println("❌ An error occurred: ${e.getMessage()}")
	Mobile.takeScreenshot('C:\\Users\\GVVIGN~1\\AppData\\Local\\Temp\\error_screenshot.png')
}

'Close the mobile application after execution'
Mobile.closeApplication()