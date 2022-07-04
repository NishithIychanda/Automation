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

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Add Bank Account Button'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Input Account Number'), '04640308711')

WebUI.setEncryptedText(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Input Confirm Account Number'), 
    'Eyz8oZSr3dp12jUuzFJT0Q==')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Input IFSC'), 'CNRB0000464')

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Status'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Status Active'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Submit Button For Bank Details'))

ToastMessage = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(ToastMessage)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Bank Details/Close Popup'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard/Clients/Bank Details/Make Primary Button'))

Message1 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message1)

