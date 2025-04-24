import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository as OR
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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)\

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText (5)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Terms and Conditions'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Done'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.view.View - My Account'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.TextView - Add An Account Number'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOAusers/android.widget.EditText'), '26713899727', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next (2)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Image'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Friday, April 11'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Next'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

boolean isElementPresent = Mobile.verifyElementExist(OR.findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

assert isElementPresent : "Element 'Back to Verify' button does not exist on the screen!"

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOAusers/android.widget.Button - Back to Verify'), 0)

Mobile.closeApplication()

