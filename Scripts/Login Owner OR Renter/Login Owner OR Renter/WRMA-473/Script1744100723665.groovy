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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (1)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (3)'), 'Samm@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Account'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.view.View'), 0)

Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - Add An Account Number'), 
    0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - Book Now'), 0)

Mobile.delay(30)

Mobile.takeScreenshot('/var/folders/31/bxrgywy908s0_m3f2mfxp_cc0000gn/T/screenshot7822840804442700393.png')

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - WESTGATE RESORTS'), 0)

Mobile.closeApplication()

