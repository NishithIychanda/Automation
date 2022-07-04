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

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Edit Button'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Dob Button'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Select Month'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Select Date'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Gender'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Gender Dropdown'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input KYC'), 'ZEPH1943T')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Aadhar Number'), 
    '786756789786')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Fathers Name'), 'Channesh')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Mothers Name'), 'Shakunthala')

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Maritial Status'))

WebUI.click(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Dropdown Maritial Status'))

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Spous Name'), 'JAYA')

WebUI.setText(findTestObject('Object Repository/Dashboard/Clients/Additional Details/Input Annual Income'), 
    '23444')

WebUI.click(findTestObject('Dashboard/Clients/Additional Details/Submit Button in Client Details'))

Message = WebUI.getText(findTestObject('Dashboard/Clients/Toast message'))

System.println(Message)

