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

WebUI.uploadFile(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/Button/Button_Upload Statement'), 
    'D:\\\\Demo\\\\bankStmt.pdf')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/Button/Analyze'))

//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/Input/Bank Name (1)'), 'sanm')
WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/BankStatment/Page_Anchors Client/Sanmathi Sahakari Bank'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/AccountType/Account Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/AccountType/AccountType_options-Current'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/DocumentType/Document Type'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/DocumentType/dropdown_Docuement Type'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/Button/Password'), '1234')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/BankStatment/Page_Anchors Client/Submit'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank Statements/BankStatment/Page_Anchors Client/div_Items per page_cdk-overlay-backdrop cdk_babf5f'))

