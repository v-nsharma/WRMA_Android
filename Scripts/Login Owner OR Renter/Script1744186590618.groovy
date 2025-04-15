import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

TestData testData = findTestData('Data Files/C751')
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
Mobile.delay(30)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/MyStay/android.widget.TextView - UPCOMING STAYS'), 0)
Mobile.delay(10)

TestObject myStayView = findTestObject('Object Repository/Repo/MyStay/android.view.View (1)')

boolean isElementPresent = Mobile.verifyElementExist(myStayView, 10)
boolean isElementVisible = Mobile.verifyElementVisible(myStayView, 10)

if (isElementPresent && isElementVisible) {
	KeywordUtil.logInfo("Element is present and visible - attempting to tap")
	try {
		Mobile.tap(myStayView, 0)
		KeywordUtil.logInfo("Element was successfully tapped")
	} catch (Exception e) {
		KeywordUtil.markFailed("Failed to tap element: " + e.getMessage())
	}
} else {
	KeywordUtil.markFailed("Element was not present or visible")
}

Mobile.closeApplication()