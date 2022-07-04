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

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/td_Proprietorship'))

//**************ADDING / CREATING A GUARANTOR*************************************************************************************
WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/headder_Promoters OrGuarantors'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/button_Add New Guarantor'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_GuarantorName'), 'Automation Guranter')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_FatherName'), 'father')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_mothername'), 'mother')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_Marital Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_Unmarried'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_Marital Status'), 'spouse')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Datepicker'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/div_Month'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/div_4'))

//WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/div_datepickerArrow'))
WebUI.scrollToElement(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Submit'), 2)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Span_Gender'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_Female'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_PAN'), 'AABCM9806F')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_AadharNumber'), '789876545678')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_GuarantorEmail'), 'automation_guranter@gmail.com')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_MobileNumber'), '8998898898')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_JK Platform Access Required'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_JKAccess_No'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_IsPrimary'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_IsPrimaryGuarantor_Yes'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/button_Edit'))

//**********************************Permanent Address deatils ****************************************************************
WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_PinCode'), '560043')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_Village'), 'village')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_landmark'), 'landmark')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_Address1'), 'Permanent Address')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_Address2'), 'Automation permanent Address')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_AddressType(permanaent address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_AddressType'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/div_Years In Current Address'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_years In Current Address'), '4')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Update (Permanent Address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Edit (Current Address)'))

//*******************************************CURRENT ADDRESS*********************************************
WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_current address Pincode'), '586101')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_current Address village'), 'village')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_current Address landmark'), 'landmark')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_current address 1'), 'street')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_current address2'), 'street')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_no of years in current address'), 
    '5')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/div_'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_Rented'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button_Update(currrent Address)'))

WebUI.callTestCase(findTestCase('Dashboard/Entity/Promoter Guarantor/Guarantors1/Documents'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button_Add Bank Account'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_AccountNumber'), '1678909876')

WebUI.setEncryptedText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_ConfirmAccount Number'), 
    'ShH1ZdzQrqSpJBct2Zf0sQ==')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_AccountHolderName'), 'rajeshwari')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_IFSC Number'), 'ICIC0006506')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/span_AccountType'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_Current'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/IsPrimaryBankAccount'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/ISBankAccountPrimary_Yes'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/input_AccountHolderNumber'), '9009000900')

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Submit'), 2)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Span_BankStatus'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/dropdown_BankstatusActive'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/Button Submit'))

WebUI.callTestCase(findTestCase('Dashboard/Entity/Promoter Guarantor/Guarantors1/Bank Statements'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/mat-icon_close'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor1/mat-icon_close(Guarantor main)'))

