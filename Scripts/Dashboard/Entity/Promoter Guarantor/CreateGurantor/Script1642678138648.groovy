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

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/td_Proprietorship'))

//**************ADDING / CREATING A GUARANTOR*************************************************************************************
WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/headder_Promoters OrGuarantors'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/button_Add New Guarantor'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_GuarantorName'), 'Automation Guranter')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_FatherName'), 'father')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_mothername'), 'mother')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Marital Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_Unmarried'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_Marital Status'), 'spouse')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/path'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/div_Month'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/div_4'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/div_datepickerArrow'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_PAN'), 'AABCM9806F')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Female'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_AadharNumber'), '789876545678')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_GuarantorEmail'), 'automation_guranter@gmail.com')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_MobileNumber'), '8998898898')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_JK Platform Access Required'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_JKAccess_No'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_IsPrimary'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_IsPrimaryGuarantor_Yes'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/Button Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/button_Edit'))

//**********************************Permanent Address deatils ****************************************************************
WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_PinCode'), '560043')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_Village'), 'village')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_landmark'), 'landmark')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_Address1'), 'Permanent Address')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_Address2'), 'Automation permanent Address')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Address type(current address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_AddressType'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/div_Years In Current Address'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_years In Current Address'), 
    '4')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/Button Update (Permanent Address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/Button Edit (Current Address)'))

//*******************************************CURRENT ADDRESS*********************************************
WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_current address Pincode'), '586101')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_current Address village'), 'village')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_current Address landmark'), 
    'landmark')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_current address 1'), 'street')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_current address2'), 'street')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_no of years in current address'), 
    '5')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/div_'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Rented'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Add Bank Account'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_AccountNumber'), '1678909876')

WebUI.setEncryptedText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_ConfirmAccount Number'), 
    'ShH1ZdzQrqSpJBct2Zf0sQ==')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_AccountHolderName'), 'rajeshwari')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_IFSC Number'), 'ICIC0006506')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/span_Current'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/input_AccountHolderNumber'), '9009000900')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/IsPrimaryBankAccount'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/ISBankAccountPrimary_Yes'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/BankAccountStatus'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/Button Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/mat-icon_close'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/mat-icon_close(Guarantor main)'))

