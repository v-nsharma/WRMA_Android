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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-Version 2.99.68.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText'), '0425201TM@WG.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next'), 0)

Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (1)'), '0425201TM@WG.COM', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (2)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - LOGIN'), 0)

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - My Account'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - Add An Account Number'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (3)'), '99929032862', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.TextView - Social Security Number'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/C708/android.widget.EditText (4)'), '12345', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/C708/android.widget.Button - Next (1)'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Error'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Account Number'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - There was a problem adding or associating your account'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.TextView - Your social security number for this account does not match our records. Please try again'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/C708/android.widget.Button - Back to Verify'), 0)

Mobile.closeApplication()

