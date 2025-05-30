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

'Launch application from specified APK path with data clearing'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-106.apk', true)
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter registered email address'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText'), '0525041tm@wg.com', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM authentication screen'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Next'), 0)
Mobile.delay(50)

Mobile.tap(findTestObject('Object Repository/LoyaltyWeb/android.widget.Button - Accept All Cookies'), 0)


'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (1)'), '0525041tm@wg.com', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Enter account password'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (2)'), 'password', 0)
Mobile.hideKeyboard()
Mobile.delay(15)

'Complete authentication by tapping LOGIN'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - LOGIN'), 0)
Mobile.delay(25)

'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.view.View - My Stay'), 0)
Mobile.delay(10)

int deviceHeight = Mobile.getDeviceHeight()
int deviceWidth = Mobile.getDeviceWidth()

int startX = deviceWidth / 2
int startY = deviceHeight * 3 / 4
int endX = startX
int endY = deviceHeight / 4

for (int i = 0; i < 8; i++) {
	Mobile.swipe(startX, startY, endX, endY)
	Mobile.delay(1)
}

'Initiate new reservation process'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - ADD A RESERVATION'), 0)
Mobile.delay(10)

'Enter reservation number'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (3)'), '18560497', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to guest information screen'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Enter last name for reservation verification'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (4)'), 'WANG', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Submit reservation details'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Add Reservation'), 0)
Mobile.delay(10)

'Verify successful reservation addition'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Success'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Add Another Reservation'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Thank you for adding your Westgate Resorts reservations'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Thank You'), 0)

'Complete reservation process'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Next (1)'), 0)

'Close application after test completion'
Mobile.closeApplication()