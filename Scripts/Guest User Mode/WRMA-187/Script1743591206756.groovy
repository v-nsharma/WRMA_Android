import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

def testData = findTestData('Data Files/WRMA-187')
def email = testData.getValue('Email', 1) 
def password = testData.getValue('Password', 1) 

Mobile.startApplication('/Users/gv.vignesh/Downloads/WGR-Android-Automation/App Folder/app-debug.apk', true)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Continue as a Guest'), 10)
Mobile.delay(10)

Mobile.scrollToText('recommended')
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Account'), 10)
Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - My Account'), 10)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Create an OAM Account'), 10)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - To access and manage your reservations and Online Account Manager, you must create a user profile or sign into an existing Westgate Online Account Management user profile'), 10)
Mobile.delay(5)

Mobile.getText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - To access and manage your reservations and Online Account Manager, you must create a user profile or sign into an existing Westgate Online Account Management user profile'), 10)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - The Westgate Online Account Management System is your convenient resource to book reservations, manage payments, and keep your account up-to-date. Open 247'), 10)
Mobile.delay(5)

Mobile.getText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - The Westgate Online Account Management System is your convenient resource to book reservations, manage payments, and keep your account up-to-date. Open 247'), 10)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - Home'), 10)
Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.TextView - Login'), 10)
Mobile.delay(45)

Mobile.setText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.EditText (2)'), email, 10)
Mobile.hideKeyboard()
Mobile.delay(30)

Mobile.setText(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.EditText (1)'), password, 10)
Mobile.hideKeyboard()
Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Repo/GuestUserMode/android.widget.Button - LOGIN (1)'), 10)
Mobile.delay(20)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - Home (1)'), 10)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Stay'), 10)
Mobile.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/Repo/GuestUserMode/android.view.View - My Account (1)'), 10)
Mobile.delay(5)

Mobile.closeApplication()