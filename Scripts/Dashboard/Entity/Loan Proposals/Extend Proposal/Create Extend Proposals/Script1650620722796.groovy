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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-LoanProposal'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Extend Proposal Button'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Input Select Buyer Supplier'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Dropdowns/Dropdown Buyer or Supplier'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/input_Proposal Name'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Dropdowns/Dropdown Proposal Name'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/delay'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Submit button for Extend'))

toastmsg = WebUI.getText(findTestObject('Dashboard/Entity/Promoter Guarantor/Guarantor/Toast Messages/Toast message'))

System.println(toastmsg)

