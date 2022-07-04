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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/Button_New Proposal Agreement'))

//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/span_Product Type'))
///WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/dropdown_Product Type'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/span_Template'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/dropdown_Template'))
WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/input_FLDG Value'), '12')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/input_No Of PDCs Collected'), '1')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/input_Buy Back Agreement'), '12')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/input_Platform Period'), '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/toggle_Is Collection Guarantee Applied'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals(invoice Finance)/Proposal Agreement List/Close Icon'))

