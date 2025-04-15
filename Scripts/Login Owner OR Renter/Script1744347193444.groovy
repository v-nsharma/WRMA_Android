import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable

TestData testData = findTestData('Data Files/WRMA-267') 

String email = testData.getValue('Email', 1)
String password = testData.getValue('Password', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true) 
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Next'), 0)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - LOGIN'), 0)
Mobile.delay(30)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Link Accounts'), 0)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - You MUST select a name from each account'), 0)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Names with a strikethrough have already been selected by another user'), 0)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions'), 0)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.CheckBox'), 0)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.CheckBox'), 0)
Mobile.delay(15)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions (1)'), 0)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.Button - Confirm Identity'), 0)
Mobile.delay(5)

try {
	Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions (1)'), 0)
	Mobile.delay(5)
	
	try {
		Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.view.View'), 0)
		Mobile.delay(5)
		println("Terms and Conditions view displayed successfully")
	} catch (Exception e) {
		println("Failed to verify Terms and Conditions view: " + e.getMessage())
		Mobile.takeScreenshot()
		throw e 
	}
	
	try {
		Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.Button - Done'), 0)
		Mobile.delay(5)
		println("Done button displayed successfully")
	} catch (Exception e) {
		println("Failed to verify Done button: " + e.getMessage())
		Mobile.takeScreenshot()
		throw e
	}
	
	try {
		Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Done'), 0)
		Mobile.delay(5)
		println("Successfully tapped Done button")
	} catch (Exception e) {
		println("Failed to tap Done button: " + e.getMessage())
		Mobile.takeScreenshot()
		throw e
	}
	
} catch (Exception generalException) {
	println("An error occurred in the Terms and Conditions flow: " + generalException.getMessage())
	Mobile.takeScreenshot()
	throw generalException 
}

Mobile.closeApplication()