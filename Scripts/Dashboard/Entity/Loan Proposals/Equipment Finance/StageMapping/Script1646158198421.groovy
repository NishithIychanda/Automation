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

//WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tabs/div_Entity'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Details/Tabs/Tab-Loan Proposals'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/td_Automation Equipment Finanace'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-StageMapping_Edit'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Click_Stage'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Documents Submission'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Click-Stage Status'))
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/StageStatus_options-Pending'))
//WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Stage Comment'), 
//  'Document submission pending')
//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-DocumentSubmission_Update'))
WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Extra/i_check_circle(EquipmentFinance)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/button_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/StageStatus_options-Completed'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Document Submission/Stage Comment'), 'Document submission completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-DocumentSubmission_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-StageMapping_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Click_Stage'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Credit Approval'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/StageStatus_options-Pending'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Stage Comment'), 'credit approval pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/button_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Mat-icon/mat-icon_check_circle'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/button_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/StageStatus_options-Completed'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Credit Approval/Stage Comment'), 'credit approval completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-DocumentSubmission_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/button_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Click_Stage'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Post Sanction'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/StageStatus_options-Pending'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Stage Comment'), 'post sanction pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-DocumentSubmission_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-StageMapping_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/StageStatus_options-Completed'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Post Sanction/Stage Comment'), 'post sanction completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-DocumentSubmission_Update'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/Button-StageMapping_Edit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Click_Stage'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Activated'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/StageStatus_options-Pending'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Stage Comment'), 'activation pending')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Button/button_Update'))

//WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Extra/div_Manually added,but unverified_cdk-overl_aafab3'))
WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Mat-icon/mat-icon_close'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Extra/span_CreateAttachView'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/CreateAttach Loan Scheme/Click-Loan Scheme'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/CreateAttach Loan Scheme/LoanScheme_option(EquipmentFinance)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/CreateAttach Loan Scheme/Button_LoanScheme-Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/td_Automation Equipment Finanace'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Extra/span_Edit(Activation)'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Click-Stage Status'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/StageStatus_options-Completed'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Activated/Stage Comment'), 'activation completed')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/StageMapping/Extra/span_update(Activation)'))

WebUI.delay(5)

WebUI.closeBrowser()

