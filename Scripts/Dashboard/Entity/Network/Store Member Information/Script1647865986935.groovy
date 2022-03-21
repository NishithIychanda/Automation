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

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Common/Tab-Network'))

WebUI.click(findTestObject('Dashboard/Entity/Common/div_Store'))

//Adding Store Manager details
WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Buttons/button_Add Store Manager'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_managerName'), 
    'Test Manager')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_Fathers Name'), 
    'Test Father')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_MotherName'), 
    'Test Mother')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/span_maritialStatus'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/dropdown_maritialStatus'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_PAN'), 
    'AABCM9806E')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_Email'), 
    'storemanager@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_mobilenumber'), 
    '8767675678')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/span_gender'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/dropdown_gender'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Inputs/input_Aadhar number'), 
    '899266172791')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/span_Status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/dropdown_status'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/span_jkPlatformAccess'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dropdowns/dropdown_JKPlatformAccess'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/svg_DatePicker'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/div_calendar-invert'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/div_calendar-arrow'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/div_year'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/div_month'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Dob Datepicker/div_day'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Store Manager Information/Buttons/button_submit'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Buttons/Button_Edit'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_pincode'), 
    '410401')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_village'), 
    'devenageri')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_Landmark'), 
    'School')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_streetAddress1'), 
    'Street Address1')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_streetAddress2'), 
    'Street Address2')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_yearsInCurrentAddress'), 
    '5')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_Lattitude'), 
    '23.34')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Inputs/input_Longitude'), 
    '45.55')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Dropdowns/span_Address type'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Dropdowns/dropdown_Family Owned'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Permanent Address/Buttons/button_update'))

//CURRENT ADDRESS OF STORE MANAGER
WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Buttons/Button_Edit'))

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_pincode'), 
    '410401')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_village'), 
    'devenageri')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_Landmark'), 
    'School')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_streetAddress1'), 
    'Street Address1')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_streetAddress2'), 
    'Street Address2')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_yearsInCurrentAddress'), 
    '5')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_Lattitude'), 
    '23.34')

WebUI.setText(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Inputs/input_Longitude'), 
    '45.55')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Dropdowns/span_Address type'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Dropdowns/dropdown_Leased'))

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Current Address/Buttons/button_update'))

//DOCUEMNTS****************************************************************
WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_Profile Photo'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_Aadhar Card Front'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

//WebUI.scrollToElement(findTestObject('Dashboard/Entity/Promoter Guarantor/Promoter/Promoter Document/Upload/Upload_CA Certified NetWorth'),
//    2)
WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_Aadhar Card Back'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_Address Proof'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_KYC'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

WebUI.uploadFile(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Upload/Upload_CA Certified NetWorth'), 
    'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Channel Logo.jpg ')

WebUI.click(findTestObject('Dashboard/Entity/Network/Store Details List/Store Member Details/Documents/Button/Button Save'))

