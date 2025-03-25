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

'Retrieve test data for login credentials'
TestData testData = findTestData("Data Files/C722")

'Extract username and password from test data'
String username = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

'Launch the application'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

Mobile.delay(10)

'Tap on Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

'Enter username in Login or Sign Up field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), username, 0)

'Hide keyboard after entering username'
Mobile.hideKeyboard()

Mobile.delay(10)

'Tap on Next button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

Mobile.delay(30)

'Enter username in OAM Login field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), username, 0)

'Hide keyboard after entering username'
Mobile.hideKeyboard()

Mobile.delay(30)

'Enter password in OAM Password field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

'Hide keyboard after entering password'
Mobile.hideKeyboard()

Mobile.delay(20)

'Tap on LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - LOGIN'), 0)

Mobile.delay(10)

'Tap on Home button'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

Mobile.delay(10)

'Tap on Menu button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

Mobile.delay(10)

'Navigate to Settings tab'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget-Settings'), 0)

Mobile.delay(20)

'Verify Logout button is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - LOGOUT'), 0)

'Retrieve text of Logout button'
Mobile.getText(findTestObject('Object Repository/Repo/android.widget.Button - LOGOUT'), 0)

'Retrieve text displaying Signed in user information'
Mobile.getText(findTestObject('Object Repository/Repo/android.widget.Button - Signed in As 03205198tmwg.com'), 0)

Mobile.delay(30)

'Tap on Logout button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - LOGOUT'), 0)

'Close the application'
Mobile.closeApplication()
