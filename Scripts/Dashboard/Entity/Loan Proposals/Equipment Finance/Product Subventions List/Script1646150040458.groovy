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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/Tab-LoanProposal'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/td_Automation Equipment Finanace'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Button/Button-New Product Subvention'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Product/Click-Product'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Product/Product_option-Automatic Feeding system'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Product Brand/Click-Product Brand'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Product Brand/ProductBrand_option-Bharath Engineerings'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Tenure Based Margin/Click-Operator'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Tenure Based Margin/Operator_option-greaterthan'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Tenure Based Margin/Enter Tenure'), 
    '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Tenure Based Margin/Unit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Tenure Based Margin/Unit_option-Days'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Click-Operator'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Operator_option-greaterthan'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Price Rs'), '23111')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Click-Margin Unit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Margin_option-Percentage'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Product Subventions List/Loan Amount Based/Input-Margin'), 
    '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Close Icon'))

