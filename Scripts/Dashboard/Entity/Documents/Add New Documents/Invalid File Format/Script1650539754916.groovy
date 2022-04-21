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

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Documents'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Buttons/Button_New Doc'))

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/input_docname'), 2)

WebUI.setText(findTestObject('Dashboard/Entity/Documents/input_docname'), 'AutomationDoc')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Save Icon'))

//VERIFY GIFF FILE FORMAT
WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUploads_NewDoc'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Buttons/Button_Save'))

WebUI.delay(3)

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

//VERIFY EXCEL FILE FORMAT
WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_AutomationInvalidFiletype'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Buttons/Button_Save'))

WebUI.delay(3)

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

//VERIFY ABOVE 5MB FILES
WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/Upload_AutomationFilesizeCheck'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

WebUI.click(findTestObject('Dashboard/Entity/Documents/Buttons/Button_Save'))

WebUI.delay(3)

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

