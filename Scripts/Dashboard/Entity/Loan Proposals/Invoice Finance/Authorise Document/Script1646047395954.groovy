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

WebUI.scrollToElement(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Heading Additional Documents'), 
    5)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Add Authorized Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_Select Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Dropdown_PG Document 1'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_PromoterOrgurantor'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_P - GOPALAKRISHNAN RAMADURAI'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Input_Doc Name'), 'Automation1')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Submit'))

WebUI.verifyTextPresent('Authorised Document Successfully Created', false)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Add Authorized Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_Select Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Dropdwon_PG Document 2'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_PromoterOrgurantor'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_P - THANGAPPAN TITUS RAJAKUMAR'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Input_Doc Name'), 'Automation2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Submit'))

WebUI.verifyTextPresent('Authorised Document Successfully Created', false)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Add Authorized Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/span_Select Document'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Dropdown_PG Document 3'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Input_Doc Name'), 'Automation3')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Authorise Document/Button_Submit'))

WebUI.verifyTextPresent('Authorised Document Successfully Created', false)

