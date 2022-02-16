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

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Button_AddNewBankAccount'))

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_AccountNumber'), '0456101022908')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_ConfirmAccountNumber'), '0456101022908')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_IFSC code'), 'CNRB0000456')

WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_MobileNumber'), '9481854890')

//WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_BankAddress'), 'Virajpet Ponnament')
//WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/input_MICRcode'), '571015526')
WebUI.setText(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Input_AccountHolderName'), 'Nishith IN')

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/span_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/dropdown_Accountype'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/Span_isPrimary'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/dropdown_primary_No'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/dropdown_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Company Information/Bank_Details/button_Submit'))

