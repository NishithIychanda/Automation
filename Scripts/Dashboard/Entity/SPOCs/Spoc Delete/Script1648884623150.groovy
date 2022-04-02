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

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-SPOCs'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Buttons/Button_Add New SPOC'))

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/Inputs/input_FullName'), 'Neha')

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/Inputs/input_Email'), 'test3@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/Inputs/input_MobileNumber'), '7878787891')

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Departments/span_department'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Departments/Dep_Finance'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Status/Span_status'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Status/Status_Active'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Buttons/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Icons/icon_close'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Icons,ToastMessages/Delete Icon'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Buttons/Button_Delete'))

ToastMessage = WebUI.getText(findTestObject('Dashboard/Entity/SPOCs/Icons/Toast Message'))

System.println(ToastMessage)

