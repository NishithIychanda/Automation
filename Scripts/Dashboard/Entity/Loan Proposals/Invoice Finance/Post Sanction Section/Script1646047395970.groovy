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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/Button_Edit'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_JK to Lender Commission'), '22')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_Anchor to Jk Commission'), '2')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/span_Processing Fee Received'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/dropdown_Processing fee Received'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_Processing Fee Amount'), '20000')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_UTR Number'), '1234567')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_Docket Number'), '123456')

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/input_Courier Partner'), 'me')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/Date Picker'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/div_Month'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/div_Date'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/Add Icon'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Post Sanction Section/mat-icon_remove_circle'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Underwriting Section/Button_Update'))

