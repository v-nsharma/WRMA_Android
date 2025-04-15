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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'Stoinis@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (1)'), 'Stoinis@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.view.View - My Account'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Add An Account Number'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (3)'), '69099564838', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - First Payment Due Date'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - First Payment Due Date (1)'), 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Wednesday, April 9'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

boolean isErrorTextPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Error'), 0)

boolean isAccountNumberPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Account Number'), 0)

boolean isViewPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.view.View'), 0)

assert isErrorTextPresent && isAccountNumberPresent && isViewPresent : "One or more expected elements are not present!"

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Monthly Payment Amount'), 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Monthly Payment Amount'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (4)'), '1000', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

boolean isVerifyAccountPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - Verify Account'), 0)

boolean isTextPresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.view.View'), 0)

boolean isErrorMessagePresent = Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.TextView - There was a problem adding or associating your account'), 0)

assert isVerifyAccountPresent && isTextPresent && isErrorMessagePresent : "One or more expected UI elements are missing!"

Mobile.closeApplication()

