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

'Start the mobile application from the specified APK file and reinstall if already installed'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-Version-2.99.70.apk', true)

'Wait for the application to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - Login or Sign Up'), 0)

'Pause to ensure the login screen has loaded'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText'), 'ELPHA@ELPHA.DEMON.CO.UK', 0)

'Hide the keyboard to avoid obstructing UI elements'
Mobile.hideKeyboard()

'Wait before proceeding to the next action'
Mobile.delay(10)

'Tap the "Next" button to continue to the password screen'
Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - Next'), 0)

'Allow time for the next screen to fully load'
Mobile.delay(40)

'Re-enter the email address in the username field on the login form'
Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (1)'), 'ELPHA@ELPHA.DEMON.CO.UK', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Pause briefly before entering the password'
Mobile.delay(5)

'Enter the password in the password field'
Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait briefly before logging in'
Mobile.delay(5)

'Tap on the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - LOGIN'), 0)

'Pause to allow the post-login screen to load'
Mobile.delay(10)

'Tap on the "My Stay" tab to navigate to the user’s stay details'
Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - My Stay'), 0)

'Pause to ensure the stay details screen is visible'
Mobile.delay(10)

'Verify that the overdue maintenance fee message is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Your Maintenance  TaxUse Fee payment of 1,046.38 is past due'), 0)

'Verify that the stay dates from Oct 04, 2026 to Oct 11, 2026 are displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Oct 04, 2026 - Oct 11, 2026'), 0)

'Verify that the stay dates from Oct 05, 2025 to Oct 12, 2025 are displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Oct 05, 2025 - Oct 12, 2025'), 0)

'Verify that a second overdue payment message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Your Maintenance  TaxUse Fee payment of 1,046.38 is past due (1)'), 0)

'Close the mobile application'
Mobile.closeApplication()
