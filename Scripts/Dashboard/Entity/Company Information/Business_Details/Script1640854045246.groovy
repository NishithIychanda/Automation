import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.exception.StepErrorException as StepErrorException
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Dashboard/Entity/Entity Creation/Spoc_Creation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/button_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/span_firmtype'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/dropdown_Public Limited Company'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/span_Entity Type'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/dropdown_OEM'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/button_submit'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/button_Edit'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_Gst number'), '33AABCM9806E1ZO')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Button_Ok'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_Date Picker'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_month'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_date'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_email'), 'test1@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_BrandName'), 'Test Automation')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_mobileNumber'), '9878787878')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/span_ComapnyAct'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Company_act_2013'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/input_Website'), 'https://www.knowyourgst.com/')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Description'), 'test bac abac abac abaca fdyfdeygeyrgr')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/button_submit'))

ToastMessage = WebUI.getText(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Toast Message'))

if (ToastMessage == 'Fetched Successfully') {
    println(('****************' + ToastMessage) + '**********************')
} else {
    WebUI.takeScreenshot()

    println(('****************' + ToastMessage) + '**********************')
}

