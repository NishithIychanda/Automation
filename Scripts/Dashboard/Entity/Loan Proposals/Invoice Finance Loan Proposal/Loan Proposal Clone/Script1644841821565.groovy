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

WebUI.callTestCase(findTestCase('Search_merit tech'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/div_JAGADISH KELAGERI CIVIL WORKS CONTRACTOR'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Headder_Loan Proposals'))

String Paginationcount1 = WebUI.getText(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Clone/Pagecount'))

String[] CountbeforeClone = Paginationcount1.split(' ')

println(CountbeforeClone[4]);

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Clone/Div_LoanProposal'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Clone/Button_Clone'))

WebUI.verifyElementVisible(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Clone/Clone success toast message'))


Paginationcount2 = WebUI.getText(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Clone/Pagecount'))


CountAfterClone = Paginationcount2.split(' ')

println(CountAfterClone[4]);

 

if(CountAfterClone[4] != CountbeforeClone)
	 {
	println("Cloned Successfully 🎂")
	 }
else 
{
	println("Cloned Failed ")
	
	}
