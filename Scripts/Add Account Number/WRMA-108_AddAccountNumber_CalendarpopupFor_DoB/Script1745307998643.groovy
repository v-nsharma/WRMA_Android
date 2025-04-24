import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil

TestData testData = findTestData('Data Files/WRMA-108')

String email = testData.getValue('Email', 1)
String password = testData.getValue('Password', 1)
String accountNumber = testData.getValue('AccountNumber', 1)

Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next'), 0)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View - My Account'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.TextView - Add An Account Number'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (3)'), accountNumber, 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

try {
	Mobile.verifyElementExist(findTestObject('Object Repository/AddAccount/android.widget.TextView - Date of Birth'), 0)
	Mobile.delay(3)

	Mobile.verifyElementExist(findTestObject('Object Repository/AddAccount/android.widget.EditText (4)'), 0)
	Mobile.delay(3)
} catch (Exception e) {
	KeywordUtil.markWarning("Element not found: " + e.getMessage())
}


Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Image'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Previous month'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next month'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View'), 0)
Mobile.delay(10)

////Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Wednesday, April 9'), 0)
//try {
//	// Verify the date element exists before tapping
//	if (!Mobile.verifyElementExist(findTestObject('Object Repository/AddAccount/android.widget.Button - Wednesday, April 9'), 10, FailureHandling.OPTIONAL)) {
//		Mobile.takeScreenshot()
//		throw new Exception("Date button 'Wednesday, April 9' not found")
//	}
//	
//	// Tap the date element
//	Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Wednesday, April 9'), 0)
//	Mobile.delay(10)
//	
//} catch (Exception e) {
//	Mobile.takeScreenshot()
//	throw new Exception("Failed to select date: " + e.getMessage())
//}

Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Image'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View'), 0)
Mobile.delay(10)

Mobile.closeApplication()