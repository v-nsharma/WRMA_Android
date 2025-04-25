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

'Launch application from global URL with data clearing'
Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (1)'), 0)
Mobile.delay(10)

'Enter test email in email field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (3)'), 'CGARNER024@GMAIL.COM', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM authentication'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Extended wait for OAM screen to load completely'
Mobile.delay(30)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (24)'), 'CGARNER024@GMAIL.COM', 0)
Mobile.hideKeyboard()
Mobile.delay(20)

'Enter test password'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (25)'), 'password', 0)
Mobile.hideKeyboard()
Mobile.delay(20)

'Complete authentication by tapping LOGIN'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Account'), 0)
Mobile.delay(10)

'Verify My Account view exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.view.View'), 0)
Mobile.delay(10)

'Verify Add Account Number option exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - Add An Account Number'), 0)
Mobile.delay(10)

'Navigate to Book Now section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - Book Now'), 0)
Mobile.delay(30)

'Capture screenshot of booking screen'
String screenshotPath = '/tmp/booking_screen_' + System.currentTimeMillis() + '.png'
Mobile.takeScreenshot(screenshotPath)

'Verify Westgate Resorts branding exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - WESTGATE RESORTS'), 0)

'Close application after test completion'
Mobile.closeApplication()