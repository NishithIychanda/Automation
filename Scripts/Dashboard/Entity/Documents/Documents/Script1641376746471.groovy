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

//WebUI.click(findTestObject('Serach merit technology/search field'))
//WebUI.sendKeys(findTestObject('Serach merit technology/search field'), 'COMMERCE INDIA')
WebUI.delay(5)

//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Details/div_JAGADISH KELAGERI CIVIL WORKS CONTRACTOR'))
WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Page_Anchors Client/div_Documents'))

Actual_txt = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Actual Text'))

if (Actual_txt == 'Certificate of Incorporation') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Audited Financials 3 Years'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Audited Financials 3 Years.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Ledgers Upload'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Ledgers Upload.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Agreement'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Agreement.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Udyog Aadhaar'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Udyog Aadhaar.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Shop Act License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Shop Act License.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_FSSAI License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Channel Logo'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Audit Report'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Sample Audit Report.pdf   ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_ITR Documents'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\ITR Documents.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Dealership Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_New Doc'))

    WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationInvalidFiletype')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_Addnewdoc'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.verifyElementVisible(findTestObject('Dashboard/Entity/Documents/ToastMessage_Invalid format file'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_New Doc'))

    WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationFilesizeCheck')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_Addnewdoc'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Bank Statements'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
} else {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Audited Financials 3 Years'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Audited Financials 3 Years.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Ledgers Upload'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Ledgers Upload.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Agreement'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Agreement.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Udyog Aadhaar'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Udyog Aadhaar.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Shop Act License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Shop Act License.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_FSSAI License'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Channel Logo'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Audit Report'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Sample Audit Report.pdf   ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_ITR Documents'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\ITR Documents.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Dealership Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_New Doc'))

    WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationInvalidFiletype')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_Addnewdoc'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.verifyElementVisible(findTestObject('Dashboard/Entity/Documents/ToastMessage_Invalid format file'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_New Doc'))

    WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationFilesizeCheck')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_Addnewdoc'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Bank Statements'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(5)
}

