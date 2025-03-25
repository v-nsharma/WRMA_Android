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

'Launch the mobile application with reset set to false (preserves session data)'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

'Wait for 10 seconds to allow the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign-Up" button to navigate to the login screen'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds to ensure the login page is loaded'
Mobile.delay(10)

'Enter the email address "msd@ms.com" in the email input field'
Mobile.setText(findTestObject('Object Repository/C694/android.widget.EditText'), 'msd@ms.com', 0)

'Hide the keyboard to proceed to the next step'
Mobile.hideKeyboard()

'Wait for 10 seconds to ensure the input is processed'
Mobile.delay(10)

'Tap on the "Next" button to continue with the login process'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Next'), 0)

'Wait for 10 seconds to allow navigation to the next screen'
Mobile.delay(10)

'Re-enter the email address "msd@ms.com" in the confirmation email input field'
Mobile.setText(findTestObject('Object Repository/C694/android.widget.EditText (1)'), 'msd@ms.com', 0)

'Hide the keyboard to ensure proper display of the UI'
Mobile.hideKeyboard()

'Wait for 10 seconds to stabilize the UI'
Mobile.delay(10)

'Tap on the "Next" button to proceed further'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Next (1)'), 0)

'Wait for 5 seconds to allow the next screen to load'
Mobile.delay(5)

'Enter the first name "m" in the first name input field'
Mobile.setText(findTestObject('Object Repository/C694/android.widget.EditText (2)'), 'm', 0)

'Hide the keyboard after entering the first name'
Mobile.hideKeyboard()

'Wait for 5 seconds to ensure input is captured'
Mobile.delay(5)

'Enter the last name "s" in the last name input field'
Mobile.setText(findTestObject('Object Repository/C694/android.widget.EditText (3)'), 's', 0)

'Hide the keyboard after entering the last name'
Mobile.hideKeyboard()

'Wait for 5 seconds to ensure input is captured'
Mobile.delay(5)

'Enter "password" as the password in the password field'
Mobile.sendKeys(findTestObject('Object Repository/C694/android.widget.EditText (4)'), 'password')

'Wait for 5 seconds to ensure input is captured'
Mobile.delay(5)

'Enter "password" again in the confirm password field'
Mobile.sendKeys(findTestObject('Object Repository/C694/android.widget.EditText (5)'), 'password')

'Wait for 5 seconds to ensure input is captured'
Mobile.delay(5)

'Tap on the "Next" button to proceed with account creation'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Next (2)'), 0)

'Wait for 30 seconds to allow the Terms & Conditions page to load'
Mobile.delay(30)

'Scroll to the text containing ", etc)." in the Terms & Conditions screen'
Mobile.scrollToText(', etc).')

'Tap on the "Agree to Terms & Conditions" button to accept the terms'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Agree to Terms  Conditions'), 0)

'Wait for 30 seconds to process the agreement'
Mobile.delay(30)

'Simulate the Android back button press to navigate back'
Mobile.sendKeys("{ESCAPE}")

'Wait for 5 seconds to allow the UI to update'
Mobile.delay(5)

'Verify if the "Try Again" button is displayed, indicating an issue with the agreement process'
Mobile.verifyElementExist(findTestObject('Object Repository/C694/android.widget.Button - Try Again'), 0)

'Wait for 5 seconds to ensure UI stability'
Mobile.delay(5)

'Tap on the "Try Again" button to attempt agreeing to the terms again'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Try Again'), 0)

'Wait for 5 seconds to allow the UI to update'
Mobile.delay(5)

'Verify if the "Try Again" button is still displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/C694/android.widget.Button - Try Again'), 0)

'Wait for 5 seconds to ensure UI stability'
Mobile.delay(5)

'Tap on the "Try Again" button again in case of failure'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Try Again'), 0)

'Wait for 5 seconds to allow the UI to update'
Mobile.delay(5)

'Verify if the "Back to Terms & Conditions" button is displayed, allowing the user to go back'
Mobile.verifyElementExist(findTestObject('Object Repository/C694/android.widget.Button - Back to Terms  Conditions'), 0)

'Wait for 5 seconds to ensure UI stability'
Mobile.delay(5)

'Tap on the "Back to Terms & Conditions" button to revisit the agreement screen'
Mobile.tap(findTestObject('Object Repository/C694/android.widget.Button - Back to Terms  Conditions'), 0)

'Wait for 5 seconds to allow the UI to update'
Mobile.delay(5)

'Verify if the "Agree to Terms & Conditions" button is displayed again'
Mobile.verifyElementExist(findTestObject('Object Repository/C694/android.widget.Button - Agree to Terms  Conditions'), 0)

'Wait for 5 seconds to ensure UI stability'
Mobile.delay(5)

'Close the application successfully after completing the test'
Mobile.closeApplication()