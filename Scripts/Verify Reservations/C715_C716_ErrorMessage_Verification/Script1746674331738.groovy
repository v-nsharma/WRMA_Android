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

'Start the application from the specified APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (1).apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on "Login or Sign Up" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Login or Sign Up'), 0)

'Wait for the login screen to appear'
Mobile.delay(10)

'Enter the email address in the email input field'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard after entering the email'
Mobile.hideKeyboard()

'Wait before proceeding to next step'
Mobile.delay(10)

'Tap on the "Next" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Next'), 0)

'Wait for the authentication process and next screen to load'
Mobile.delay(40)

'Tap on "Accept All Cookies" to dismiss the cookie popup'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup is handled'
Mobile.delay(10)

'Re-enter the email address on the login screen'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText (1)'), 'SELENAWB@GMAIL.COM', 0)

'Hide the keyboard after re-entering email'
Mobile.hideKeyboard()

'Wait before entering password'
Mobile.delay(10)

'Enter the password in the password input field'
Mobile.setText(findTestObject('Object Repository/Logout/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard after entering password'
Mobile.hideKeyboard()

'Wait before submitting login form'
Mobile.delay(10)

'Tap on the "LOGIN" button'
Mobile.tap(findTestObject('Object Repository/Logout/android.widget.Button - LOGIN'), 0)

'Wait for login to complete and home screen to load'
Mobile.delay(20)

'Tap on the "My Stay" section to manage or view reservations'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.view.View - My Stay'), 0)

'Pause to allow the My Stay screen to load'
Mobile.delay(10)

'Tap on "ADD A RESERVATION" to initiate adding a new reservation'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - ADD A RESERVATION'), 0)

'Pause to ensure reservation input screen is ready'
Mobile.delay(10)

'Enter the reservation number into the reservation ID field'
Mobile.setText(findTestObject('Object Repository/VerifyReservations/android.widget.EditText'), '18559754', 0)

'Short delay before proceeding to next step'
Mobile.delay(5)

'Tap on the "Next" button to proceed to the last name entry screen'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Next'), 0)

'Pause to allow last name input field to appear'
Mobile.delay(10)

'Enter the last name associated with the reservation'
Mobile.setText(findTestObject('Object Repository/VerifyReservations/android.widget.EditText (1)'), 'FORBES', 0)

'Pause before confirming the addition of the reservation'
Mobile.delay(10)

'Tap on "Add Reservation" to submit the reservation details'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Add Reservation'), 0)

'Wait for the response after submitting the reservation'
Mobile.delay(10)

'Verify the presence of the AddAssociate screen, indicating flow continuation'
Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.TextView - AddAssociate'), 0)

'Assert the display of an error message indicating the reservation could not be added'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.TextView - Error'), 0)

'Assert the presence of a detailed error message explaining the failure'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.TextView - Sorry. Your reservation could not be added. Please try again'), 0)

'Assert that the "Try Again" button is available for retrying the action'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Try Again'), 0)

'Tap on "Try Again" to retry adding the reservation'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Try Again'), 0)

'Wait for retry action to process'
Mobile.delay(10)

'Tap on "Try Again" once more in case the previous attempt failed'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Try Again'), 0)

'Allow time for the error screen to reappear'
Mobile.delay(10)

'Assert that the error message is still visible after retry attempts'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.TextView - Error'), 0)

'Assert the display of a generic error message suggesting to try later'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.TextView - There is a problem adding your reservation. Please try again later'), 0)

'Assert that the "Back to AddAssociate" button is visible for navigation'
assert Mobile.verifyElementExist(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Back to AddAssociate'), 0)

'Tap on "Back to AddAssociate" to return to the previous screen'
Mobile.tap(findTestObject('Object Repository/VerifyReservations/android.widget.Button - Back to AddAssociate'), 0)

'Close the mobile application to end the test'
Mobile.closeApplication()
