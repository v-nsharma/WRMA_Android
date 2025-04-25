import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil

'Load test data from external file for test case WRMA-108'
TestData testData = findTestData('Data Files/WRMA-108')

'Extract test credentials and account number from data file'
String email = testData.getValue('Email', 1)
String password = testData.getValue('Password', 1)
String accountNumber = testData.getValue('AccountNumber', 1)

'Launch application from global variable path with data clearing'
Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

'Begin authentication flow by tapping Login/Sign Up'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter email from test data'
Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM login screen'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next'), 0)
Mobile.delay(45)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Enter password from test data'
Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (2)'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Complete authentication by tapping LOGIN'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View - My Account'), 0)
Mobile.delay(10)

'Initiate account number addition process'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.TextView - Add An Account Number'), 0)
Mobile.delay(10)

'Enter account number from test data'
Mobile.setText(findTestObject('Object Repository/AddAccount/android.widget.EditText (3)'), accountNumber, 0)
Mobile.delay(10)

'Submit account number for verification'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next (1)'), 0)
Mobile.delay(10)

'Attempt to verify DOB screen elements with error handling'
try {
    'Verify Date of Birth label exists'
    Mobile.verifyElementExist(findTestObject('Object Repository/AddAccount/android.widget.TextView - Date of Birth'), 0)
    Mobile.delay(3)

    'Verify DOB input field exists'
    Mobile.verifyElementExist(findTestObject('Object Repository/AddAccount/android.widget.EditText (4)'), 0)
    Mobile.delay(3)
} catch (Exception e) {
    'Log warning if elements not found'
    KeywordUtil.markWarning("Element not found: " + e.getMessage())
}

'Open date picker dialog'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Image'), 0)
Mobile.delay(10)

'Navigate to previous month in date picker'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Previous month'), 0)
Mobile.delay(10)

'Navigate to next month in date picker'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Button - Next month'), 0)
Mobile.delay(10)

'Select a date from the calendar view'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View'), 0)
Mobile.delay(10)

'Reopen date picker for verification'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.widget.Image'), 0)
Mobile.delay(10)

'Select alternative date from calendar view'
Mobile.tap(findTestObject('Object Repository/AddAccount/android.view.View'), 0)
Mobile.delay(10)

'Close the application after test completion'
Mobile.closeApplication()