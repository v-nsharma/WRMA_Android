import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.driver.DriverFactory
import io.appium.java_client.AppiumDriver
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import java.util.Set
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

'Load test data from Data Files/WRMA-187 for guest mode and login validation'
def testData = findTestData('Data Files/WRMA-187')
'Extract test email from first row of test data'
def email = testData.getValue('Email', 1)
'Extract test password from first row of test data'
def password = testData.getValue('Password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)
'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Select guest user mode by tapping Continue as Guest option'
Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Continue as a Guest'), 10)
'Wait 10 seconds for guest mode to initialize'
Mobile.delay(10)

'Scroll to find recommended content section'
Mobile.scrollToText('recommended')
'Wait 10 seconds after scrolling'
Mobile.delay(10)

'Navigate to My Account section in guest mode'
Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Account'), 10)
'Wait 10 seconds for account screen to load'
Mobile.delay(10)

'Verify My Account header is displayed in guest mode'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - My Account'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Verify Create Account option is present in guest mode'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Create an OAM Account'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Verify account creation prompt message is displayed'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - To access and manage your reservations and Online Account Manager, you must create a user profile or sign into an existing Westgate Online Account Management user profile'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Capture text of account creation prompt for validation'
Mobile.getText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - To access and manage your reservations and Online Account Manager, you must create a user profile or sign into an existing Westgate Online Account Management user profile'), 10)
'Wait 5 seconds after text capture'
Mobile.delay(5)

'Verify OAM system description is displayed'
assert Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - The Westgate Online Account Management System is your convenient resource to book reservations, manage payments, and keep your account up-to-date. Open 247'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Capture text of OAM system description for validation'
Mobile.getText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - The Westgate Online Account Management System is your convenient resource to book reservations, manage payments, and keep your account up-to-date. Open 247'), 10)
'Wait 5 seconds after text capture'
Mobile.delay(5)

'Return to Home screen from guest mode'
Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - Home'), 10)
'Wait 10 seconds for home screen to load'
Mobile.delay(10)

'Switch from guest to login mode by tapping Login option'
Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Login'), 10)
'Extended wait (45s) for login screen to load'
Mobile.delay(45)

'Enter test email in login field'
Mobile.setText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.EditText (2)'), email, 10)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Extended wait (30s) after text entry'
Mobile.delay(30)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.EditText (1)'), password, 10)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Extended wait (30s) after text entry'
Mobile.delay(30)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.Button - LOGIN (1)'), 10)

'Wait 20 seconds for login to complete'
Mobile.delay(20)

'Verify Home section is displayed after successful login'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - Home (1)'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Verify My Stay section is available after login'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Stay'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Verify My Account section is available after login'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Account (1)'), 10)
'Wait 5 seconds after verification'
Mobile.delay(5)

'Assert Home section exists after login'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - Home (1)'), 10)

'Assert My Stay section exists after login'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Stay'), 10)

'Assert My Account section exists after login'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Account (1)'), 10)

'Close the mobile application'
Mobile.closeApplication()
