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

'Tap on Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for login screen'
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(10)

'Tap on Next button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and next screen to load'
Mobile.delay(40)

'Tap on Accept All Cookies button'
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

'Tap on LOGIN button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete'
Mobile.delay(20)

'Tap on My Account'
Mobile.tap(findTestObject('Object Repository/Resort/android.view.View - My Account'), 0)

'Wait after tapping My Account'
Mobile.delay(20)

'Tap on View Account Details / Make Payments'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.TextView - View Account Details  Make Payments'), 0)

'Wait after navigating to account details'
Mobile.delay(10)

'Verify Westgate Town Center Resort text exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Westgate Town Center Resort'), 0)

'Verify Account Number text exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Account 99485515680'), 0)

'Verify Not Deeded label exists (1st instance)'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Not Deeded'), 0)

'Verify Not Deeded label exists (2nd instance)'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Not Deeded'), 0)

'Verify BOOK A STAY button exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Button - BOOK A STAY'), 0)

'Verify VIEW USAGE button exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Button - VIEW USAGE'), 0)

'Verify Account Details button exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Button - Account Details'), 0)

'Verify Account Documents button exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Button - Account Documents'), 0)

'Tap on Account Documents button'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.Button - Account Documents'), 0)

'Wait after opening Account Documents'
Mobile.delay(10)

'Verify 2024-2026 Timeshare Calendar view exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.view.View - 2024-2026 Timeshare Calendar'), 0)

'Verify Download button exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Button - Download'), 0)

'Tap on Download button'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.Button - Download'), 0)

'Wait after attempting download'
Mobile.delay(5)

'Verify Download failed message exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Download failed. Please try again'), 0)

'Close the application'
Mobile.closeApplication()
