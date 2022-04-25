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

WebUI.setText(findTestObject('Dashboard/Entity/Common/search bar'), 'suryo')

WebUI.delay(4)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Promoter-Guarantor'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Button/Select Promoter'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Profile Photo'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Upload/Upload_Profile Photo'), 
    'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

Toastmessage1 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(Toastmessage1)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/select_Aadhar Card Front'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Guarantor Document/Upload/Upload_Aadhar Card Front'), 
    'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

Toastmsg2 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(Toastmsg2)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/sselect_Aadhar Card Back'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Upload/Upload_Aadhar Card Back'), 
    'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

toastmsg3 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(toastmsg3)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Address Proof'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_Address Proof'), 
    'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

toastmsg4 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(toastmsg4)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/select_KYC Document'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Document/Upload/Upload_KYC'), 'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

toastmsg5 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(toastmsg5)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/CA Certified NetWorth'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Upload/Upload_CA Certified NetWorth'), 
    'C:\\analyzedBankStmt (2).xls')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Documents/Button/Button Save'))

toastmsg6 = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(toastmsg6)

