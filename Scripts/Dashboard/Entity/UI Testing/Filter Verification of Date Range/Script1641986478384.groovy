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

//VERIFY DATE FILTER
WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/path'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span_JAN 2022'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/div_2021'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/div_JAN'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/div_1'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_JAN 2021_mat-focus-indicator mat-cal_63f59b'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/div_28'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.delay(60)

String Date = WebUI.getText(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/Date_11 Jan 2022'))

System.println(Date)

//Spliting Date 
String[] parts = Date.split(' ')

//COMPARING MONTH
A = (parts[1]).equals(StartMonth).or(Result2 = (parts[1]).equals(EndMonth))

B = WebUI.getText(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/Text_No Records Found'))

if (A == true) {
    System.println('FILTERED DATA SUCCESSFULLY')
    }

 else if (B == 'No Records Found') {
	
    System.println('No Records Found')
	
} else {
    System.println('FILTERED DATA NOT VALID')
}


