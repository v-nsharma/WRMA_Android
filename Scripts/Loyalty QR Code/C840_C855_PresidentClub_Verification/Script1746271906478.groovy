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

'Start the application with a fresh install using the specified APK file'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the landing screen'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Login or Sign Up'), 0)

'Wait for the next screen to load'
Mobile.delay(10)

'Enter email address in the email input field'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText'), 'DELMG61@HOTMAIL.COM', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Pause before continuing'
Mobile.delay(10)

'Tap the "Next" button to proceed with login'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Next'), 0)

'Wait for the cookies consent popup'
Mobile.delay(10)

'Tap the "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Accept All Cookies'), 0)

'Wait for the login screen to load completely'
Mobile.delay(40)

'Re-enter the email address in the login form'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText (1)'), 'DELMG61@HOTMAIL.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Pause briefly'
Mobile.delay(5)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Pause briefly'
Mobile.delay(5)

'Tap the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - LOGIN'), 0)

'Wait for login and navigation to complete'
Mobile.delay(15)

'Tap on the hamburger menu or user profile image'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Image'), 0)

'Pause to ensure screen is loaded'
Mobile.delay(20)

'Verify "Presidents Club" label is visible on the home screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Presidents Club'), 0)

'Verify "Westgate Las Vegas Resort & Casino" text is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Westgate Las Vegas Resort  Casino'), 0)

'Verify a specific image is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.Image (1)'), 0)

'Tap on "Presidents Club" to open member details'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.TextView - Presidents Club'), 0)

'Wait for the member detail screen to load'
Mobile.delay(10)

'Verify the "Presidents Club" heading is displayed again on detail screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Presidents Club (1)'), 0)

'Verify the first name "Richard" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Richard'), 0)

'Verify the last name "Krug" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Krug'), 0)

'Verify a general TextView element is present (unspecified content)'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView'), 0)

'Verify the resort name is displayed again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Westgate Las Vegas Resort  Casino (1)'), 0)

'Verify another instance of the "Presidents Club" label exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PRClub/android.widget.TextView - Presidents Club (2)'), 0)

'Close the application to end the test'
Mobile.closeApplication()
