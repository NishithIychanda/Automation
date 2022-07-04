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

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Button/Button_Add Bank Account'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/Account Number'), '0456101022909')

WebUI.setEncryptedText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/Confirm Account Number'), 
    'fZRK1zp1+yrJ/gRVjTKHzQ==')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/Account Holder Name'), 
    'Rajeshwari B')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/IFSC code'), 'PUNB0999900')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/MICR code'), '673240004')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/AccountType/Account Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/AccountType/AccountType_options-Current'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Input/BankMobile Number'), 
    '9898989891')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Is Primary Bank Account/Click-Is Primary Account'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Is Primary Bank Account/Is primary Account_option-Yes'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Status1/Click-Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Status1/Status_option-Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Account Information/Button/Button_Submit'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Proposal Agreement List/Close Icon'))

WebUI.delay(3)

WebUI.closeBrowser()

