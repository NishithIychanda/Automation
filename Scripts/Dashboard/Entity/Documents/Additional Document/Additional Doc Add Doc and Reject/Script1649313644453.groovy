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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Documents'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Additional Document/Additional Add New Document'))

WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationDoc')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUploads_NewDoc'), 'C:\\bankStmt.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

Toastmessg = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Toast Upload Document'))

System.println(Toastmessg)

WebUI.click(findTestObject('Dashboard/Entity/Documents/Doc-Additionaldoc-downloaddoc/Reject Icon'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Reasons'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Option_Document both sides required'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/option_Document not clear'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Option_Document wrong uploaded'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/div_Submit_cdk-overlay-backdrop cdk-overlay_218b1a'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Submit Button For Reject Document'))

rejecttoast = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Reject Toast Message'))

System.println(rejecttoast)

errormsg = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Error message Reject'))

System.println(errormsg)

