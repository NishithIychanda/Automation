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

WebUI.callTestCase(findTestCase('Dashboard/Clients/Onboard New Client'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Permanent Address Edit Button'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Pincode'), '577217')

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Pincode Ok Button'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Village'), 'Gopagondanhalli')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Landmark'), 'Street23')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Street Address1'), 'Perambur High Road')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Street Address2'), 'D Block Vikaspuri')

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Address Type'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Address Type'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Years In Current Address'), '11')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Permanent Address/Input Latitude'), '1.098')

WebUI.setText(findTestObject('Dashboard/Clients/Permanent Address/Input Longitude'), '1.099')

WebUI.click(findTestObject('Dashboard/Clients/Permanent Address/Submit Button For Permanent Details'))

Message = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message)

