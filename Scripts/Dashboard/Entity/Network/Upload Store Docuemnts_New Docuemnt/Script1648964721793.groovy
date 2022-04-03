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

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Network'))

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Store'))

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/FileUpload_Address Proof Upload'), 
    3)

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button_Add New Document'))

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Inputs/input_docname'), 
    2)

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Inputs/input_docname'), 
    'storeDoc')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Icons/Save Icon'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/FileUploads_NewDoc'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/Button_Save'))

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Icons/Toast Message'))


System.println(Toast_Message)
WebUI.delay(3)

