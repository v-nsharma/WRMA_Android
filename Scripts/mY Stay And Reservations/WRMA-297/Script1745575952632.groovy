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

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText'), 'ELPHA@ELPHA.DEMON.CO.UK', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (1)'), 'ELPHA@ELPHA.DEMON.CO.UK', 
    0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/MyStayOverDue/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - My Stay'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Your Maintenance  TaxUse Fee payment of 1,046.38 is past due'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Oct 04, 2026 - Oct 11, 2026'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Oct 05, 2025 - Oct 12, 2025'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/MyStayOverDue/android.widget.TextView - Your Maintenance  TaxUse Fee payment of 1,046.38 is past due (1)'), 
    0)

Mobile.closeApplication()

