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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

'Load test data from Data Files/C770 for Book Rental test case'
TestData testData = findTestData('Data Files/C770')

'Get test email from first row of test data'
String email = testData.getValue('email', 1)

'Get test password from first row of test data'
String password = testData.getValue('password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - Login or Sign Up'), 0)

'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter test email in username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - Next'), 0)

'Extended wait (45s) for OAM login screen to load'
Mobile.delay(45)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText (1)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds before password entry'
Mobile.delay(20)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText (2)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before login attempt'
Mobile.delay(10)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - LOGIN'), 0)

'Wait 20 seconds for login to complete and home screen to load'
Mobile.delay(20)

'Navigate to Home section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.view.View - Home'), 0)

'Wait 10 seconds for home screen to load'
Mobile.delay(10)

'Scroll down to "recommended for you" section'
Mobile.scrollToText('recommended for you')

'Define array of Book Rental elements to verify'
String[] elementsToVerify = [
	'Object Repository/Repo/MyStay/BookRental/android.view.View',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Book a Rental',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Westgate Resorts',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Book Now'
]

'Verify each element exists in the Book Rental section'
for (String elementPath : elementsToVerify) {
	Mobile.verifyElementExist(findTestObject(elementPath), 10, FailureHandling.STOP_ON_FAILURE)
}

'Confirm all verification steps passed successfully'
assert true : "All elements were verified successfully"

'Close the mobile application'
Mobile.closeApplication()
