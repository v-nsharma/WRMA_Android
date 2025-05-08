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

'Tap on the "View Stay Details" button'
Mobile.tap(findTestObject('Object Repository/Resort/android.widget.TextView - View Stay Details'), 0)

'Wait before checking weather section'
Mobile.delay(10)

'Verify "Expected Weather Forecast" title is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Expected Weather Forecast'), 0)

'Verify Thursday weather date is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Thu May 8'), 0)

'Verify Thursday weather icon is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Image - weather icon'), 0)

'Verify Thursday temperature is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - 79  56'), 0)

'Verify Friday weather date is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Fri May 9'), 0)

'Verify Friday weather icon is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Image - weather icon (1)'), 0)

'Verify Friday temperature is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - 75  53'), 0)

'Verify Saturday weather date is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - Sat May 10'), 0)

'Verify Saturday weather icon is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.Image - weather icon (2)'), 0)

'Verify Saturday temperature is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Resort/android.widget.TextView - 71  56'), 0)

'Close the application'
Mobile.closeApplication()
