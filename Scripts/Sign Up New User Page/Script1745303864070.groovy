import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'Start the application using the specified APK file'
Mobile.startApplication(GlobalVariable.appUrl, true)
Mobile.delay(10)

'Tap on the Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Login or Sign Up'), 0)
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next'), 0)
Mobile.delay(3)

'Enter email address again for confirmation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering confirmation email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to continue'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name in the first name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (2)'), 'steve', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name in the last name field'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (3)'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter too short password to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (5)'), 'pass')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Verify that password does not meet security requirements error message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Password does not meet security requirements'),
	0, FailureHandling.STOP_ON_FAILURE) : "Password requirements error message not displayed"
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Hide keyboard after entering email'
Mobile.hideKeyboard()
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name again'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (6)'), 'steve', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name again'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (7)'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter password that exceeds maximum length to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (8)'), '1234567890123456789012')
Mobile.delay(3)

'Tap on password requirements text'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Your password must be between 8 and 20 characters and may not contain spaces'), 0)
Mobile.delay(3)

'Verify that password does not meet security requirements error message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Password does not meet security requirements'),
	0, FailureHandling.STOP_ON_FAILURE) : "Password length validation error not displayed"
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name that exceeds maximum length to test validation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (10)'), 'AlexanderMaximilianChristopherNathanielJonathanMontgomeryWilliams', 0)
Mobile.delay(3)

'Enter last name that exceeds maximum length to test validation'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (11)'), 'AlexanderMaximilianChristopherNathanielJonathanMontgomeryWilliams', 0)
Mobile.delay(3)

'Tap on Next button to attempt to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (2)'), 0)
Mobile.delay(3)

'Verify that first name length error message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  First name must be 50 characters or less'),
	0, FailureHandling.STOP_ON_FAILURE) : "First name length error not displayed"

'Verify that last name length error message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Last name must be 50 characters or less'),
	0, FailureHandling.STOP_ON_FAILURE) : "Last name length error not displayed"
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter first name in the first name field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), 'john', 0)
Mobile.delay(3)

'Hide keyboard after entering first name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter last name in the last name field'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), 'smith', 0)
Mobile.delay(3)

'Hide keyboard after entering last name'
Mobile.hideKeyboard()
Mobile.delay(3)

'Enter valid password'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), 'password', 0)
Mobile.delay(3)

'Enter non-matching password in confirm password field to test validation'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Confirm Password'), 'password1')
Mobile.delay(3)

'Tap on Next button to attempt to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (2)'), 0)
Mobile.delay(3)

'Verify that passwords must match error message is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView -  Passwords must match'),
	0, FailureHandling.STOP_ON_FAILURE) : "Password mismatch error not displayed"
Mobile.delay(3)

'Tap on back button to restart the form'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - back'), 0)
Mobile.delay(3)

'Enter email address again after going back'
Mobile.setText(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.EditText (1)'), 'Laurine@yopmail.com', 0)
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (1)'), 0)
Mobile.delay(3)

'Enter last name in the first name field (swapped)'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-FirstName'), 'smith', 0)
Mobile.delay(3)

'Enter first name in the last name field (swapped)'
Mobile.setText(findTestObject('Object Repository/Repo/android.widget.EditText-LastName'), 'john', 0)
Mobile.delay(3)

'Enter valid password'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Password'), 'password')
Mobile.delay(3)

'Enter matching password in confirm password field'
Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-Confirm Password'), 'password')
Mobile.delay(3)

'Tap on Next button to proceed'
Mobile.tap(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.Button - Next (3)'), 0)
Mobile.delay(3)

'Verify that Terms and Conditions page is displayed'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Repo/SignUpNewUser/android.widget.TextView - Terms and Conditions'),
	0, FailureHandling.STOP_ON_FAILURE) : "Terms and Conditions page not displayed"
Mobile.delay(3)

'Close the application'
Mobile.closeApplication()