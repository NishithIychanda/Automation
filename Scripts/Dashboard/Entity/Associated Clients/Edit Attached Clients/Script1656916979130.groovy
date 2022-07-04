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

WebUI.setText(findTestObject('Dashboard/Entity/Common/Search Bar'), 'bisleri')

WebUI.delay(4)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab - Associated Clients'))

WebUI.click(findTestObject('Dashboard/Entity/Associated Client Tab/Edit Attached Clients/Click On Clients'))

WebUI.click(findTestObject('Dashboard/Entity/Associated Client Tab/Edit Attached Clients/Edit Button'))

WebUI.setText(findTestObject('Dashboard/Entity/Associated Client Tab/Edit Attached Clients/Shareholding'), '11')

WebUI.click(findTestObject('Dashboard/Entity/Associated Client Tab/Edit Attached Clients/Update Button'))

Message1 = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message1)

