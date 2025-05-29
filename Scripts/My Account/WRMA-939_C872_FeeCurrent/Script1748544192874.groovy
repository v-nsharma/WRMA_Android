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

'Start the application using the specified APK file and reset app data'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

'Wait for the app to load completely'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the home screen'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address into the email input field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), 'KIKEDIAZ981@GMAIL.COM', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the email address'
Mobile.delay(10)

'Tap on the "Next" button to proceed to the next login step'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and the next screen to load'
Mobile.delay(50)

'Tap on the "Accept All Cookies" button in the popup'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after handling the cookies popup'
Mobile.delay(10)

'Re-enter the email address on the main login screen'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), 'KIKEDIAZ981@GMAIL.COM', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Pause briefly'
Mobile.delay(5)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), 'password', 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait after entering the password'
Mobile.delay(5)

'Tap on the "LOGIN" button to sign into the application'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for the login process to complete and the dashboard to load'
Mobile.delay(20)

'Tap on the "My Account" section from the dashboard or menu'
Mobile.tap(findTestObject('Object Repository/WRMA536/android.view.View - My Account'), 0)

'Wait for the My Account screen to load'
Mobile.delay(10)

'Swipe up 4 times to scroll down the screen to reveal more content'
int deviceHeight = Mobile.getDeviceHeight()
int deviceWidth = Mobile.getDeviceWidth()

int startX = deviceWidth / 2
int startY = deviceHeight * 3 / 4
int endX = startX
int endY = deviceHeight / 4

for (int i = 0; i < 4; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Tap on the "View Account Details / Make Payments" option to view payment details'
Mobile.tap(findTestObject('Object Repository/Current/android.widget.TextView - View Account Details  Make Payments'), 0)

'Wait for the account details screen to load'
Mobile.delay(10)

'Tap on the "Maintenance / TaxUse Fee" button to view specific payment information'
Mobile.tap(findTestObject('Object Repository/Current/android.widget.Button - Maintenance  TaxUse Fee'), 0)

'Wait for the account status section to load'
Mobile.delay(10)

'Verify the message "Your Account is Current" is visible on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Current/android.view.View - Your Account is Current'), 0)

'Verify the message "You currently have no payments due" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Current/android.widget.TextView - You currently have no payments due'), 0)

'Close the application to end the test case'
Mobile.closeApplication()