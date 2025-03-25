import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Loads the test data from the specified file (C661) in the "Data Files" folder. This file contains the test data (e.g., email and password) required for the test case.'
TestData testData = findTestData('Data Files/C661')

'Retrieves the value of the email field from the first row of the test data file. This value is stored in the email variable for use in the test script.\r\n'
String email = testData.getValue('email', 1)

'Retrieves the value of the password field from the first row of the test data file. This value is stored in the password variable for use in the test script.'
String password = testData.getValue('password', 1)

'Launches the mobile application using the specified APK file path. The application is installed (if not already installed) and started on the connected device or emulator'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

'Adds a delay of 10 seconds to allow the application to load completely before proceeding to the next step'
Mobile.delay(10)

'Simulates a tap action on the "Login or Sign Up" button to navigate to the login screen.'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Adds a delay of 10 seconds to allow the login screen to load completely'
Mobile.delay(10)

'Enters the email address (retrieved from the test data) into the email input field on the login screen.'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

'Hides the on-screen keyboard after entering the email address to avoid obstructing the view of other elements'
Mobile.hideKeyboard()

'Adds a delay of 10 seconds to ensure the email input is processed and the screen is ready for the next action'
Mobile.delay(10)

'Simulates a tap action on the "Next" button to proceed to the OAM (Online Account Management) login page'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Adds a delay of 30 seconds to allow the OAM login page to load completely'
Mobile.delay(30)

'Enters the email address (retrieved from the test data) into the email input field on the OAM login page'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

'Hides the on-screen keyboard after entering the email address to avoid obstructing the view of other elements'
Mobile.hideKeyboard()

'Adds a delay of 30 seconds to ensure the email input is processed and the screen is ready for the next action'
Mobile.delay(30)

'Enters the password (retrieved from the test data) into the password input field on the OAM login page'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hides the on-screen keyboard after entering the password to avoid obstructing the view of other elements'
Mobile.hideKeyboard()

'Adds a delay of 30 seconds to ensure the password input is processed and the screen is ready for the next action'
Mobile.delay(30)

'Simulates a tap action on the "Login" button to submit the credentials and log in to the application'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

'Adds a delay of 20 seconds to allow the application to process the login request and load the home screen.'
Mobile.delay(20)

'Verifies that the "My Stay" section is displayed on the screen after successful login.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Stay'), 0)

'Adds a delay of 5 seconds to ensure the "My Stay" section is fully loaded.'
Mobile.delay(5)

'Verifies that the "My Account" section is displayed on the screen after successful login.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'Adds a delay of 5 seconds to ensure the "My Account" section is fully loaded.'
Mobile.delay(5)

'Verifies that the "Home" section is displayed on the screen after successful login.'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Adds a delay of 5 seconds to ensure the "Home" section is fully loaded.'
Mobile.delay(5)

'Retrieves the text displayed in the "My Stay" section for validation.'
String myStayText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Stay'), 0)

'Asserts that the text retrieved from the "My Stay" section matches the expected value ("My Stay"). If the assertion fails, the test case will fail.'
assert myStayText == 'My Stay'

'Asserts that the text retrieved from the "My Stay" section matches the expected value ("My Stay"). If the assertion fails, the test case will fail.'
String myAccountText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

'This step uses an assertion to verify a condition. It checks if the value of the variable myAccountText is equal to the string "My Account". If the condition is true, the test proceeds; if false, the test fails and stops (depending on the failure handling settings in Katalon). This is typically used to validate that a certain text or value on the UI matches the expected result, such as verifying a page title or a label after a user logs in.'
assert myAccountText == 'My Account'

'This step retrieves the text from a UI element identified by the object android.view.View - Home (likely a mobile element in an Android app) and stores it in a variable named homeText. The object is probably a predefined element in Katalon’s Object Repository, representing a view or label on the app’s home screen. This step is used to capture text for later validation, such as checking if the home screen displays the correct title or message'
String homeText = Mobile.getText(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'Similar to the first assert statement, this step checks if the value of the variable homeText (captured in the previous step) is equal to the string "Home". This assertion ensures that the text displayed on the home screen matches the expected value, "Home". It’s a validation step to confirm that the app is on the correct screen or that the UI element displays the expected content.'
assert homeText == 'Home'

'Simulates a tap action on the Home element.\n'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

'This step introduces a pause in the test execution for 5 seconds. The Delay keyword is used to wait for a specified amount of time, often to allow the application to load, sync, or transition between states. In this case, the test pauses for 5 seconds, possibly to ensure the home screen is fully loaded or to simulate user wait time before proceeding to the next step.'
Mobile.delay(5)

'This step closes the application under test. The Close Application keyword is typically used at the end of a test case to terminate the app session, ensuring that the app is not left running in the background. This is important for mobile testing to reset the app state for subsequent tests or to free up device resources. In this case, it likely marks the end of the test case, closing the Android app after all validations and actions are completed.'
Mobile.closeApplication()

