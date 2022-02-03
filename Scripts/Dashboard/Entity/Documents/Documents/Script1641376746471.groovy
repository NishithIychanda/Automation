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

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Audited Financials 3 Years'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Audited Financials 3 Years.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Ledgers Upload'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Ledgers Upload.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Agreement'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Agreement.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Udyog Aadhaar'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Udyog Aadhaar.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Shop Act License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Shop Act License.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_FSSAI License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Channel Logo'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Audit Report'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Sample Audit Report.pdf   ')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_ITR Documents'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\ITR Documents.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Board Resolution Document'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Board Resolution Document.pdf')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/documents upload entity/FileUpload_Dealership Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

WebUI.click(findTestObject('Dashboard/Entity/documents upload entity/Button_Save'))

