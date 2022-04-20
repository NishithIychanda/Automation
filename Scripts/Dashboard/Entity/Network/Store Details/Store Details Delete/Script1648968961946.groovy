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
//Signing in
WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Network'))

//Adding new Store details
WebUI.scrollToElement(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Add New Store'), 
    3)

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Add New Store'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Inputs/input_storeName'), 'Delete store')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Store Type/span_StoreType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Store Type/dropdown_StoreType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Status/span_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Status/Status_Inactive'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Submit'))

toast_message = WebUI.getText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Toast message, Icons/Toast Messages'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Toast message, Icons/Close Icon'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Toast message, Icons/Delete Icon'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Delete'))

ToastMessage = WebUI.getText(findTestObject('Dashboard/Entity/SPOCs/Icons/Toast Message'))

System.println(ToastMessage)
