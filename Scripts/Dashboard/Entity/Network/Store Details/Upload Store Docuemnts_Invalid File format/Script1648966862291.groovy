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

//VERIFY GIFF FILE FORMAT
WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/FileUpload_Address Proof Upload'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Address Proof Upload.gif')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/Button_Save'))

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

//VERIFY EXCEL FILE FORMAT
WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/FileUpload_Address Proof Upload.gif'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Address Proof Upload.xlsx')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/Button_Save'))

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

//VERIFY ABOVE 5MB FILES
WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/FileUpload_Address Proof Upload.xlsx'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Address Proof Upload.jpg')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Upload Store Documents/Button_Save'))

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

System.println(Toast_Message)

