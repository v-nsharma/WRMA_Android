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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

'Load test data from Data Files/WRMA-107 for Add Account Number test case'
TestData testData = findTestData('Data Files/WRMA-107')

'Get test email from first row of test data'
String email = testData.getValue('Email', 1)

'Get test password from first row of test data'
String password = testData.getValue('Password', 1)

'Get account number from first row of test data'
String accountNumber = testData.getValue('AccountNumber', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - Login or Sign Up'), 0)

'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter test email in username field'
Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - Next'), 0)

'Extended wait (45s) for OAM login screen to load'
Mobile.delay(45)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (1)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before password entry'
Mobile.delay(10)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (2)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before login attempt'
Mobile.delay(10)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - LOGIN'), 0)

'Wait 10 seconds for login to complete and app to load'
Mobile.delay(10)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/AddReservation/android.view.View - My Account'), 0)

'Wait 10 seconds for My Account page to load'
Mobile.delay(10)

'Tap on Add An Account Number option'
Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.TextView - Add An Account Number'), 0)

'Wait 10 seconds for Add Account Number screen to load'
Mobile.delay(10)

'Enter the account number from test data'
Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (3)'), accountNumber, 0)

'Wait 10 seconds for validation message to appear'
Mobile.delay(10)

'First verification of validation message existence'
Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView -  Account number should be 7-11 digits'), 0)

'Store result of second verification for assertion'
boolean isExist = Mobile.verifyElementExist(findTestObject('Object Repository/C701-C702/android.widget.TextView -  Account number should be 7-11 digits'), 0)

'Assert that validation message exists as expected'
assert isExist == true : "The expected element exist!"

'Close the mobile application'
Mobile.closeApplication()