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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://test-anchors.jai-kisan.com/anchors/applications')

//WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Dashboard/Entity/Dahboard_Jai Kisan/span_Entity'))
//WebUI.switchToWindowTitle('Anchors Client')
WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/button_New Entity Onboarding'))

WebUI.setText(findTestObject('Dashboard/Entity/SPOC Details/Input_Fullname'), 'Automation Test')

WebUI.setText(findTestObject('Dashboard/Entity/SPOC Details/input_Email'), 'test@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/SPOC Details/input_Phonenumber'), '9481854891')

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/dropdown_department'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/span_Central Operations (COPS)'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/is_primary'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/span_Yes'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/dropdown_status'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/status_Yes'))

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/button_Submit'))

