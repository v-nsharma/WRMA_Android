import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable

'Load test data from Data Files/WRMA-267 for Link Accounts test case'
TestData testData = findTestData('Data Files/WRMA-267')

'Get test email from first row of test data'
String email = testData.getValue('Email', 1)

'Get test password from first row of test data'
String password = testData.getValue('Password', 1)

'Launch the mobile application from specified APK path'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait 10 seconds for app to fully initialize'
Mobile.delay(10)

'Initiate login process by tapping Login/Sign Up button'
Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Login or Sign Up'), 0)

'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter test email in username field'
Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Next'), 0)

'Extended wait (45s) for OAM login screen to load'
Mobile.delay(45)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText (1)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before password entry'
Mobile.delay(10)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/Link Accounts/android.widget.EditText (2)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before login attempt'
Mobile.delay(10)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - LOGIN'), 0)

'Wait 30 seconds for login to complete and Link Accounts screen to load'
Mobile.delay(30)

'Verify Link Accounts title is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Link Accounts'), 0)

'Wait 5 seconds before next verification'
Mobile.delay(5)

'Verify account selection instruction is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - You MUST select a name from each account'), 0)

'Wait 5 seconds before next verification'
Mobile.delay(5)

'Verify strikethrough explanation is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Names with a strikethrough have already been selected by another user'), 0)

'Wait 5 seconds before next verification'
Mobile.delay(5)

'Verify Terms and Conditions label is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions'), 0)

'Wait 5 seconds before next verification'
Mobile.delay(5)

'Verify Terms and Conditions checkbox is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.CheckBox'), 0)

'Wait 5 seconds before interacting with checkbox'
Mobile.delay(5)

'Tap on Terms and Conditions checkbox to accept'
Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.CheckBox'), 0)

'Wait 15 seconds for checkbox selection to be processed'
Mobile.delay(15)

'Verify Terms and Conditions link is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions (1)'), 0)

'Wait 5 seconds before next verification'
Mobile.delay(5)

'Verify Confirm Identity button is displayed'
Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.Button - Confirm Identity'), 0)

'Wait 5 seconds before attempting to view Terms and Conditions'
Mobile.delay(5)

'Begin Terms and Conditions verification flow with error handling'
try {
    'Tap on Terms and Conditions link to view full terms'
    Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.TextView - Terms and Conditions (1)'), 0)
    
    'Wait 5 seconds for Terms and Conditions modal to appear'
    Mobile.delay(5)
    
    'Verify Terms and Conditions content view is displayed'
    try {
        Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.view.View'), 0, FailureHandling.STOP_ON_FAILURE)
        
        'Wait 5 seconds before next verification'
        Mobile.delay(5)
        
        'Log successful verification of Terms and Conditions view'
        println("Terms and Conditions view displayed successfully")
    } catch (Exception e) {
        'Log failure of Terms and Conditions view verification'
        println("Failed to verify Terms and Conditions view: " + e.getMessage())
        
//        'Take screenshot for debugging purposes'
//        Mobile.takeScreenshot()
        
        'Fail test with descriptive message'
        assert false : "Terms and Conditions view verification failed"
    }
    
    'Verify Done button is displayed in Terms and Conditions modal'
    try {
        Mobile.verifyElementExist(findTestObject('Object Repository/Link Accounts/android.widget.Button - Done'), 0, FailureHandling.STOP_ON_FAILURE)
        
        'Wait 5 seconds before attempting to tap Done button'
        Mobile.delay(5)
        
        'Log successful verification of Done button'
        println("Done button displayed successfully")
    } catch (Exception e) {
        'Log failure of Done button verification'
        println("Failed to verify Done button: " + e.getMessage())
        
//        'Take screenshot for debugging purposes'
//        Mobile.takeScreenshot()
        
        'Fail test with descriptive message'
        assert false : "Done button verification failed"
    }
    
    'Tap Done button to close Terms and Conditions modal'
    try {
        Mobile.tap(findTestObject('Object Repository/Link Accounts/android.widget.Button - Done'), 0)
        
        'Wait 5 seconds for modal to close'
        Mobile.delay(5)
        
        'Log successful tap of Done button'
        println("Successfully tapped Done button")
    } catch (Exception e) {
        'Log failure to tap Done button'
        println("Failed to tap Done button: " + e.getMessage())
        
        'Fail test with descriptive message'
        assert false : "Failed to tap Done button"
    }
    
} catch (Exception generalException) {
    'Log general failure in Terms and Conditions flow'
    println("An error occurred in the Terms and Conditions flow: " + generalException.getMessage())
    
//    'Take screenshot for debugging purposes'
//    Mobile.takeScreenshot()
    
    'Fail test with descriptive message'
    assert false : "General error in Terms and Conditions flow"
}

'Close the mobile application'
Mobile.closeApplication()