import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

'Load test data from external data file'
TestData testData = findTestData('Data Files/C751')
String email = testData.getValue('email', 1)
String password = testData.getValue('password', 1)

'--- APPLICATION LAUNCH ---'
'Launch application from global URL with data clearing'
Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

'--- LOGIN FLOW ---'
'Initiate login process'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter email from test data'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Proceed to OAM authentication'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - Next'), 0)
Mobile.delay(40)

'Re-enter email in OAM username field'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText (1)'), email, 0)
Mobile.hideKeyboard()
Mobile.delay(20)

'Enter password from test data'
Mobile.setText(findTestObject('Object Repository/Repo/MyStay/android.widget.EditText'), password, 0)
Mobile.hideKeyboard()
Mobile.delay(10)

'Complete authentication'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.widget.Button - LOGIN'), 0)
Mobile.delay(20)

'--- MY STAY VERIFICATION ---'
'Navigate to My Stay section'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View - My Stay'), 0)
Mobile.delay(30)

'List of elements to verify in My Stay section'
String[] elementsToVerify = [
    'Object Repository/Repo/MyStay/android.widget.TextView - ACTIVE STAYS', 
    'Object Repository/Repo/MyStay/android.widget.TextView - SEE ALL'
]

'Verify all required elements exist'
boolean allElementsExist = true
for (String elementPath : elementsToVerify) {
    boolean elementExists = Mobile.verifyElementExist(findTestObject(elementPath), 10)
    if (!elementExists) {
        allElementsExist = false
        'Capture screenshot if element not found'
        def timestamp = new Date().format('yyyyMMdd_HHmmss')
        Mobile.takeScreenshot('/tmp/missing_element_' + timestamp + '.png')
    }
}

'Fail test if any elements are missing'
assert allElementsExist : "Verification failed - missing elements in My Stay section"

'--- ADDITIONAL ACTIONS ---'
'Interact with stay details'
Mobile.tap(findTestObject('Object Repository/Repo/MyStay/android.view.View (2)'), 0)
Mobile.scrollToText('CALL')

'Capture final screenshot for verification'
Mobile.takeScreenshot('/tmp/final_screen_' + new Date().format('yyyyMMdd_HHmmss') + '.png')

'Close application'
Mobile.closeApplication()