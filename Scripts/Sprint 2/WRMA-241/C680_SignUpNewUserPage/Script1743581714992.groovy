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

'Retrieve test data from the "C680" file'
TestData excelData = findTestData("Data Files/C680");

'Get the total number of rows in the test data file'
int rowCount = excelData.getRowNumbers();

'Loop through the first two rows of the test data file'
for (int i = 1; i <= 2; i++) {

	'Retrieve the first email from the current row in the test data file'
	String email1 = excelData.getValue('email', i)

	'Retrieve the second email from the next row in the test data file'
	String email2 = excelData.getValue('email', i+1)

	'Launch the application on the mobile device'
	Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)
	
	'Wait for 10 seconds to allow the application to load completely'
	Mobile.delay(10)
	
	'Tap on the "Login or Sign-Up" button to navigate to the login page'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Enter the first email (correct email) in the email address input field'
	Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)
	
	'Wait for 10 seconds to allow input field processing'
	Mobile.delay(10)

	'Tap the "Next" button to navigate to the New User page'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Tap the Reset button to clear the input field'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Hide the keyboard to avoid UI interference'
	Mobile.hideKeyboard()
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Enter an already existing email address in the Email Address field'
	Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Tap on the Next button to proceed further'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 0)
	
	'Wait for 10 seconds before proceeding to the next step'
	Mobile.delay(10)

	'Hide the keyboard to ensure visibility of UI elements'
	Mobile.hideKeyboard()
	
	'Tap on the Next button again to confirm the entered email'
	Mobile.tap(findTestObject('Object Repository/Repo/android.widget.EditText-confirm email address'), 0)

	'Hide the keyboard again in case it reappears'
	Mobile.hideKeyboard()
	
	'Wait for 10 seconds before verifying the error message'
	Mobile.delay(10)

	'Retrieve the actual error message displayed on the screen'
	String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  The email address is already in use'), 0)

	'Define the expected error message for validation'
	String expectedText = " The email address is already in use."

	'Verify that the actual error message matches the expected error message'
	assert actualText.contains(expectedText) : "ERROR: Expected text not found! Actual text: " + actualText

	'Wait for 5 seconds before closing the application'
	Mobile.delay(5)

	'Close the application after the test is completed'
	Mobile.closeApplication()

	'Exit the loop after the first iteration (to prevent unnecessary iterations)'
	return;
}
