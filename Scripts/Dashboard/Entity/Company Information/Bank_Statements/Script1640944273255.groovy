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

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/Button_Upload Statement'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/bankname_search'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/bankname_search'), 'Sanmathi Sahakari Bank')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/Input_Bank name'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/Span_Account Type'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/dropdown_Saving'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/span_DocumentType'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/dropdown_Scanned'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/upload_bankstatement'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\bankStmt.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/Close Icon'))

//VERIFYING DELETE FUNCTION
WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Bank_Statements/Delete Icon'))

WebUI.delay(4)

// to verify the toast verification to be added
	
	

