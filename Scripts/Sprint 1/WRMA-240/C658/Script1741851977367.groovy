import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

'Application is launched successfully in the Physical device'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', false)

Mobile.delay(3)

'Text "You are Moments Away From Customized Vacation Experiences" is verified whether present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.TextView - Youre Moments Away FromCustomized Vacation Experiences'),
	0)

Mobile.delay(3)

'Text "You are Moments Away From Customized Vacation Experiences" is printed'
String text = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView - Youre Moments Away FromCustomized Vacation Experiences'),
	0)
println("Text: " + text)

Mobile.delay(3)

'Verify Buttons "Login or Sign Up" is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0)

Mobile.delay(3)

'Verify bottom navigation bar is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - Home'), 0)

Mobile.delay(3)

'Verify bottom navigation bar is present'
Mobile.verifyElementExist(findTestObject('Object Repository/Repo/android.view.View - My Account'), 0)

Mobile.delay(3)

'Tap on non-clickable - "Vacation More. Get More" button'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Vacation More. Get More'), 0)

Mobile.delay(3)

'Verify if it is not redirecting to the next page'
Mobile.verifyElementVisible(findTestObject('Object Repository/Repo/android.widget.TextView - Vacation More. Get More'),
	0)

Mobile.delay(3)

'Verify Explore Westgate Loyalty and text is present'
Mobile.verifyElementVisible(findTestObject('Object Repository/Repo/android.widget.TextView - Explore Westgate Loyalty'),
	0)
Mobile.delay(3)

'Verify Clickable text - Continue as a Guest is present'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 0)
		
boolean isElementVisible = Mobile.waitForElementPresent(findTestObject('Object Repository/Repo/android.widget.TextView - Continue as a Guest'), 10)

if (!isElementVisible) {
	KeywordUtil.markFailed("Failed: Expected element not found after tapping 'Continue as a Guest'")
} else {
	KeywordUtil.logInfo("Success: Tapped on 'Continue as a Guest' and expected element is present.")
}

Mobile.delay(3)



'Application is closed successfully'
Mobile.closeApplication()