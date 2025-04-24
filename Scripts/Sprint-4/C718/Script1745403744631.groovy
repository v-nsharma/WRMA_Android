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

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Login or Sign Up'), 0)

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText'), 'Henry@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Next'), 0)

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText (1)'), 'Henry@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Next (1)'), 0)

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText (2)'), 'Mark', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText (3)'), 'Henry', 0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/LoginFlow/android.widget.EditText (4)'), 'password')

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/LoginFlow/android.widget.EditText (5)'), 'password')

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Next (2)'), 0)

Mobile.scrollToText('etc')

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.Button - Agree to Terms  Conditions'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.Button - I Do Not Agree'), 0)

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Agree to Terms  Conditions'), 0)

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText (6)'), 'Henry@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/LoginFlow/android.widget.EditText (7)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - LOGIN'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.TextView - Verify Account'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.TextView - Please Confirm Your Email'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.TextView - Resend Confirmation Email'), 
    0)

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Next (3)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/LoginFlow/android.widget.TextView - Westgate Online Account Created'), 
    0)

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.Button - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/LoginFlow/android.widget.TextView - My Account'), 0)

Mobile.closeApplication()

