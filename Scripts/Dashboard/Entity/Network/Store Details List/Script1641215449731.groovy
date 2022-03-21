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

//WebUI.openBrowser('https://test-anchors.jai-kisan.com/anchors/applications')
//WebUI.maximizeWindow()
//Signing in
WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Network'))

//Adding new Store details
WebUI.scrollToElement(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Add New Store'), 
    3)

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Add New Store'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Inputs/input_storeName'), 'Moogle Play')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Store Type/span_StoreType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Store Type/dropdown_StoreType'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Status/span_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Status/dropdown_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Buttons/Button_Submit'))

toast_message = WebUI.getText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Details/Toast message/Toast Messages'))

if (toast_message == 'Fetched Successfully 🎂') {
    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Buttons/Button_Edit'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_pincode'), '571218')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Village'), 'devanageri')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Landmark'), 'school')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Address1'), 'street2')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Address2'), 'block 2')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Address Type/span_AddressType'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Address Type/dropdown_Rented'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_yearsInCurrentAddress'), 
        '2')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Longitude'), '37.2')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Inputs/input_Latitude'), '36.2')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Current Address/Buttons/Button_Update'))

    //Adding Store Manager details
    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/button_Add Store Manager'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_managerName'), 
        'Test Manager')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_Fathers Name'), 
        'Test Father')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_MotherName'), 'Test Mother')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/span_maritialStatus'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/dropdown_maritialStatus'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_PAN'), 'AABCM9806E')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_Email'), 'storemanager@jai-kisan.com')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_mobilenumber'), 
        '8767675678')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/span_gender'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/dropdown_gender'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/input_Aadhar number'), 
        '899266172791')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/span_Status'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/dropdown_status'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/span_jkPlatformAccess'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/dropdown_JKPlatformAccess'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/svg_DatePicker'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/div_calendar-invert'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/div_calendar-arrow'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/div_year'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/div_month'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/div_day'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/button_submit'))

    WebUI.waitForPageLoad(5)

    WebUI.verifyElementText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/div_Test Auto'), 
        'PK jwellers')

    //Adding bank Account details
    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/div_Test Auto'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/Button_Add Bank Account'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/input_AccNumber'), '0456101022909')

    WebUI.setEncryptedText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/input_Account NumberConfirmation'), 
        'fZRK1zp1+yrJ/gRVjTKHzQ==')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/input_AccountHolderName'), 
        'test A')

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/input_Ifsc'), 'CNRB0000456')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/span_AccountType'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/dropdown_AccountType'))

    WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/input_mobileNumber'), 
        '9898989890')

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/Span_IsPrimaryAccount'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/dropdown_IsPrimaryAccount'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/span_Status'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/dropdown_status'))

    WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Bank Account Details/span_Submit'))
} else {
    System.println(toast_message)

    WebUI.takeScreenshot()
}

