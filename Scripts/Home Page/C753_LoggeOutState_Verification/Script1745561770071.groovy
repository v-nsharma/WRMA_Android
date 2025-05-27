import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
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
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Launch the mobile application from the specified APK file path and clear any previous data'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 10 seconds to allow the app to load completely'
Mobile.delay(10)

'Tap on the Home text view element in the application'
Mobile.tap(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

'Wait for 15 seconds to allow the home screen to load'
Mobile.delay(20)

'Verify that a text view element exists on the screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView'), 0)

'Perform a horizontal swipe gesture from right to left'
Mobile.swipe(800, 500, 100, 500)

'Wait for 10 seconds after swipe action'
Mobile.delay(10)

'Scroll down to find text containing recommended'
Mobile.scrollToText('things to do')

'Wait for 10 seconds after scrolling'
Mobile.delay(10)

'Verify the Login Now text element exists on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Login Now'), 0)

'Verify the Book a Rental text element exists on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Book a Rental'), 0)

'Verify the Home text element exists on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

'Verify the My Account text element exists on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - My Account'), 0)

'Close the application'
Mobile.closeApplication()