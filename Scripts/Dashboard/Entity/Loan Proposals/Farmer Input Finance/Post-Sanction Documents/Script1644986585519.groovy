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

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Sanction Letter'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Corporate Guarantee'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/FLDG'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Promissory Note'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/MoU'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Security Cheques'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/FD Lien Marked'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Borrower Agreement'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Lender Partner Agreement'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Deed of Authority'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Demand Promissory Note'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Bank Guarantee'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/Cash Collateral'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Loan Proposals/Post-Sanction Documents/PF Invoice'), 'D:\\\\Demo\\\\sample.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Additional Documents/Button_Save'))

