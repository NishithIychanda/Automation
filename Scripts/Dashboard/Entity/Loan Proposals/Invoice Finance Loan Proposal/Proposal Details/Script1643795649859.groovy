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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/div_JAGADISH KELAGERI CIVIL WORKS CONTRACTOR'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Headder_Loan Proposals'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Button_New Proposal'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Proposal Name'), 'Automation Invoice Finance')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Product Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Dropdown_Invoice Finance'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Proposed Loan Amount'), '2000')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_ROI'), '2')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Processing Fees'), '2')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_LTV'), '2')

//WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Proposed Commercial Offered'), '2')
WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Tenure'), '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Tenure Unit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Tenure Unit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Repayment Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Repayment Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Agreement Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Agreement Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Category'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Institution'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Borrower Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Single Borrower'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Commission Type'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Percentage'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Global Margin'), '22')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Loan Object Origin'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Loan scheme Origin'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_Lender'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/dropdown_Lender'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Approved Loan Amount'), '2222')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Utilized Credit Limit'), '2')

//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/span_External User Management'))
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Purpose Of loan'))
WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/input_Purpose Of loan'), 'Automation Invoice Loan Proposal')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Button_Submit'))

