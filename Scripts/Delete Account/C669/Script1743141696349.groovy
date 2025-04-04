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

def testData = findTestData('Data Files/C669')
def email = testData.getValue('email', 1)
def password = testData.getValue('password', 1)
def deleteConfirmation = testData.getValue('delete_confirmation', 1) 

Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/universal.apk', true)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-NewUserName-LoginPage'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Next'), 0)
Mobile.delay(30)

Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Login)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-OAM(Password)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button -OAM(Login)'), 0)
Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - menu'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TabWidget-Settings'), 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Delete My Account'), 0)
Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Deleting your account will also delete your Online Account Management profile, and if youre a W.O.W. Loyalty Member or participate in the Westgate Travel Partner program, your benefits will be disrupted'), 0)
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - If you proceed, it can take up to two days for your account to be fully purged from our system'), 0)

Mobile.delay(10)

Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-DeleteConfirmationMessage'), deleteConfirmation, 0)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Delete'), 0)
Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Sorry to see you go'), 10)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Done'), 0)
Mobile.delay(10)

Mobile.closeApplication()