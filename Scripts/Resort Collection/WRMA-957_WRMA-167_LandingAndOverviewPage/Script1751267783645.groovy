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

'Start the mobile application using the given APK and reset its state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (4).apk', true)

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

'Tap the menu or hamburger icon to open navigation options'
Mobile.tap(findTestObject('Object Repository/Resortcollection/android.widget.Button'), 0)

'Wait for the menu to expand'
Mobile.delay(5)

'Tap on "Resort Collection" from the menu'
Mobile.tap(findTestObject('Object Repository/Resortcollection/android.widget.TextView - Resort Collection'), 0)

'Wait for the Resort Collection page to load'
Mobile.delay(5)

'Verify that the Resort Collection title is displayed on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resortcollection/android.widget.TextView - Resort Collection (1)'), 0)

'Get the device height for swipe calculations'
int deviceHeight = Mobile.getDeviceHeight()

'Get the device width for swipe calculations'
int deviceWidth = Mobile.getDeviceWidth()

'Calculate the horizontal center of the screen for swipe start X coordinate'
int startX = deviceWidth / 2

'Set swipe start Y coordinate near the bottom of the screen'
int startY = deviceHeight * 3 / 4

'Set swipe end X coordinate to match the start X (vertical swipe)'
int endX = startX

'Set swipe end Y coordinate near the top of the screen'
int endY = deviceHeight / 4

'Perform vertical swipes 8 times to scroll through the list'
for (int i = 0; i < 8; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify "Westgate Leisure Resort" is displayed in the resort list'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resortcollection/android.widget.TextView - Westgate Leisure Resort'), 0)

'Verify the location "Orlando, FL" is displayed for the resort'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resortcollection/android.widget.TextView - Orlando, FL'), 0)

'Tap on the "Westgate Leisure Resort" item to view details'
Mobile.tap(findTestObject('Object Repository/ResortCollections/android.widget.TextView - Westgate Leisure Resort'), 0)

'Wait for the resort detail page to load'
Mobile.delay(10)

'Verify that the resort name is displayed on the details screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - Westgate Leisure Resort (1)'), 0)

'Verify that the address line is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - 6950 Villa de Costa Drive'), 0)

'Verify that the location "Orlando, FL" is displayed again on the detail screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - Orlando, FL (1)'), 0)

'Verify that the resort contact number is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - 4072398855'), 0)

'Perform vertical swipe 3 times to scroll to booking section'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify that the "BOOK YOUR ROOM" button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.Button - BOOK YOUR ROOM'), 0)

'Verify that the price value "72" is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - 72'), 0)

'Tap on the "BOOK YOUR ROOM" button to start reservation'
Mobile.tap(findTestObject('Object Repository/ResortCollections/android.widget.Button - BOOK YOUR ROOM'), 0)

'Wait for the reservation confirmation screen to load'
Mobile.delay(10)

'Verify that the "VIEW RESERVATION DETAILS" text is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/ResortCollections/android.widget.TextView - VIEW RESERVATION DETAILS'), 0)

'Close the mobile application'
Mobile.closeApplication()