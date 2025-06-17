import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.util.KeywordUtil
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobiles
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import io.appium.java_client.android.AndroidDriver

'Start the application using the specified APK and reset the state'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.124.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen'
Mobile.delay(10)

'Enter the email address'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText'), '0625052tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before tapping next'
Mobile.delay(10)

'Tap on "Next" button to proceed with email'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Next'), 0)

'Wait for OTP screen or delay for backend processing'
Mobile.delay(60)

'Reject all permissions or pop-ups'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Reject All'), 0)

'Wait after dismissing pop-up'
Mobile.delay(10)

'Re-enter the email in the login screen'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (1)'), '0625052tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before entering password'
Mobile.delay(10)

'Enter the password'
Mobile.setText(findTestObject('Object Repository/BannerVerification/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait before login'
Mobile.delay(10)

'Tap on the "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - LOGIN'), 0)

'Wait for login processing and dashboard to load'
Mobile.delay(20)

'Tap on "WOW Loyalty Member Tier" section'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.view.View - WOW Loyalty Member Tier'), 0)

'Wait for navigation'
Mobile.delay(10)

'Tap to open QR Codes'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Open QR Codes'), 0)

'Wait for QR screen to appear'
Mobile.delay(5)

'Verify Loyalty Logo is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Image - Loyalty Logo'), 0)

'Verify first name is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Nara'), 0)

'Verify last name is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Khachatryan'), 0)

'Tap on Done to close QR screen'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Done'), 0)

'Wait for transition'
Mobile.delay(5)

'Verify Loyalty Benefits section is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Loyalty Benefits'), 0)

'Tap on "Learn More" to view benefits'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Learn More'), 0)

'Wait for benefits screen'
Mobile.delay(5)

'Verify Included Member Tier Benefits are listed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Included Member Tier Benefits'), 0)

'Tap back button to return'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - back'), 0)

'Wait for navigation'
Mobile.delay(5)

'Get device height'
int deviceHeight = Mobile.getDeviceHeight()

'Get device width'
int deviceWidth = Mobile.getDeviceWidth()

'Calculate horizontal center'
int startX = deviceWidth / 2

'Calculate vertical start (bottom 3/4 of screen)'
int startY = deviceHeight * 3 / 4

'Set horizontal end point'
int endX = startX

'Calculate vertical end (top 1/4 of screen)'
int endY = deviceHeight / 4

'Swipe up 3 times to scroll through content'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify "Get Support" text is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Get Support'), 0)

'Verify support contact button is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Button - CALL 888-852-2959'), 0)

'Verify "My Stay" section is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.view.View - My Stay'), 0)

'Tap on "My Stay" section'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.view.View - My Stay'), 0)

'Wait for stay details to load'
Mobile.delay(15)

'Tap on "View Stay Details"'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.TextView - View Stay Details'), 0)

'Tap on "WOW Loyalty Member Tier" again'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.view.View - WOW Loyalty Member Tier'), 0)

'Wait for QR screen'
Mobile.delay(10)

'Tap to open QR Codes'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Open QR Codes'), 0)

'Wait for QR display'
Mobile.delay(5)

'Verify Loyalty Logo is displayed again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Image - Loyalty Logo'), 0)

'Verify first name again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Nara'), 0)

'Verify last name again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Khachatryan'), 0)

'Tap on Done to close QR again'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Done'), 0)

'Wait for screen transition'
Mobile.delay(5)

'Verify Loyalty Benefits again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Loyalty Benefits'), 0)

'Tap "Learn More" again'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Learn More'), 0)

'Wait to view more details'
Mobile.delay(5)

'Verify benefits info is visible again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Included Member Tier Benefits'), 0)

'Tap back to return'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - back'), 0)

'Wait for transition'
Mobile.delay(5)

'Swipe up again 3 times to reach bottom content'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Verify support section after scroll'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Get Support'), 0)

'Verify support call button again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Button - CALL 888-852-2959'), 0)

'Wait before navigating to My Account'
Mobile.delay(5)

'Tap on "My Account" view'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.view.View - My Account'), 0)

'Tap on "WOW Loyalty Member Tier" under My Account'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.view.View - WOW Loyalty Member Tier'), 0)

'Wait before viewing QR'
Mobile.delay(10)

'Tap to open QR Codes again'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Open QR Codes'), 0)

'Wait for QR Code screen'
Mobile.delay(5)

'Verify Loyalty Logo third time'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Image - Loyalty Logo'), 0)

'Verify first name again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Nara'), 0)

'Verify last name again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Khachatryan'), 0)

'Tap Done to close QR display'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - Done'), 0)

'Wait before benefits verification'
Mobile.delay(5)

'Verify Loyalty Benefits third time'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Loyalty Benefits'), 0)

'Tap on "Learn More" to view benefits'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Learn More'), 0)

'Wait for benefits to load'
Mobile.delay(5)

'Verify tier benefits info'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Included Member Tier Benefits'), 0)

'Tap back button'
Mobile.tap(findTestObject('Object Repository/BannerVerification/android.widget.Button - back'), 0)

'Wait for screen transition'
Mobile.delay(5)

'Final swipe up to reach bottom'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Final verification of "Get Support"'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.TextView - Get Support'), 0)

'Final verification of support call button'
assert Mobile.verifyElementExist(findTestObject('Object Repository/BannerVerification/android.widget.Button - CALL 888-852-2959'), 0)

'Close the application after test completion'
Mobile.closeApplication()