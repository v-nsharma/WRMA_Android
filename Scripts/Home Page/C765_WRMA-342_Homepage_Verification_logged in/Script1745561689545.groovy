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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Launch the application from specified APK path with data clearing'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app initialization'
Mobile.delay(10)

'Tap on Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (1)'), 0)

'Wait 10 seconds for login screen to load'
Mobile.delay(10)

'Enter email address in email field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (3)'), '0425201TM@WG.COM', 0)

'Hide the keyboard after email entry'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Tap Next button to proceed to password screen'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (1)'), 0)

'Wait 10 seconds for password screen transition'
Mobile.delay(10)

'Extended wait (30s) for OAM login screen to fully load'
Mobile.delay(30)

'Re-enter email in OAM username field for verification'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (24)'), '0425201TM@WG.COM', 0)

'Hide the keyboard after username entry'
Mobile.hideKeyboard()

'Wait 20 seconds before password entry'
Mobile.delay(20)

'Enter password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (25)'), 'password', 0)

'Hide the keyboard after password entry'
Mobile.hideKeyboard()

'Wait 20 seconds before final login attempt'
Mobile.delay(20)

'Tap LOGIN button to complete authentication'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - LOGIN'), 0)

'Wait 20 seconds for login completion and home screen load'
Mobile.delay(20)

'Tap on Home navigation button'
Mobile.tap(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

'Wait 15 seconds for home screen content to load'
Mobile.delay(15)

'Verify basic text view element exists on home screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView'), 0)

'Perform right-to-left swipe gesture on screen'
Mobile.swipe(800, 500, 100, 500)

'Wait 10 seconds after swipe action'
Mobile.delay(10)

'Scroll down to find recommended section'
Mobile.scrollToText('recommended')

'Wait 10 seconds after scrolling'
Mobile.delay(10)

'Verify Book a Rental option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Book a Rental'), 0)

'Verify RECOMMENDED FOR YOU section exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - RECOMMENDED FOR YOU'), 0)

'Verify Home navigation option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

'Verify My Account option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - My Account'), 0)

'Close the application after test completion'
Mobile.closeApplication()

