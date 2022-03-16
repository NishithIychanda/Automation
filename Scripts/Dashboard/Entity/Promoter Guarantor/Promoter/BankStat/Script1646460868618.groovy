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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-anchors.jai-kisan.com/')

WebUI.setText(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Log in to Jai Kisan/input_Log In with Jai Kisan Credentials pro_a7df47'), 
    'rajeshwari.bannetti@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Log in to Jai Kisan/input_Username or email_password'), 
    'xvjjEBxldR2vB9xSRsStyg==')

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Log in to Jai Kisan/input_Forgot Password_login'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/td_EN-220305-002253'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/div_Promoters  Guarantors'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/div_Automation Promoter'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Add Bank Statement'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Analyze'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/input_Bank Statement Analysis_en-sec-analys_a76828'), 
    'sanm')

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Sanmathi Sahakari Bank'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Current'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/div_(required)Document Type'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Scanned'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Submit'))

WebUI.click(findTestObject('Object Repository/Dashboard/Entity/Promoter Guarantor/Promoter/Bank/Page_Anchors Client/span_Submit'))

