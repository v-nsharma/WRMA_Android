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

'Start the application from the given APK file'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for login screen'
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(10)

'Tap on "Next" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and next screen to load'
Mobile.delay(40)

'Tap on "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup interaction'
Mobile.delay(10)

'Re-enter email address on login screen'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(5)

'Enter password'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering password'
Mobile.delay(5)

'Tap on "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete'
Mobile.delay(20)

'Tap on "My Account"'
Mobile.tap(findTestObject('Object Repository/Resort/android.view.View - My Account'), 0)

'Wait for account section to load'
Mobile.delay(20)

'Tap on "View Account Details / Make Payments"'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.TextView - View Account Details  Make Payments'), 0)

'Wait for screen to load'
Mobile.delay(10)

'Tap on "Owner Contact Information"'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.Button - Owner Contact Information'), 0)

'Wait for contact info screen'
Mobile.delay(10)

'Scroll to "edit address and phone number" section'
Mobile.scrollToText('edit address and phone number')

'Wait after scroll'
Mobile.delay(5)

'Tap on "Edit Address and Phone Numbers"'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.TextView - Edit Address and Phone Numbers'), 0)

'Wait for edit screen to load'
Mobile.delay(10)

'Verify "Edit Contact" section exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Edit Contact'), 0)

'Verify "Primary Address" section exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Primary Address'), 0)

'Verify "Address Line 1" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Address Line 1'), 0)

'Verify "Address Line 2" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Address Line 2'), 0)

'Verify "Address Line 3" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Address Line 3'), 0)

'Verify "City" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - City'), 0)

'Verify "ZIP Code" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - ZIP Code'), 0)

'Verify "Home Phone" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Home Phone'), 0)

'Get screen dimensions for swipe gestures'
int screenHeight = Mobile.getDeviceHeight()
int screenWidth = Mobile.getDeviceWidth()

'Set swipe coordinates for vertical swipe'
int swipeStartX = screenWidth / 2
int swipeStartY = screenHeight * 3 / 4
int swipeEndX = swipeStartX
int swipeEndY = screenHeight / 4

'Swipe up 3 times to reach Save button'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify "Phone Number" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Phone Number'), 0)

'Verify "Mobile Phone" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Mobile Phone'), 0)

'Verify "Extension" field exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Extension'), 0)

'Swipe up 3 times to reach Save button'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Tap on "Save" button'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.Button - Save'), 0)

'Wait for confirmation screen'
Mobile.delay(5)

'Verify "Westgate Town Center Resort" screen exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Westgate Town Center Resort (1)'), 0)

'Close the application'
Mobile.closeApplication()
