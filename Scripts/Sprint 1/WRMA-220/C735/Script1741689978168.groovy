import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Test Data from excel sheet is read'
TestData loginData = findTestData('Data Files/C735 (1)')

'Test Data from excel sheet is read'
String email = loginData.getValue('email', 1)

'Test Data from excel sheet is read'
String password = loginData.getValue('password', 1)

'Application is launched successfully in the Physical device'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true)

Mobile.delay(5)

'Tap on login or signup button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(10)

'email value from excel is given as input'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), email, 0)

Mobile.hideKeyboard()

Mobile.delay(10)

'Tap on Next button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)

Mobile.delay(30)

'email value from excel is given as input'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)

Mobile.hideKeyboard()

Mobile.delay(20)

'password value from excel is given as input'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)

Mobile.hideKeyboard()

Mobile.delay(20)

'Click on login button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)

Mobile.delay(5)

'Tap on Home button'
Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

Mobile.delay(5)

'Tap the Menu and The Menu fly-out is opened'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)

Mobile.delay(5)

'Tap the Term and Condition section'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Terms and Conditions-Menu'), 0)

Mobile.delay(30)

boolean isElementPresent = Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View-Terms and conditions web'), 0)

assert isElementPresent : "Element 'android.view.View-Terms and conditions web' does not exist"
println("Element exists: ${isElementPresent}")

'Application is closed successfully'
Mobile.closeApplication()
