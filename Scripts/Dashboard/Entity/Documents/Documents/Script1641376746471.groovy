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

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/div_MERIT TECHNOLOGIES INDIA LIMITED'))

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/div_Documents'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\DELL\\\\Desktop\\\\Account.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_GST Certificate'), 'E:\\\\Dev\\\\Documents\\\\GST Certificate.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Company PAN Card'), 'E:\\\\Dev\\\\Documents\\\\Company PAN Card.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Audited Financials 3 Years'), 'E:\\\\Dev\\\\Documents\\\\Audited Financials 3 Years.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Ledgers Upload'), 'E:\\\\Dev\\\\Documents\\\\Ledgers Upload.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Agreement'), 'E:\\\\Dev\\\\Documents\\\\Agreement.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Udyog Aadhaar'), 'E:\\\\Dev\\\\Documents\\\\Udyog Aadhaar.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Shop Act License'), 'E:\\\\Dev\\\\Documents\\\\Shop Act License.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_FSSAI License'), 'E:\\\\Dev\\\\Documents\\\\FSSAI License.pdf  ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Channel Logo'), 'E:\\\\Dev\\\\Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Audit Report'), 'E:\\\\Dev\\\\Documents\\\\Sample Audit Report.pdf   ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_ITR Documents'), 'E:\\\\Dev\\\\Documents\\\\ITR Documents.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Board Resolution Document'), 'E:\\\\Dev\\\\Documents\\\\Board Resolution Document.pdf   ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Dealership Certificate'), 'E:\\\\Dev\\\\Documents\\\\Dealership Certificate.png ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Page_Anchors Client/span_Save'))

