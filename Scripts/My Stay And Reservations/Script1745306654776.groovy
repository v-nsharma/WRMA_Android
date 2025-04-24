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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable

'Load test data from Data Files/C790 for My Stay test case'
TestData testData = findTestData('Data Files/C790')

'Get test email from first row of test data'
String email = testData.getValue('email', 1)

'Get test password from first row of test data'
String password = testData.getValue('password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up (2)'), 0)

'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter test email in username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (4)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next (2)'), 0)

'Extended wait (30s) for OAM login screen to load'
Mobile.delay(30)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (5)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds before password entry'
Mobile.delay(20)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (6)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds before login attempt'
Mobile.delay(20)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN (1)'), 0)

'Wait 20 seconds for login to complete and app to load'
Mobile.delay(20)

'Verify My Stay tab is present'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.view.View - My Stay (2)')

'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay (2)'), 0)

'Wait 5 seconds for My Stay page to load'
Mobile.delay(5)

'Verify no upcoming stays message is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - You dont have any upcoming stays associated with your profile')

'Verify Add a Reservation title is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Add a Reservation (1)')

'Verify informational message about adding reservations is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - Get the most out of your stay by adding it to the Westgate Resorts Mobile App (1)')

'Verify ADD A RESERVATION button is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - ADD A RESERVATION (1)')

'Verify My Stay header is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.TextView - My Stay (1)')

'Verify Current tab is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Current (1)')

'Verify Past Stays tab is displayed'
verifyElementWithContinue('Object Repository/Repo/MyStay/android.widget.Button - Past Stays (1)')

'Close the mobile application'
Mobile.closeApplication()

'Custom verification method that takes screenshots on failure and provides detailed error messages'
def verifyElementWithContinue(String objectPath) {
    try {
        Mobile.verifyElementExist(
            findTestObject(objectPath),
            10,
            FailureHandling.STOP_ON_FAILURE
        )
    } catch (Exception e) {
        Mobile.takeScreenshot("FAILURE_${objectPath.replace('/','_')}_${System.currentTimeMillis()}.png")
        println("Verification failed for ${objectPath} - Stopping test execution")
        assert false : "Element not found: ${objectPath}"
    }
    Mobile.delay(3)
}