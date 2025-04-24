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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (2.99.69).apk', true)

'Wait for 10 seconds to allow the app to load'
Mobile.delay(10)

'Tap on the Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

'Wait for 10 seconds before proceeding'
Mobile.delay(10)

'Enter email address in the login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), '0425201TM@WG.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 10 seconds'
Mobile.delay(10)

'Tap on the Next button to proceed to the password screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

'Wait for 30 seconds'
Mobile.delay(45)

'Enter the email again in the OAM (Online Account Management) login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), '0425275TM@WG.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(30)

'Enter the password in the OAM password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), 'password', 0)

'Hide the keyboard after entering the password'
Mobile.hideKeyboard()

'Wait for 30 seconds'
Mobile.delay(30)

'Tap on the Login button in the OAM screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

'Wait for 20 seconds to allow login processing'
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/VerifyOwner/android.widget.TextView - My Stay'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VerifyOwner/android.widget.Button - ADD A RESERVATION'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VerifyOwner/android.widget.EditText'), '18702754', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VerifyOwner/android.widget.Button - Next'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VerifyOwner/android.widget.EditText (1)'), 'HUDSON', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VerifyOwner/android.widget.Button - Add Reservation'), 0)

Mobile.delay(10)

assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyOwner/android.widget.TextView - Success'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyOwner/android.widget.TextView - Thank you for adding and associating your Westgate Resorts user account andor reservations'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyOwner/android.widget.TextView - Add Another Account or Reservation'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyOwner/android.widget.Button - Go to App'), 0)

Mobile.closeApplication()

