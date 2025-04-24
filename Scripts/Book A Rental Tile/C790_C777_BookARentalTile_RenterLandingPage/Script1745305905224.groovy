import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Load test data from Data Files/C790 for account verification test case'
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
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Login or Sign Up (1)'), 0)

'Wait 10 seconds for login screen to appear'
Mobile.delay(10)

'Enter test email in username field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText-LoginPage'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 10 seconds before proceeding'
Mobile.delay(10)

'Proceed to next authentication step by tapping Next button'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (4)'), 0)

'Extended wait (30s) for OAM login screen to load'
Mobile.delay(30)

'Re-enter email in OAM username field for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (24)'), email, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds before password entry'
Mobile.delay(20)

'Enter test password in password field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (25)'), password, 0)

'Hide the on-screen keyboard'
Mobile.hideKeyboard()

'Wait 20 seconds before login attempt'
Mobile.delay(20)

'Complete login by tapping LOGIN button'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - LOGIN'), 0)

'Wait 20 seconds for login to complete and app to load'
Mobile.delay(20)

'Navigate to My Account section'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.view.View - My Account'), 0)

'Wait 5 seconds for My Account page to load'
Mobile.delay(5)

'Verify Add An Account Number option is present'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Add An Account Number')

'Verify account view container exists'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.view.View (3)')

'Wait 3 seconds before next verification'
Mobile.delay(3)

'Verify Book a Rental option is present'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Book a Rental')

'Wait 3 seconds before next verification'
Mobile.delay(3)

Mobile.scrollToText('Payment Wallet')

'Verify Payment Wallet option is present'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Payment Wallet')

'Wait 3 seconds before next verification'
Mobile.delay(3)

'Verify account settings container exists'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.view.View (4)')

'Wait 3 seconds before next verification'
Mobile.delay(3)

'Verify account options list exists'
verifyElementWithContinue('Object Repository/Repo/SignUpNewUser/android.widget.ListView')

'Wait 3 seconds before next verification'
Mobile.delay(3)

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
		Mobile.takeScreenshot("FAILURE_${objectPath.replace('/', '_')}_${System.currentTimeMillis()}.png")
		println("Verification failed for ${objectPath} - Stopping test execution")
		assert false : "Verification failed for ${objectPath}"
	}
	Mobile.delay(3)
}