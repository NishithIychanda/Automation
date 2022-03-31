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

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Page_Anchors Client/div_Documents'))

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/button_add bank statements'), 3)

WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_Add Bank Statements'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\bankStmt.pdf')

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Analyse'))

WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_BankName'), 'Sanmathi Sahakari Bank')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Input_Bank name'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/span_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/dropdown_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/span_Document Type'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/dropdown_docType'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Submit'))

