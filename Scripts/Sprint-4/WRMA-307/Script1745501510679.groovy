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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-Version-2.99.70.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText-login'), 'PEPOKLE@HOTMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (1)'), 'PEPOKLE@HOTMAIL.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - LOGIN'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - My Stay'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - View Stay Details'), 0)

Mobile.delay(10)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Reservation number 18529078'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Westgate Palace'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Dec 25 - Jan 1'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Dec 25 - Jan 1, 2027  2 Bedroom'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.view.View - Check In'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - 400 PM'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.view.View - Check Out'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - 1000 AM'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.view.View - My Stay Details'), 0)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.view.View - My Stay Details'), 0)

Mobile.delay(5)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - My Stay Details'), 10)

Mobile.closeApplication()

