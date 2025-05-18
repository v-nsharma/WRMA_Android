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

'Start the mobile application with a fresh install/reset'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the user email address in the input field'
Mobile.setText(findTestObject('Object Repository/Pet/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait before tapping the next button'
Mobile.delay(10)

'Tap the "Next" button to proceed'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.Button - Next'), 0)

'Wait for the transition to the password or cookie screen'
Mobile.delay(40)

'Accept all cookies on the cookie consent screen'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.Button - Accept All Cookies'), 0)

'Wait briefly after accepting cookies'
Mobile.delay(10)

'Re-enter the email address on the login form'
Mobile.setText(findTestObject('Object Repository/Pet/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before entering the password'
Mobile.delay(10)

'Enter the password into the password input field'
Mobile.setText(findTestObject('Object Repository/Pet/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait before tapping the login button'
Mobile.delay(10)

'Tap the "LOGIN" button to authenticate the user'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.Button - LOGIN'), 0)

'Wait for the dashboard or main screen to load after login'
Mobile.delay(20)

'Navigate to the "My Stay" section'
Mobile.tap(findTestObject('Object Repository/Pet/android.view.View - My Stay'), 0)

'Wait for the My Stay section to load'
Mobile.delay(20)

'Tap on "View Stay Details" to see booking information'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.TextView - View Stay Details'), 0)

'Wait for the stay details screen to appear'
Mobile.delay(10)

'Tap to enter the "My Stay Details" view'
Mobile.tap(findTestObject('Object Repository/Pet/android.view.View - My Stay Details'), 0)

'Wait for the stay details to load'
Mobile.delay(10)

'Verify that the "Pet Policy" title is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - Pet Policy'), 0)

'Wait briefly before viewing full pet policy'
Mobile.delay(10)

'Tap on "View" to open detailed pet policy'
Mobile.tap(findTestObject('Object Repository/Pet/android.widget.TextView - View'), 0)

'Wait for the detailed policy to load'
Mobile.delay(10)

'Verify the heading "Pet Policy" is displayed again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - Pet Policy (1)'), 0)

'Verify the $100.00 deposit policy is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - A 100.00 pet deposit is required at the time of check-in. If there is no damage upon check-out, the deposit will be returned'), 0)

'Verify the $170.00 cleaning fee policy is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - At check-in, guests are required to advise the Front Desk that they have a pet. A 170.00 pet cleaning fee will be assessed to all guests traveling with their pet'), 0)

'Verify the $190.00 penalty for undeclared pets is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - If a guest does not advise the Front Desk that they have a pet and a pet is found in the room, the guest will be charged 190.00, in addition to the 100.00 deposit'), 0)

'Verify guest responsibility statement is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - Guests are fully responsible for their pets actions and any damages that may occur. While the pet is in the unit, it is expected to be supervised at all times'), 0)

'Verify reference to full pet policy and procedures is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Pet/android.widget.TextView - Please reference Westgate Resorts Pet Policy and Procedures for our comprehensive pet policy'), 0)

'Close the application after completing the test'
Mobile.closeApplication()
