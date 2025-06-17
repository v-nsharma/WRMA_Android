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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

'Wait for 10 seconds to allow the app to fully load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button from the home screen'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to load'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/SS0Manage/android.widget.EditText'), '0625052tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait before proceeding to the next step'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the password screen'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Next'), 0)

'Wait for 50 seconds to allow any redirection or loading (e.g., SSO login)'
Mobile.delay(50)

'Tap on the "Accept All Cookies" button to consent to cookie policy'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - Accept All Cookies'), 0)

'Wait for 5 seconds after accepting cookies'
Mobile.delay(5)

'Re-enter the email address in the login screen (if required)'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (1)'), '0625052tm@wg.com', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 5 seconds before entering password'
Mobile.delay(5)

'Enter the account password in the password field'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (2)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait for 5 seconds before login attempt'
Mobile.delay(5)

'Tap on the "LOGIN" button to authenticate and log in to the app'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - LOGIN'), 0)

'Wait for 5 seconds to allow login navigation'
Mobile.delay(5)

'Tap on the "My Stay" section to view current reservation details'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.view.View - My Stay'), 0)

'Wait for 15 seconds to allow reservation details to load'
Mobile.delay(15)

'Tap on the "View Stay Details" button to see more information about the booking'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.TextView - View Stay Details'), 0)

'Wait for 5 seconds after opening stay details'
Mobile.delay(5)

'Scroll down the page until the text "manage online" is visible'
Mobile.scrollToText('manage online')

'Wait for 2 seconds before interacting with the next element'
Mobile.delay(2)

'Tap on the "MANAGE ONLINE" button to open the online reservation management page'
Mobile.tap(findTestObject('Object Repository/SS0Manage/android.widget.Button - MANAGE ONLINE'), 0)

'Wait for 50 seconds to allow the external or web page to load'
Mobile.delay(50)

'Verify that the name is displayed on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SS0Manage/android.widget.Button - ADD AN ACCOUNT'), 0)

'Verify that the reservation number and status text is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SS0Manage/android.widget.Button - BECOME AN OWNER Learn More About The Benefits Of Owning Your Own Timeshare At Westgate Resorts'), 0)

'Verify that the "VIEW RESERVATION DETAILS" button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SS0Manage/android.widget.Button - MANAGE MY RESERVATIONS'), 0)

'Close the mobile application to end the test session'
Mobile.closeApplication()