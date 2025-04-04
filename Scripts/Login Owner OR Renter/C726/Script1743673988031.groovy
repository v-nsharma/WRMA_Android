import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling

TestData testData = findTestData('Data Files/C726')
String username = testData.getValue("username", 1)
String password = testData.getValue("password", 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), username, 0)
Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)

Mobile.delay(30)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), username, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)

Mobile.delay(5)

verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Stay')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Current')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Past Stays')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Error')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - There was a problem loading your stays. Pull down to refresh your stays, or try again later')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Add a Reservation')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Get the most out of your stay by adding it to the Westgate Resorts Mobile App')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - ADD A RESERVATION')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.view.View - My Stay (1)')

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Past Stays'), 0)

Mobile.delay(5)

verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Past Stays')

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