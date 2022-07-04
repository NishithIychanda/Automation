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

WebUI.callTestCase(findTestCase('Dashboard/Entity/Entity Creation/Spoc_Creation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/button_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Dropdowns/span_firmtype'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Dropdowns/Firm Type/FirmType_Public Limited Company'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Dropdowns/span_Entity Type'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Buisness_Details/Dropdowns/dropdown_OEM'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Buttons/Button_Submit'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Buttons/Button_AddNewBankAccount'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_AccountNumber'), '0456101022908')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_ConfirmAccountNumber'), '0456101022908')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_IFSC code'), 'CNRB0000456')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_MobileNumber'), '9481854890')

//WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_BankAddress'), 'Virajpet Ponnament')
//WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/input_MICRcode'), '571015526')
WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Inputs/Input_AccountHolderName'), 'Nishith IN')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Account Type/span_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Account Type/AccountType_Savings'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Status/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Status/Status_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Buttons/Button_Submit'))

