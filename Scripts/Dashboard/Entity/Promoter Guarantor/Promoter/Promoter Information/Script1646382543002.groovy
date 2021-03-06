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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Promoter-Guarantor'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Button/Button-Add New Promoter'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/Name'), 'Automation Promoter')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/Father Name'), 'Promoter Father')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/Mother Name'), 'Promoter Mother')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Marital Status/Click- Marital Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Marital Status/MaritalStatus_option-Unmarried'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/spouse Name'), 'Automation Spouse')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Date Of Birth/Click - Calender'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Date Of Birth/Pick Month'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Date Of Birth/Pick Date'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Gender/Click-Gender'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Gender/Gender_options-Female'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/PAN'), '78972892')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/AadharNumber'), '899266172701')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Input/Email'), 'automationpromoter+1@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/Mobile Number'), '9898989811')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/JK Access Required/Click-JK Platform Access Required'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/JK Access Required/JK access Required_option-No'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Is Primary/Click-Is primary'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Is Primary/Is primary_option-Yes'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Status/Click-Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Status/Status_option-Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Information/Button/Button_Submit'))

Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Toast Messages/Toast message'))

if (Toast_Message == 'Fetched Successfully ????') {
    System.println('Promoter Created Successfully')
} else {
    System.println(Toast_Message)
}

