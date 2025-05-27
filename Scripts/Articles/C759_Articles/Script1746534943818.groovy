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

'Start the application from the specified APK file'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen'
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0525071TM@WG.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email address'
Mobile.delay(10)

'Tap on "Next" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and next screen to load'
Mobile.delay(60)

'Tap on "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup interaction'
Mobile.delay(10)

'Re-enter email address on login screen'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0525071TM@WG.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email address'
Mobile.delay(5)

'Enter password in the password field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering password'
Mobile.delay(5)

'Tap on "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete'
Mobile.delay(20)

'Swipe horizontally to view article'
Mobile.swipe(900, 500, 100, 500)

'Wait after swipe'
Mobile.delay(15)

'Tap on article titled "How to Cook in a Hotel Room and Save Money Updated 2025"'
Mobile.tap(findTestObject('Object Repository/Article/android.widget.TextView - How to Cook in a Hotel Room and Save Money Updated 2025'), 0)

'Wait for article details to load'
Mobile.delay(5)

'Verify article title exists on detail screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - How to Cook in a Hotel Room and Save Money Updated 2025 (1)'), 0)

'Get screen dimensions for swipe gestures'
int screenHeight = Mobile.getDeviceHeight()
int screenWidth = Mobile.getDeviceWidth()

'Set swipe coordinates for vertical swipe'
int swipeStartX = screenWidth / 2
int swipeStartY = screenHeight * 3 / 4
int swipeEndX = swipeStartX
int swipeEndY = screenHeight / 4

'Swipe up 3 times to scroll through article content'
for (int i = 0; i < 6; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Tap on share icon'
Mobile.tap(findTestObject('Object Repository/Article/android.widget.Image'), 0)

'Wait for share options to appear'
Mobile.delay(5)

'Verify "Quick Share" option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - Quick Share'), 0)

'Verify "Chrome" option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - Chrome'), 0)

'Verify "Messages" option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - Messages'), 0)

'Verify "Bluetooth" option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - Bluetooth'), 0)

'Verify "Save" option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Article/android.widget.TextView - Save'), 0)

'Tap on background (ScrollView) to dismiss share popup'
Mobile.tap(findTestObject('Object Repository/Article/android.widget.ScrollView'), 0)

'Wait after dismissing popup'
Mobile.delay(5)

'Tap on "Back" button to exit article'
Mobile.tap(findTestObject('Object Repository/Article/android.widget.Button - back'), 0)

'Close the application'
Mobile.closeApplication()
