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

// TO VERIFY PUBLIC LIMITED COMPNAY
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/Dropdown_Public Limited Company'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Public Limited Compan', false)

// TO VERIFY PRIVATE LIMITED COMPANY 
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/Dropdown_Private Limited Company'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Private Limited Company', false)

// TO VERIFY PARTNERSHIP
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Partnership'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Partnership', false)

// TO VERIFY Limited Liability Partnership
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Limited Liability Partnership'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Limited Liability Partnership', false)

// TO VERIFY Proprietorship
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Proprietorship'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Proprietorship', false)

// TO VERIFY One Person Company
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_One Person Company'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('One Person Company', false)

// TO VERIFY Section 8 Company
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Section 8 Company'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Section 8 Company', false)

// TO VERIFY Limited Liability Company
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Limited Liability Company'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Limited Liability Company', false)

// TO VERIFY Trust
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Trust'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Trust', false)

// TO VERIFY Co-Operative Society
WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Reset'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/span Firm Type'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/dropdown_Co-Operative Society'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Save'))

WebUI.verifyTextPresent('Co-Operative Society', false)

//Verify Cancel Button in The filters

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button Filters'))

WebUI.click(findTestObject('Dashboard/Entity/UI Testing/Filter Objects/button_Cancel'))

