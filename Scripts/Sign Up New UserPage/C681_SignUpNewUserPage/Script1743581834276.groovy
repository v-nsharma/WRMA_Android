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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

'Retrieve test data from the "C681" file'
TestData testData = findTestData("Data Files/C681")

'Extract the first email from the test data file'
String email1 = testData.getValue('email', 1)

'Launch the application on the mobile device'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)

'Tap on the "Login or Sign-Up" button to navigate to the login page'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to allow UI elements to load'
Mobile.delay(10)

'Enter the correct email in the Email Address input field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)

'Wait for 10 seconds to ensure email entry is processed'
Mobile.delay(10)

'Tap on the "Next" button to navigate to the New User page'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Wait for 20 seconds to allow the New User page to load'
Mobile.delay(20)

'Try to copy the initially entered email address using a Tap-and-Hold action'
Mobile.tapAndHold(findTestObject('Object Repository/Repo/android.widget.EditText - vt.com'), 0, 0)

'Attempt to copy the email address'
try {
	'Tap on the email text field'
	Mobile.tap(findTestObject('Object Repository/TextField'), 0)
	println('✅ Tapped on the text field.')

	'Perform a tap-and-hold action to bring up the copy menu'
	Mobile.tapAndHold(findTestObject('Object Repository/TextField'), 2, 0)
	println('✅ Tap-and-hold action performed.')

	'Wait for 2 seconds to ensure the copy menu appears'
	Mobile.delay(2)

	'Check if the "Copy" button is present'
	if (Mobile.waitForElementPresent(findTestObject('Object Repository/CopyButton'), 3)) {
		'Tap on the "Copy" button to copy the email'
		Mobile.tap(findTestObject('Object Repository/CopyButton'), 0)
		println('✅ Email copied successfully.')
	} else {
		println('❌ "Copy" button not found.')
	}
} catch (StepFailedException e) {
	'Log the error if copying fails'
	println('⚠️ Error occurred: ' + e.getMessage())
}

'Attempt to paste the copied email into the Confirm Email Address field'
try {
	'Tap on the Confirm Email Address field'
	Mobile.tap(findTestObject('Object Repository/ConfirmEmailField'), 0)
	println('✅ Tapped on Confirm Email Address field.')

	'Perform a tap-and-hold action to bring up the paste menu'
	Mobile.tapAndHold(findTestObject('Object Repository/ConfirmEmailField'), 2, 0)
	println('✅ Tap-and-hold performed to show paste option.')

	'Wait for 2 seconds to ensure the paste menu appears'
	Mobile.delay(2)

	'Check if the "Paste" button is present'
	if (Mobile.waitForElementPresent(findTestObject('Object Repository/PasteButton'), 3)) {
		'Tap on the "Paste" button to paste the copied email'
		Mobile.tap(findTestObject('Object Repository/PasteButton'), 0)
		println('✅ Successfully pasted the copied email.')
	} else {
		println('❌ "Paste" button not found. User must manually enter the email again.')
	}
} catch (StepFailedException e) {
	'Log the error if pasting fails'
	println('⚠️ Error occurred: ' + e.getMessage())
}

'Close the application after completing the test'
Mobile.closeApplication()
