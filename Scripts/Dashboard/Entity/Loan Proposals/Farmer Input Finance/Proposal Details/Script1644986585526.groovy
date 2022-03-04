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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tabs/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tabs/Tab-Loan Proposals'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Button/Button_New Proposal'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Proposal Name'), 'Automation Farmer Input Finance')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Loan Product/Loan_Product'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Loan Product/Dropdown_Farmer Input Finance'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Proposed Loan Amount'), 
    '100000')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_ROI'), '2')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Processing Fees'), 
    '2')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_FLDG or Cash Collateral Offered'), 
    '22')

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Global Margin'), 
    2)

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_LTV'), '2')

//WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Proposed Commercial Offered'), '2')
WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Tenure'), '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tenure Unit/Click-Tenure Unit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tenure Unit/TenureUnit_Option-Months'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Repayment Type/Click_Repayment Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Repayment Type/Repayment Type_options-CHURNING CYCLE'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Repayment Cycle days'), 
    '10')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/AgreementType/span_Agreement Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/AgreementType/dropdown_Aggrement(options)-FLDG'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Category/Click-Category'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Category/Category_Options-Institution'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Borrower/Click-Borrower Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Borrower/Borrower_option-Single Borrower'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Commission Type/Click-Commission Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Commission Type/CommissionType_option-Percentage'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Global Margin'), '22')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Loan Amount Origin/Click-Loan Amount Origin'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Loan Amount Origin/LoanAmountOrigin_options-From Loan Scheme'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Lender/Click-Lender'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Lender/Lender_option-DCB Bank Limited(FarmerInputFinance)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Approved Loan Amount'), 
    '50000')

//WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Utilized Credit Limit'), '2')
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tabs/span_External User Management'))
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Purpose Of loan'))
WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Input-Attributes/input_Purpose Of loan'), 
    'Automation Farmer Input Finance')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Button/Button_Submit'))

