import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug (2.99.69).apk', true)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

Mobile.delay(15)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView'), 0)

Mobile.swipe(800, 500, 100, 500)

Mobile.delay(10)

Mobile.scrollToText('recommended')

Mobile.delay(10)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Login Now'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Book a Rental'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - RECOMMENDED FOR YOU'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - Home'), 0)

assert Mobile.verifyElementExist(findTestObject('Object Repository/Carousel/android.widget.TextView - My Account'), 0)

Mobile.closeApplication()

