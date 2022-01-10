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

//WebUI.openBrowser('https://test-anchors.jai-kisan.com/anchors/applications')

//WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/div_EN-220103-001495'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/headder_Network'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/span_Add New Network'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/span_network name'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/dropdown_networkname'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/span_networkType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/dropdown_DistributorType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/span_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/span_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Network Details List/icon_close'))

