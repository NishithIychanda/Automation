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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://auth.jai-kisan.com/auth/realms/test/protocol/openid-connect/auth?client_id=anchors-client&redirect_uri=https%3A%2F%2Ftest-anchors.jai-kisan.com%2F&state=c1f05d21-33e2-4576-98cd-23bd1950d9fc&response_mode=fragment&response_type=code&scope=openid&nonce=fb92019a-3b08-4722-81bf-2828721abf6c')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Log in to Jai Kisan/label_Username or email'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Log in to Jai Kisan/input_Log In with Jai Kisan Credentials pro_a7df47'), 
    'rajeshwari.bannetti@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Log in to Jai Kisan/input_Username or email_password'), 
    'xvjjEBxldR2vB9xSRsStyg==')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Log in to Jai Kisan/input_Forgot Password_login'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/td_Proprietorship'))

//**************ADDING / CREATING A GUARANTOR*************************************************************************************
WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/headder_Promoters OrGuarantors'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/button_Add New Guarantor'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_GuarantorName'), 'Automation Guranter')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_FatherName'), 'father')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_mothername'), 'mother')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Marital Status'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_Unmarried'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_Marital Status'), 'spouse')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/path'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_Month'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_4'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_datepickerArrow'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_PAN'), 'AABCM9806F')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Female'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_AadharNumber'), '789876545678')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_GuarantorEmail'), 'automation_guranter@gmail.com')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_(required)Mobile Number'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_MobileNumber'), '8998898898')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_JK Platform Access Required'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_JKAccess_No'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_IsPrimary'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_IsPrimaryGuarantor_Yes'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_status'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Button Submit'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/button_Edit'))

//**********************************Permanent Address deatils ****************************************************************
WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_PinCode'), '560043')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_(required)Vilage'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_Village'), 'village')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_landmark'), 'landmark')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_Address1'), 'Permanent Address')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_Address2'), 'Automation permanent Address')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Address type(current address)'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_AddressType'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_Years In Current Address'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_years In Current Address'), 
    '4')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Button Update (Permanent Address)'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Button Edit (Current Address)'))

//*******************************************CURRENT ADDRESS*********************************************
WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_current address Pincode'), 
    '586101')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_current Address village'), 
    'village')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_current Address landmark'), 
    'landmark')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_current address 1'), 'street')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_current address2'), 'street')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_no of years in current address'), 
    '5')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Rented'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Page_Anchors Client/span_Update'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Add Bank Account'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_AccountNumber'), '1678909876')

WebUI.setEncryptedText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_ConfirmAccount Number'), 
    'ShH1ZdzQrqSpJBct2Zf0sQ==')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/div_(required)Account Holders Name'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_AccountHolderName'), 'rajeshwari')

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_IFSC Number'), 'ICIC0006506')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/AccountType'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/span_Current'))

WebUI.setText(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/input_AccountHolderNumber'), 
    '9009000900')

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/IsPrimaryBankAccount'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/ISBankAccountPrimary_Yes'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/BankAccountStatus'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/dropdown_Active'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Button Submit'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/Page_Anchors Client/mat-icon_close'))

WebUI.click(findTestObject('Dashboard/EO/E2E/Guarantor/CreateGurantor/Page_Anchors Client/mat-icon_close(Guarantor main)'))

