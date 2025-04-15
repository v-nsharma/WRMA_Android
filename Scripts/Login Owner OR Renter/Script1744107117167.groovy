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

TestData testData = findTestData('Data Files/C790')
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (2)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (4)'), email, 0)
Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (2)'), 0)

Mobile.delay(30)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (5)'), email, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (6)'), password, 0)
Mobile.hideKeyboard()

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN (1)'), 0)

Mobile.delay(20)

verifyElementWithContinue('Object Repository/Repo/MyStay/android.view.View - My Stay (2)')

Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay (2)'), 0)

Mobile.delay(5)

verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - You dont have any upcoming stays associated with your profile')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Add a Reservation (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Get the most out of your stay by adding it to the Westgate Resorts Mobile App (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - ADD A RESERVATION (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Stay (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Current (1)')
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Past Stays (1)')

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

