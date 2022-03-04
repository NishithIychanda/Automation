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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/Tab-LoanProposal'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/td_Automation Farmer Input Invoice'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Button/Button-New Proposal Agreement'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Input-Attributes/input_FLDG Value'), 
    '10')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Input-Attributes/input_No of PDCs collected'), 
    '2')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Input-Attributes/input_Buy Back Arrangement'), 
    '11')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Toggle'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Input-Attributes/input_Platform Period'), 
    '10')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Close Icon'))

