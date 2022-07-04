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

//WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Button/Button_Edit(Current Address)'))
//
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/PIN(Current Address)'), 
//    '571218')
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/input_Taluk(current Address)'), 
//    'Automation')
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/Landmark(Current Address)'), 
//    'Temple')
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/Address1(Current Address)'), 
//    'street2')
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/Address2(current address)'), 
//    'street1')
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
//WebUI.setText(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Input/No of years in this address(current address)'), 
//    '3')
WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Button/Button_Edit(Current Address)'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Toggle/toggle'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Current Address/Button/Button_Update(current address)'))

