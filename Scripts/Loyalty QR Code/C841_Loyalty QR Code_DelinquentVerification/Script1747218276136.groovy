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
import com.kms.katalon.core.util.KeywordUtil

'Start the application using the specified APK and reset app data'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.93.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on the "Login or Sign Up" button on the landing screen'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Login or Sign Up'), 0)

'Wait for the next screen to load'
Mobile.delay(10)

'Enter email address in the email input field'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText'), 'JANDER55@COMCAST.NET', 0)

'Hide the keyboard after entering email'
Mobile.hideKeyboard()

'Pause before continuing'
Mobile.delay(10)

'Tap the "Next" button to proceed with login'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Next'), 0)

'Wait for the cookies consent popup'
Mobile.delay(50)

'Tap the "Accept All Cookies" button'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - Accept All Cookies'), 0)

'Wait for the login screen to load completely'
Mobile.delay(20)

'Re-enter the email address in the login form'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText (1)'), 'JANDER55@COMCAST.NET', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Pause briefly'
Mobile.delay(5)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/PRClub/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Pause briefly'
Mobile.delay(5)

'Tap the "LOGIN" button to submit credentials'
Mobile.tap(findTestObject('Object Repository/PRClub/android.widget.Button - LOGIN'), 0)

'Wait for login and navigation to complete'
Mobile.delay(15)

'Tap on the QR code icon to view loyalty membership'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Image'), 0)

'Wait for the loyalty screen to load'
Mobile.delay(10)

'Assert that the past due message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - You must pay your past due amount before you can use your Loyalty Membership'), 0)

'Assert that the "Make a Payment" option is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Make a Payment'), 0)

'Assert that the user name "John" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - John'), 0)

'Assert that the QR code is blurred due to past due status'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.Image - qr_code_blur'), 0)

'Assert that the "Member Since" label is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Member Since'), 0)

'Assert that the membership start year "2022" is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 2022'), 0)

'Assert that the "Loyalty" label is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Loyalty'), 0)

'Assert that the loyalty number is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 717478788'), 0)

'Assert that "Waterpark" benefit or section is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Waterpark'), 0)

'Tap on the "Done" button to close the banner'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Button - Done'), 0)

'Wait for the screen to return to previous state'
Mobile.delay(10)

'Tap on "My Stay" section'
Mobile.tap(findTestObject('Object Repository/C841/android.view.View - My Stay'), 0)

Mobile.delay(10)

'Tap on the QR icon again from My Stay'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Image (1)'), 0)

'Assert past due banner message is shown again in My Stay'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - You must pay your past due amount before you can use your Loyalty Membership'), 0)

'Assert Make a Payment option is shown again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Make a Payment'), 0)

'Assert user name is still visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - John'), 0)

'Assert QR code is blurred again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.Image - qr_code_blur'), 0)

'Assert "Member Since" is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Member Since'), 0)

'Assert membership year is displayed again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 2022'), 0)

'Assert Loyalty label is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Loyalty'), 0)

'Assert loyalty number is present again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 717478788'), 0)

'Assert "Waterpark" text is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Waterpark'), 0)

'Tap on the "Done" button'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Button - Done'), 0)

'Wait before continuing'
Mobile.delay(10)

'Tap on "View Stay Details" button'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.TextView - View Stay Details'), 0)

'Wait for navigation'
Mobile.delay(5)

'Tap QR icon from stay details page'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Image (2)'), 0)

'Wait for the banner to load'
Mobile.delay(5)

'Verify past due warning on stay details page'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - You must pay your past due amount before you can use your Loyalty Membership'), 0)

'Verify Make a Payment option is still shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Make a Payment'), 0)

'Verify user name is still John'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - John'), 0)

'Verify QR code remains blurred'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.Image - qr_code_blur'), 0)

'Verify Member Since is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Member Since'), 0)

'Verify 2022 is the membership year'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 2022'), 0)

'Verify Loyalty label exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Loyalty'), 0)

'Verify loyalty number is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 717478788'), 0)

'Verify Waterpark is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Waterpark'), 0)

'Tap Done to exit banner'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Button - Done'), 0)

'Wait before navigating back'
Mobile.delay(5)

'Tap the back button'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Button - back'), 0)

'Wait before opening My Account'
Mobile.delay(5)

'Tap on My Account tab'
Mobile.tap(findTestObject('Object Repository/C841/android.view.View - My Account'), 0)

'Wait for the section to load'
Mobile.delay(5)

'Tap on the QR icon in My Account'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Image (1)'), 0)

'Assert past due message in My Account'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - You must pay your past due amount before you can use your Loyalty Membership'), 0)

'Assert Make a Payment is present'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Make a Payment'), 0)

'Assert user name John is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - John'), 0)

'Assert blurred QR code shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.Image - qr_code_blur'), 0)

'Assert Member Since is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Member Since'), 0)

'Assert 2022 membership year is correct'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 2022'), 0)

'Assert Loyalty text is shown'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Loyalty'), 0)

'Assert loyalty number is visible'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - 717478788'), 0)

'Assert Waterpark text exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C841/android.widget.TextView - Waterpark'), 0)

'Tap Done to exit the banner'
Mobile.tap(findTestObject('Object Repository/C841/android.widget.Button - Done'), 0)

'Close the application'
Mobile.closeApplication()
