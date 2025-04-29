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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.75.apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the welcome screen'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/PastStay/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard to ensure visibility of next button'
Mobile.hideKeyboard()

'Wait before proceeding to the next step'
Mobile.delay(10)

'Tap on the "Next" button to continue with the login process'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - Next'), 0)

'Wait for 40 seconds to allow the transition to the password screen'
Mobile.delay(40)

'Accept all cookies on the consent screen'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - Accept All Cookies'), 0)

'Wait briefly after accepting cookies'
Mobile.delay(10)

'Re-enter the email address on the login form'
Mobile.setText(findTestObject('Object Repository/PastStay/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before entering the password'
Mobile.delay(5)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/PastStay/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before tapping the login button'
Mobile.delay(10)

'Tap on the "LOGIN" button to authenticate'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - LOGIN'), 0)

'Wait before navigating to My Stay'
Mobile.delay(10)

'Tap on the "My Stay" section/tab'
Mobile.tap(findTestObject('Object Repository/PastStay/android.view.View - My Stay'), 0)

'Wait for the My Stay section to fully load'
Mobile.delay(20)

'Verify that the "ACTIVE STAYS" label is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - ACTIVE STAYS'), 0)

'Tap on "View Stay Details" to view an active booking'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.TextView - View Stay Details'), 0)

'Wait for stay details to load'
Mobile.delay(10)

'Verify that stay details are displayed correctly'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Mar 28 - Jun 26, 2025  Hotel Room'), 0)

'Wait before navigating back'
Mobile.delay(5)

'Tap on the "back" button to return from stay details'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - back'), 0)

'Wait before switching to Past Stays tab'
Mobile.delay(10)

'Tap on the "Past Stays" button to view previous bookings'
Mobile.tap(findTestObject('Object Repository/PastStay/android.widget.Button - Past Stays'), 0)

'Wait for the Past Stays section to load'
Mobile.delay(20)

'Verify that past stays are displayed (multiple view assertions)'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.view.View'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.view.View (1)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.view.View (2)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.view.View (3)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - CHECKED-OUT'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - CHECKED-OUT (1)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - CHECKED-OUT (2)'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - CHECKED-OUT (3)'), 0)


'Verify that specific past stay dates are displayed correctly'
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Mar 25, 2025 - Apr 24, 2025'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Apr 03, 2025 - Apr 20, 2025'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Apr 09, 2025 - Apr 22, 2025'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Westgate Blue Tree Resort'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Westgate Lakes Resort  Spa'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Westgate Palace'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/PastStay/android.widget.TextView - Westgate Town Center Resort'), 0)

'Close the application after the test execution'
Mobile.closeApplication()

