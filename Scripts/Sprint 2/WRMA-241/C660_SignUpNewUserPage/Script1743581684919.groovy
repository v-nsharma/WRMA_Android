import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile;
import com.kms.katalon.core.testobject.TestObject;
import org.junit.Assert;
import com.kms.katalon.core.testdata.TestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;

'Start the mobile application using the specified APK file'
Mobile.startApplication('C:\\Users\\GVVignesh\\git\\WGR_Android\\App Folder\\universal.apk', true);

'Wait for 5 seconds to allow the application to load'
Mobile.delay(5)

'Tap on the "Login or Sign Up" button to navigate to the login screen'
Mobile.tap(findTestObject('Object Repository/Repo/android.widget.Button - Login or Sign Up'), 0);

'Retrieve test data from "InvalidEmail" Excel file'
TestData excelData = findTestData("Data Files/InvalidEmail");

'Get the total number of rows available in the Excel sheet'
int rowCount = excelData.getRowNumbers();

'Loop through each row in the Excel sheet to test different invalid email formats'
for (int i = 1; i <= rowCount; i++) {  
	
	'Fetch the invalid email from the current row of the dataset'
	String invalidEmail = excelData.getValue("email-Address", i);
	
	'Print the entire dataset reference (useful for debugging)'
	println(excelData);
	
	'Print the current row being tested and the invalid email value'
	println "Testing invalid email from Excel (Row ${i}): ${invalidEmail}";
	
	'Wait for the email input field to be present before proceeding'
	Mobile.waitForElementPresent(findTestObject("Object Repository/Repo/android.widget.EditText-LoginorSignUp"), 20)
	
	'Enter the invalid email into the email input field'
	Mobile.sendKeys(findTestObject('Object Repository/Repo/android.widget.EditText-LoginorSignUp'), invalidEmail);
	
	'Retrieve the actual error message displayed in the UI'
	String actualErrorMessage = Mobile.getText(findTestObject('Object Repository/Repo/android.widget.TextView -  Invalid email format'), 0).trim();
	
	'Define the expected error message for invalid email format'
	String expectedErrorMessage = "Invalid email format";
	
	'Compare actual and expected error messages after removing special characters and trimming spaces'
	Assert.assertEquals("Error message validation failed at row ${i}", expectedErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim(), actualErrorMessage.replaceAll("[^a-zA-Z0-9 ]", "").trim());
	
}

'Close the mobile application after executing all test cases'
Mobile.closeApplication();
