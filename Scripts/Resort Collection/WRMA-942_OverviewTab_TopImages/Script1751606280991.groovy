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

'Start the mobile application using the specified APK and reset its state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (6).apk', true)

'Wait for 10 seconds to ensure the application loads completely'
Mobile.delay(10)

'Tap the "Login or Sign Up" button on the app’s home screen'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen elements to be visible'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/SS0Manage/android.widget.EditText'), 'angela016@ameritech.net', 0)

'Hide the virtual keyboard to prevent it from blocking other elements'
Mobile.hideKeyboard()

'Wait for 10 seconds before proceeding to the next action'
Mobile.delay(10)

'Tap the "Next" button to proceed to the password entry or SSO page'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Next'), 0)

'Wait 50 seconds to allow time for any SSO redirection or screen transitions'
Mobile.delay(50)

'Tap the "Accept All Cookies" button to accept cookies policy'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Accept All Cookies'), 0)

'Wait for 5 seconds after accepting the cookies'
Mobile.delay(5)

'Re-enter the email address if prompted again on the login screen'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (1)'), 'angela016@ameritech.net', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 5 seconds before entering the password'
Mobile.delay(5)

'Enter the account password in the password field'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 5 seconds before submitting the login form'
Mobile.delay(5)

'Tap the "LOGIN" button to sign into the account'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - LOGIN'), 0)

'Wait for 5 seconds to allow navigation after successful login'
Mobile.delay(5)

'Tap on the button to continue or access the main page'
Mobile.tap(findTestObject('Object Repository/ResortImage/android.widget.Button'), 0)

'Wait for 5 seconds before the next interaction'
Mobile.delay(5)

'Tap on the "Resort Collection" text to view available resorts'
Mobile.tap(findTestObject('Object Repository/ResortImage/android.widget.TextView - Resort Collection'), 0)

'Wait for 5 seconds to allow the list to load'
Mobile.delay(5)

'Tap on the "Wild Bear Inn" option from the resort list'
Mobile.tap(findTestObject('Object Repository/ResortImage/android.widget.TextView - Wild Bear Inn'), 0)

'Wait for 5 seconds to ensure the resort page is fully loaded'
Mobile.delay(5)

'Verify the "Wild Bear Inn" header text is present on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortImage/android.widget.TextView - Wild Bear Inn (1)'), 0)

'Verify the first image of Wild Bear Inn is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortImage/android.widget.Image - getImageid75654'), 0)

'Verify the second image of Wild Bear Inn is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortImage/android.widget.Image - getImageid75654 (1)'), 0)

'Verify another image of Wild Bear Inn is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortImage/android.widget.Image - getImageid75648'), 0)

'Close the application to end the test'
Mobile.closeApplication()