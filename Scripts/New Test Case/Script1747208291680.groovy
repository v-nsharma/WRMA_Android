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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.93.apk', true)

Mobile.setText(findTestObject('Object Repository/WRMA536/android.widget.EditText'), '0525041tm@wg.com', 0)

Mobile.setText(findTestObject('Object Repository/WRMA536/android.widget.EditText (1)'), '0525041tm@wg.com', 0)

Mobile.tap(findTestObject('Object Repository/WRMA536/android.view.View - My Account'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.view.View'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Mortgage Payment is Past Due'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Westgate Vacation Villas Resort'), 
    0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Amount Due 16371.8'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA536/android.widget.TextView - Pay Now'), 0)

Mobile.closeApplication()

