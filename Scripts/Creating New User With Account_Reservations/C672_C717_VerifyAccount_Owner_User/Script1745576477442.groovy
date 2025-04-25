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
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug-Version-2.99.70.apk', true)
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter test email in email field'
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText'), 'hellops09@yopmail.com', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM authentication screen'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Next'), 0)
Mobile.delay(40)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText (1)'), 'hellops09@yopmail.com', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText (2)'), 'password', 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Complete authentication by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - LOGIN'), 0)
Mobile.delay(10)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.view.View - My Account'), 0)
Mobile.delay(10)

'Initiate account linking process'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.TextView - Add An Account Number'), 0)
Mobile.delay(10)

'Enter valid account number'
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText (3)'), '18560485', 0)
Mobile.delay(10)

'Submit account number for verification'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Enter Internet Access Code'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.TextView - Internet Access Code'), 0)
Mobile.delay(10)
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText (4)'), '8d40fec4', 0)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Open calendar picker for date selection'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Image'), 0)
Mobile.delay(10)

'Review Terms and Conditions'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.TextView - Terms and Conditions'), 0)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Done'), 0)
Mobile.delay(10)

'Enter Social Security Number'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.TextView - Social Security Number'), 0)
Mobile.delay(10)
Mobile.setText(findTestObject('Object Repository/C672-C717/android.widget.EditText (5)'), '383506406', 0)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Capture screenshot of verification screen'
String timestamp = String.valueOf(System.currentTimeMillis())
String screenshotPath = '/tmp/verification_' + timestamp + '.png'
Mobile.takeScreenshot(screenshotPath)

'Reopen calendar picker'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Image'), 0)
Mobile.delay(10)

'Verify Terms and Conditions link exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/C672-C717/android.widget.TextView - Terms and Conditions'), 0)

'Review Terms and Conditions again'
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.TextView - Terms and Conditions'), 0)
Mobile.delay(10)
Mobile.tap(findTestObject('Object Repository/C672-C717/android.widget.Button - Done'), 0)

'Close application after test completion'
Mobile.closeApplication()