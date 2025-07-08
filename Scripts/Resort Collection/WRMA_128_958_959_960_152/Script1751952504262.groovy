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

'Start the mobile application using the specified APK file and reset its state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (7).apk', true)

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

'Tap the default action button on the home screen (possibly "Let’s Go" or similar)'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.Button'), 0)

'Wait for 5 seconds to ensure the page transition completes'
Mobile.delay(5)

'Verify the "WOW Partner Deals" tile is visible on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - WOW Partner Deals'), 0)

'Tap the "WOW Partner Deals" tile to view details'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.TextView - WOW Partner Deals'), 0)

'Wait for 20 seconds to allow full content to load'
Mobile.delay(20)

'Tap on the detailed partner deal section to expand or view more'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.TextView - WOW Partner Deals  The Newest Addition to the WOW Loyalty Program'), 0)

'Wait for 10 seconds to ensure page content is fully visible'
Mobile.delay(10)

'Verify that the detailed partner deal content is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - WOW Partner Deals  The Newest Addition to the WOW Loyalty Program (1)'), 0)

'Wait for 5 seconds before navigating back'
Mobile.delay(5)

'Tap the "Home" icon to return to the main menu'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.view.View - Home (1)'), 0)

'Wait for 5 seconds to load the home page'
Mobile.delay(5)

'Tap the main action button again from the home page'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.Button'), 0)

'Wait for 5 seconds for transition'
Mobile.delay(5)

'Tap the "Resort Collection" section to view list of resorts'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.TextView - Resort Collection'), 0)

'Wait for 5 seconds for resort list to load'
Mobile.delay(5)

'Tap the "Wild Bear Inn" resort to view its details'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.TextView - Wild Bear Inn'), 0)

'Wait for 5 seconds to load resort details'
Mobile.delay(5)

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

'Perform vertical swipes 3 times to scroll through the list'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify that the "VIEW EXPECTED WEATHER" section is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - VIEW EXPECTED WEATHER'), 0)

'Tap on "VIEW EXPECTED WEATHER" to see weather details'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.TextView - VIEW EXPECTED WEATHER'), 0)

'Wait for 5 seconds to load weather content'
Mobile.delay(5)

'Verify July weather details are displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - July'), 0)

'Verify specific temperature data is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - 82.9  62.7'), 0)

'Tap on the back or close button'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.Button (1)'), 0)

'Wait for 5 seconds to return to resort details'
Mobile.delay(5)

'Verify the "ON-PROPERTY AMENITIES" section is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - ON-PROPERTY AMENITIES'), 0)

'Tap on an image (possibly representing a dining option)'
Mobile.tap(findTestObject('Object Repository/Resort_eight/android.widget.Image - getImageid166267'), 0)

'Wait for 5 seconds to load amenity details'
Mobile.delay(5)

'Verify that the "Dining" section is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - Dining'), 0)

'Verify that the "Highlights" section is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - Highlights'), 0)

'Verify that the "Check website for details" message is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.TextView - Check website for details'), 0)

'Verify that the "Reserve Now" button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort_eight/android.widget.Button - Reserve Now'), 0)

'Close the mobile application to end the session'
Mobile.closeApplication()