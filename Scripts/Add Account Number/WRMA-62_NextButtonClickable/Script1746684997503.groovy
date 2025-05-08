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

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-2.99.86.apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText'), 'mjjr@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Next'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText (1)'), 'mjjr@yopmail.com', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Next (1)'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText (2)'), 'michael', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText (3)'), 'jackson', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.sendKeys(findTestObject('Object Repository/WRMA-62/android.widget.EditText (4)'), 'password')

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.sendKeys(findTestObject('Object Repository/WRMA-62/android.widget.EditText (5)'), 'password')

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Next (2)'), 0)

Mobile.delay(5)

'Get screen dimensions for swipe gestures'
int screenHeight = Mobile.getDeviceHeight()
int screenWidth = Mobile.getDeviceWidth()

'Set swipe coordinates for vertical swipe'
int swipeStartX = screenWidth / 2
int swipeStartY = screenHeight * 3 / 4
int swipeEndX = swipeStartX
int swipeEndY = screenHeight / 4

'Swipe up 3 times to reach Save button'
for (int i = 0; i < 8; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Agree to Terms  Conditions'), 0)

Mobile.delay(40)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Accept All Cookies'), 0)

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText (6)'), 'mj@yopmail.com', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.setText(findTestObject('Object Repository/WRMA-62/android.widget.EditText (7)'), 'password', 0)

Mobile.hideKeyboard()

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - LOGIN'), 0)

Mobile.delay(20)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA-62/android.widget.TextView - Verify Account'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA-62/android.widget.TextView - Please Confirm Your Email'), 0)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Next (3)'), 0)

Mobile.delay(10)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA-62/android.widget.TextView - Thank You'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA-62/android.widget.TextView - Westgate Online Account Created'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/WRMA-62/android.widget.TextView - Youve chosen to skip the email verification process. While you can explore the app as a guest, please note that certain features and functionalities may be limited'), 0)

Mobile.tap(findTestObject('Object Repository/WRMA-62/android.widget.Button - Next (2)'), 0)

Mobile.closeApplication()

