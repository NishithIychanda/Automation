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

WebUI.setText(findTestObject('Dashboard/Entity/Common/Search Bar'), 'Automation for extend proposals')

WebUI.delay(4)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-LoanProposal'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Extend Proposal Button'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Input Select Buyer Supplier'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Extend Proposal/Buttons/Input Parent Entity'))

errormessage = WebUI.getText(findTestObject('Dashboard/Entity/Loan Proposals/Toast Messages/Extend Proposal -Error message'))

System.println(errormessage)

