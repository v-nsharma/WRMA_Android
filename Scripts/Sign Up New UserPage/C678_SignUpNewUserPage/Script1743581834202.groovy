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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Retrieve test data from "C678" file'
TestData testData = findTestData("Data Files/C678")

'Extract the first email from the test data file'
String email1 = testData.getValue('email', 1)

'Extract the second email from the test data file'
String email2 = testData.getValue('email', 2)

'Start the mobile application using the specified APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button to navigate to the login screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds before entering text'
Mobile.delay(10)

'Enter the first email into the email input field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email1)

'Wait for 10 seconds before proceeding to the next step'
Mobile.delay(10)

'Tap on the "Next" button to proceed with email verification'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Wait for 10 seconds before resetting the input field'
Mobile.delay(10)

'Tap on the "Reset" button to clear the entered email address'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - reset'), 0)

'Hide the keyboard to ensure visibility of UI elements'
Mobile.hideKeyboard()

'Wait for 20 seconds before entering the second email'
Mobile.delay(10)

'Enter the second email into the email input field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText -'), email2)

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Tap on the "Next" button to validate the second email'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next (1)'), 0)

'Wait for 10 seconds to allow validation to complete'
Mobile.delay(10)

'Retrieve the actual error message displayed on the screen'
String actualText = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  The email address used is a Team Member email address.  Please select Create Team Member Account below'), 0).trim();

'Define the expected error message'
String expectedText = " The email address used is a Team Member email address.  Please select Create Team Member Account below."

'Verify that the actual error message contains the expected text'
assert actualText.contains(expectedText) : "ERROR: Expected text not found! Actual text: " + actualText

'Close the mobile application after execution'
Mobile.closeApplication()
