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
Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

'--- AUTHENTICATION FLOW ---'
'Initiate login process'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter registered email address'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText'), 'PEPOKLE@HOTMAIL.COM', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM authentication'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Next'), 0)
Mobile.delay(40)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (1)'), 'PEPOKLE@HOTMAIL.COM', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Enter account password'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (2)'), 'password', 0)
Mobile.hideKeyboard()
Mobile.delay(5)

'Complete authentication'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - LOGIN'), 0)
Mobile.delay(15)

'--- RESERVATION FLOW ---'
'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.view.View - My Stay'), 0)
Mobile.delay(10)

'Initiate new reservation process'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - ADD A RESERVATION'), 0)
Mobile.delay(10)

'Enter reservation number'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (3)'), '18250674', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to guest information screen'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Enter last name for reservation verification'
Mobile.setText(findTestObject('Object Repository/MystayReservation/android.widget.EditText (4)'), 'DAGAN', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Submit reservation details'
Mobile.tap(findTestObject('Object Repository/MystayReservation/android.widget.Button - Add Reservation'), 0)

'--- ERROR VERIFICATION ---'
'Verify error message appears for invalid reservation'
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Error'), 0)
assert Mobile.verifyElementExist(findTestObject('Object Repository/MystayReservation/android.widget.TextView - Sorry. Your reservation could not be added. Please try again'), 0)

'Close application'
Mobile.closeApplication()