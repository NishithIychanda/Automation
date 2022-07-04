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

WebUI.callTestCase(findTestCase('Dashboard/Clients/Onboard New Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Dashboard/Clients/Document/Upload/Upload_Profile Photo'), 0)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_Profile Photo'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Documents/Button/Button Save'))

Message1 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message1)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_Aadhar Card Front'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Clients/Document/Button/Button Save'))

Message2 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message2)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_Aadhar Card Back'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Clients/Document/Button/Button Save'))

Message3 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message3)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_Address Proof'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Clients/Document/Button/Button Save'))

Message4 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message4)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_KYC'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Clients/Document/Button/Button Save'))

Message5 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message5)

WebUI.uploadFile(findTestObject('Dashboard/Clients/Document/Upload/Upload_CA Certified NetWorth'), 'C:\\PAN.png')

WebUI.click(findTestObject('Dashboard/Clients/Document/Button/Button Save'))

Message6 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message6)

