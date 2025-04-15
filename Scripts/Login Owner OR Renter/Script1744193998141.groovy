import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable
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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true) // Store path in GlobalVariable
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)
Mobile.delay(40)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
Mobile.delay(30)

String[] elementsToVerify = [
	'Object Repository/Repo/MyStay/android.widget.TextView - ACTIVE STAYS',
	'Object Repository/Repo/MyStay/android.widget.TextView - SEE ALL'
]

for (String elementPath : elementsToVerify) {
	Mobile.verifyElementExist(findTestObject(elementPath), 10)
}

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View (2)'), 0)
Mobile.scrollToText('CALL')

Mobile.closeApplication()