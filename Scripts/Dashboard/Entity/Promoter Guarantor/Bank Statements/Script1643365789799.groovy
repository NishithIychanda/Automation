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

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/Button_Upload Statement'), 0)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/Button_Upload Statement'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/input_Bank Name'), 'Sanmathi Sahakari Bank')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/span_Account Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/dropdown_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/span_Document Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/dropdown_Docuement Type'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Bank Statements/Upload file'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\bankStmt.pdf')

