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

'Start the application and reset app state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.86.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap the "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyWeb/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to load'
Mobile.delay(10)

'Enter email in the email input field'
Mobile.setText(findTestObject('Object Repository/LoyaltyWeb/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Wait before proceeding'
Mobile.delay(10)

'Tap the "Next" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyWeb/android.widget.Button - Next'), 0)

'Wait for the cookie consent screen to appear'
Mobile.delay(40)

'Tap "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/LoyaltyWeb/android.widget.Button - Accept All Cookies'), 0)

'Wait before proceeding to login'
Mobile.delay(10)

'Re-enter email address for login'
Mobile.setText(findTestObject('Object Repository/LoyaltyWeb/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard after typing email'
Mobile.hideKeyboard()

'Pause before entering password'
Mobile.delay(10)

'Enter the account password'
Mobile.setText(findTestObject('Object Repository/LoyaltyWeb/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Pause before logging in'
Mobile.delay(10)

'Tap the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/LoyaltyWeb/android.widget.Button - LOGIN'), 0)

'Wait for user dashboard/home screen to load'
Mobile.delay(20)

'Tap on the "My Stay" section'
Mobile.tap(findTestObject('Object Repository/Resort/android.view.View - My Stay'), 0)

'Wait before tapping on stay details'
Mobile.delay(10)

'Verify "My Stay" label is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - My Stay'), 0)

'Verify "Current" button is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.Button - Current'), 0)

'Verify "Past Stays" button is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.Button - Past Stays'), 0)

'Verify "ACTIVE STAYS" label is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - ACTIVE STAYS'), 0)

'Verify "UPCOMING STAYS" label is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - UPCOMING STAYS'), 0)

'Verify "SEE ALL" text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - SEE ALL'), 0)

'Tap "SEE ALL" to view all reservations'
Mobile.tap(findTestObject('Object Repository/SeeAll/android.widget.TextView - SEE ALL'), 0)

'Wait for the list of reservations to load'
Mobile.delay(10)

'Verify Westgate Cocoa Beach Resort is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - Westgate Cocoa Beach Resort'), 0)

'Verify reservation date range is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - May 13, 2025 - May 17, 2025'), 0)

'Verify Westgate Myrtle Beach Oceanfront Resort is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - Westgate Myrtle Beach Oceanfront Resort'), 0)

'Verify Westgate Lakes Resort & Spa is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - Westgate Lakes Resort  Spa'), 0)

'Get screen dimensions for swipe gestures'
int screenHeight = Mobile.getDeviceHeight()
int screenWidth = Mobile.getDeviceWidth()

'Set swipe coordinates for vertical swipe'
int swipeStartX = screenWidth / 2
int swipeStartY = screenHeight * 3 / 4
int swipeEndX = swipeStartX
int swipeEndY = screenHeight / 4

'Swipe up to reveal more resorts'
for (int i = 0; i < 5; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify Westgate Blue Tree Resort is displayed after scrolling'
assert Mobile.verifyElementExist(findTestObject('Object Repository/SeeAll/android.widget.TextView - Westgate Blue Tree Resort'), 0)

'Close the application'
Mobile.closeApplication()
