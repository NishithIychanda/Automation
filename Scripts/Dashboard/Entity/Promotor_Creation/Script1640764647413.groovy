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

WebUI.navigateToUrl('https://auth.jai-kisan.com/auth/realms/test/protocol/openid-connect/auth?client_id=dashboard&redirect_uri=https%3A%2F%2Ftest-dashboard.jai-kisan.com%2F&state=cccb44a4-319e-4ba6-a20a-fa5b61d43bf5&response_mode=fragment&response_type=code&scope=openid&nonce=e76e14dc-5df8-4654-8467-a56234e116d4')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Sign in Google Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Dahboard_Jai Kisan/span_Entity'))

WebUI.switchToWindowTitle('Anchors Client')

WebUI.click(findTestObject('Dashboard/Entity/SPOC Details/button_New Entity Onboarding'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/Toggle_ispromoter'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_PromoterName'), 'promoter auto')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_Fathername'), 'Nanjappa IM')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_Mothername'), 'Tanuja IN')

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dropdown_Maritalstatus'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/MaritalStatus_married'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_Spousename'), 'Jaya')

//to select the date
WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dob_datepicker'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/span_year'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/div_calendar-arrow'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dob_year'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dob_month'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dob_date'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/span_gender'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/dropdown_Female'))

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_PAN'), 'BCCPN4382D')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_Aadhar'), '899266172791')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_email'), 'nishith.in@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/Promoter Details/input_mobilenumber'), '9481854890')

//primary & active
WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/span_isprimarypromoter'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/isprimarypromoter_No'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/div_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/Status_Active'))

WebUI.click(findTestObject('Dashboard/Entity/Promoter Details/Button_Submit'))

WebUI.closeBrowser()
