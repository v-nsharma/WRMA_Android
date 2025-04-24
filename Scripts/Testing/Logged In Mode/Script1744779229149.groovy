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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText'), 'Stoinis@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText (1)'), 'Stoinis@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Settings/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.view.View - Home (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.Button - menu'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Settings/android.widget.TabWidget'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - Home'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - My Stay'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - My Account (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.Button - Version 2.99.41'), 0)

boolean isHomePresent = Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - Home'), 0)

boolean isMyStayPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - My Stay'), 0)

boolean isMyAccountPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.view.View - My Account (1)'), 0)

boolean isVersionPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Settings/android.widget.Button - Version 2.99.41'), 0)

assert isHomePresent && isMyStayPresent && isMyAccountPresent && isVersionPresent : "One or more expected elements are missing on the Settings screen!"

Mobile.closeApplication()

