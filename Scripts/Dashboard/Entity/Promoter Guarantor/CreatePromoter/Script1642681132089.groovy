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

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Gurantor Objects/headder_Promoters OrGuarantors'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Add New Promoter'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Promoter Name'), 
    'Automation Promoter')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Father Name'), 
    'Promoter Father')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input Mother Name'), 
    'Promoter Mother')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Maritial Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Maritial status'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_spouse Name'), 
    'Automation Spouse')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/svg_Date of Birth'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_year'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_date'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Gender'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Gender'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_PAN'), 'BCCPN09899')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_AadharNumber'), 
    '899266172791')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Email'), 'automationpromoter@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Mobile Number'), 
    '9898989890')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_JK Platform Access Required'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_JK access Required'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Is Primary Promoter'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Is Promoter'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Edit(permanent Address)'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_PIN (permanent address)'), 
    '571218')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Taluk(permanent address)'), 
    'Automation')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_landmark(permanent address)'), 
    'school')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Address1(permanent address)'), 
    'street1')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Address 2(permanent address)'), 
    'street2')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_AdderssType(permanent Address)'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Family Owned'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_No of years in current address(permanent address)'), 
    '25')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Edit(Current Address)'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_PIN(Current Address)'), 
    '571218')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Taluk(current Address)'), 
    'Automation')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Landmark(Current Address)'), 
    'Temple')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Address1(Current Address)'), 
    'street2')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Address2(current address)'), 
    'street1')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Address type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Dropdown_Leased'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_No of years in this address(current address)'), 
    '3')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Update(current address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Add Bank Account'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Account Number'), 
    '0456101022909')

WebUI.setEncryptedText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Confirm Account Number'), 
    'fZRK1zp1+yrJ/gRVjTKHzQ==')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_Account Holder Name'), 
    'Automation')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_IFSC code'), 
    'CNRB0000456')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Span_Account Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Account Type'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/input_BankMobile Number'), 
    '9898989890')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Is Primary Account'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Is primary Account'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/span_Bank Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/dropdown_Bankstatus'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/Button_Submit(bank account)'))

WebUI.callTestCase(findTestCase('Dashboard/Entity/Promoter Guarantor/Bank Statements'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/mat-icon_close'))

WebUI.callTestCase(findTestCase('Dashboard/Entity/Promoter Guarantor/Documents'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter Objects/Page_Anchors Client/main promoter cross'))

