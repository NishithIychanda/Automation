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

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Page_Anchors Client/div_Documents'))

Actual_txt = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Get Firm Type'))

System.println(Actual_txt)

//Result = (Actual_txt == ('Public Limited Company'))
//System.println(Result)
if (Actual_txt == 'Private Limited Company') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Memorandum of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Articles of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Public Limited Company') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Memorandum of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Articles of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Board Resolution Document'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\ITR Documents.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Dealership Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Trust') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_By Laws'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Deed Date'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Partnership') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Registration Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Deed Date'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Limited Liability Partnership') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Registration Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Deed Date'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Proprietorship') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'One Person Company') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Section 8 Company') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Account.pdf')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Memorandum of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Articles of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Limited Liability Company') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Memorandum of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Articles of Association'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
} else if (Actual_txt == 'Co-Operative Society') {
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GST Certificate.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Company PAN Card.jpg')

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

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_Registration Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload_By Laws'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\FSSAI License.pdf  ')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.callTestCase(findTestCase('Dashboard/Entity/Documents/Additional Docuemnts'), [:], FailureHandling.STOP_ON_FAILURE)
}

