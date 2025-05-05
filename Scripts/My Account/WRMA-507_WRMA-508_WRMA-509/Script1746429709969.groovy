import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

'Start the application from the specified APK file'
Mobile.startApplication('/Users/gv.vignesh/Downloads/app-debug.apk', true)

'Wait for the app to load'
Mobile.delay(10)

'Tap on Login or Sign Up button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Login or Sign Up'), 0)

'Wait for login screen'
Mobile.delay(10)

'Enter email address in the email field'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(10)

'Tap on Next button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Next'), 0)

'Wait for authentication and next screen to load'
Mobile.delay(40)

'Tap on Accept All Cookies button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Accept All Cookies'), 0)

'Wait after cookie popup interaction'
Mobile.delay(10)

'Re-enter email address on login screen'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (1)'), '0425041tm@wg.com', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering email'
Mobile.delay(5)

'Enter password'
Mobile.setText(findTestObject('Object Repository/EditVerify/android.widget.EditText (2)'), 'password', 0)

'Hide the keyboard'
Mobile.hideKeyboard()

'Wait after entering password'
Mobile.delay(5)

'Tap on LOGIN button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - LOGIN'), 0)

'Wait for login to complete'
Mobile.delay(20)

'Tap on My Account section'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.view.View - My Account'), 0)

'Wait for My Account screen to load'
Mobile.delay(20)

'Tap on profile view'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.view.View'), 0)

'Wait after opening profile view'
Mobile.delay(10)

'Tap on Owner Contact Information button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Owner Contact Information'), 0)

'Wait for contact info screen'
Mobile.delay(10)

'Get screen dimensions for swipe gestures'
int screenHeight = Mobile.getDeviceHeight()
int screenWidth = Mobile.getDeviceWidth()

'Set swipe coordinates for vertical swipe'
int swipeStartX = screenWidth / 2
int swipeStartY = screenHeight * 3 / 4
int swipeEndX = swipeStartX
int swipeEndY = screenHeight / 4

'Swipe up 3 times'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Tap on Edit Address and Phone Numbers'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.TextView - Edit Address and Phone Numbers'), 0)

'Wait after tapping edit address'
Mobile.delay(10)

'Tap on Country field'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - Country USA'), 0)

'Wait after opening country dropdown'
Mobile.delay(10)

'Repeat swipe logic to scroll through country list'
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

'Swipe country list 3 times'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify Country element exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EditVerify/android.widget.TextView - Country'), 0)

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - back'), 0)

'Wait after navigating back'
Mobile.delay(10)

'Tap on State field'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - State VT'), 0)

'Wait after opening state list'
Mobile.delay(10)

'Repeat swipe logic for state list'
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

'Swipe state list 3 times'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify State element exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EditVerify/android.widget.TextView - State'), 0)

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - back'), 0)

'Wait after navigating back'
Mobile.delay(10)

'Tap on USA option 1'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - USA 1'), 0)

'Wait after tapping country/region'
Mobile.delay(10)

'Swipe through country/region options'
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

'Swipe 3 times in country/region screen'
for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify Country/Region label exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EditVerify/android.widget.TextView - Country  Region'), 0)

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - back'), 0)

'Wait after navigating back'
Mobile.delay(10)

'Swipe again for navigation'
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Tap on USA 1 (1)'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - USA 1 (1)'), 0)

'Wait and swipe in the next screen'
Mobile.delay(10)
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify Country/Region label exists'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EditVerify/android.widget.TextView - Country  Region'), 0)

'Tap on back button'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - back'), 0)

'Wait after navigating back'
Mobile.delay(10)

'Swipe again before next action'
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Tap on USA 1 (2)'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - USA 1 (2)'), 0)

'Wait and swipe in the next screen'
Mobile.delay(10)
screenHeight = Mobile.getDeviceHeight()
screenWidth = Mobile.getDeviceWidth()
swipeStartX = screenWidth / 2
swipeStartY = screenHeight * 3 / 4
swipeEndX = swipeStartX
swipeEndY = screenHeight / 4

for (int i = 0; i < 3; i++) {
	Mobile.swipe(swipeStartX, swipeStartY, swipeEndX, swipeEndY)
	Mobile.delay(1)
}

'Verify Country/Region label exists again'
assert Mobile.verifyElementExist(findTestObject('Object Repository/EditVerify/android.widget.TextView - Country  Region'), 0)

'Tap on back button to exit'
Mobile.tap(findTestObject('Object Repository/EditVerify/android.widget.Button - back'), 0)

'Close the application'
Mobile.closeApplication()
