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

'Launch the mobile application from the specified APK file path with data clearing enabled'
Mobile.startApplication(GlobalVariable.appUrl, true)

'Wait for 10 seconds to allow the application to initialize'
Mobile.delay(10)

'Tap on the Home button/text element in the application'
Mobile.tap(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

'Wait for 15 seconds for the home screen to load completely'
Mobile.delay(20)

'Tap on the first text view element in the Carousel section'
Mobile.tap(findTestObject('Object Repository/Carousel/android.widget.TextView (1)'), 0)

'Wait for 10 seconds after the tap action'
Mobile.delay(10)

'Verify that the App Test Image Article text element is present on screen'
assert Mobile.verifyElementExist(findTestObject('Object Repository/testing/android.widget.TextView - 50 Welcome Bonus  3 Back in Rewards'), 
    0)

'Close the application after test completion'
Mobile.closeApplication()

