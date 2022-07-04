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

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Header_Loan Proposals'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/td_Automation Invoice Finance'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Dropdown_stage status (completed)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Document  Submission completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Span_Documents Submission (stage)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Dropdown_Credit Approval (stage)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Completed(stage status)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Dropdown_Pending (stage status)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Credit Approval Pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/mat-icon_Verification'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Dropdown_stage status (completed)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Credit Approval Completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Span_Documents Submission (stage)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Dropdown_Post Sanction stage'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Dropdown_Pending (stage status)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Post Sanction Pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Completed_PostSanction'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Post Sanction Completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Span_Documents Submission (stage)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Activated'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Dropdown_Pending (stage status)'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Activation Pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/mat-icon close'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_CreateAttachView'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Loan Scheme'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Dropdown_Loan scheme selection'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Submit(loan scheme)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/td_Automation Invoice Finance'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/Button_Edit (stage mapping)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_Invoice Finance/span_Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/Activation_Completed'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/input_Stage Comment'), 'Activation Completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/StageMapping_BNPL/span_Update(StageMapping)'))

