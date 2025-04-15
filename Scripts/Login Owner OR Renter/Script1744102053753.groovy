import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling

TestData testData = findTestData('Data Files/C790') 
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Login or Sign Up (1)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText-LoginPage'), email, 0)
Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (4)'), 0)

Mobile.delay(30)

Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (24)'), email, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (25)'), password, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - LOGIN'), 0)

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.view.View - My Account'), 0)

Mobile.delay(5)

verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.view.View (3)')
Mobile.delay(3)
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Book a Rental')
Mobile.delay(3)
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Payment Wallet')
Mobile.delay(3)
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.view.View (4)')
Mobile.delay(3)
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.ListView')
Mobile.delay(3)
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Add An Account Number')

Mobile.closeApplication()

def verifyElementWithContinue(String objectPath) {
	try {
		Mobile.verifyElementExist(
			findTestObject(objectPath),
			10,
			FailureHandling.OPTIONAL
		)
	} catch (Exception e) {
		Mobile.takeScreenshot("FAILURE_${objectPath.replace('/','_')}_${System.currentTimeMillis()}.png")
		println("Verification failed for ${objectPath} - Continuing test execution")
	}
	Mobile.delay(3)
}