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

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (1)'), 'SELENAWB@GMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.view.View - My Account'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Image'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Terms and Conditions'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Done'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.view.View - My Account'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Add An Account Number'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/VOA-Users/android.widget.EditText (3)'), '26713899727', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Image (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Today, Tuesday, April 15'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/VOA-Users/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Error'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Account Number'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Select a verification method'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View (1)'), 0)

boolean errorTextExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Error'), 0)
boolean accountNumberExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Account Number'), 0)
boolean viewExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View'), 0)
boolean selectVerificationExists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.widget.TextView - Select a verification method'), 0)
boolean view1Exists = Mobile.verifyElementExist(findTestObject('Object Repository/VOA-Users/android.view.View (1)'), 0)

assert errorTextExists && accountNumberExists && viewExists && selectVerificationExists && view1Exists : "One or more UI elements are missing!"


Mobile.closeApplication()

