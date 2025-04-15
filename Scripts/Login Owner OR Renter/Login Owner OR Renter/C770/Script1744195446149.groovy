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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

TestData testData = findTestData('Data Files/C770')
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true) 
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - Next'), 0)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/BookRental/android.view.View - Home'), 0)
Mobile.delay(10)

Mobile.scrollToText('recommended for you')

String[] elementsToVerify = [
	'Object Repository/Repo/MyStay/BookRental/android.view.View',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Book a Rental',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Plan, book  save with',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Westgate Resorts',
	'Object Repository/Repo/MyStay/BookRental/android.widget.TextView - Book Now'
]

for (String elementPath : elementsToVerify) {
	Mobile.verifyElementExist(findTestObject(elementPath), 10, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.closeApplication()

