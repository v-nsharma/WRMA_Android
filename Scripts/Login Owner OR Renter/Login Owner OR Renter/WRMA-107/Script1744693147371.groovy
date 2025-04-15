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
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository

TestData testData = findTestData('Data Files/WRMA-107')
String email = testData.getValue('Email', 1)
String password = testData.getValue('Password', 1)
String accountNumber = testData.getValue('AccountNumber', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - Next'), 0)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.Button - LOGIN'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddReservation/android.view.View - My Account'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddReservation/android.widget.TextView - Add An Account Number'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddReservation/android.widget.EditText (3)'), accountNumber, 0)
Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/AddReservation/android.widget.TextView -  Account number should be 7-11 digits'),
	0)

boolean isExist = Mobile.verifyElementExist(findTestObject('Object Repository/AddReservation/android.widget.TextView -  Account number should be 7-11 digits'),0)

assert isExist == true : "The expected element exist!"

Mobile.closeApplication()