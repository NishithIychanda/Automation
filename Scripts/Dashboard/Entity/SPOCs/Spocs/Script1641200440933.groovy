import org.openqa.selenium.By as By
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
WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/div_EN-220103-001497'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Header_SPOCs'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/button_Add New SPOC'))

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/input_FullName'), 'Automation Spoc')

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/input_Email'), 'test2@jai-kisan.com')

WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/input_MobileNumber'), '7878787890')

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/span_department'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/dropdown_Central Operations (COPS)'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/span_IsPrimary'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/span_No'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/span_status'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/span_Active'))

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Button_Submit'))

WebUI.delay(3)

//CLONE VERIFICATION 
String Paginationcount1 = WebUI.getText(findTestObject('Dashboard/Entity/SPOCs/pagination count'))

String[] CountbeforeClone = Paginationcount1.split(' ')

println(CountbeforeClone[4])

WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Button Clone'))

WebUI.verifyElementVisible(findTestObject('Dashboard/Entity/SPOCs/Toast Message Clone'), FailureHandling.STOP_ON_FAILURE)

Paginationcount2 = WebUI.getText(findTestObject('Dashboard/Entity/SPOCs/pagination count'))

CountAfterClone = Paginationcount2.split(' ')

println(CountAfterClone[4])

if ((CountAfterClone[4]) != CountbeforeClone) {
    println('Cloned Successfully 🎂')

    //Serch Spoc Verification
    WebUI.setText(findTestObject('Dashboard/Entity/SPOCs/input_Search Spoc'), 'Automation Spoc')

    WebUI.delay(5)

    searchresult = WebUI.getText(findTestObject('Dashboard/Entity/SPOCs/Search_result'))

    println(searchresult)

    if (searchresult == 'Automation Spoc') {
        println('Search successfull')

        //Delete spoc Verification
        WebUI.click(findTestObject('Dashboard/Entity/SPOCs/Delete _Icon'))

        WebUI.verifyElementVisible(findTestObject('Dashboard/Entity/SPOCs/delete_toast message'))
    } else {
        println('No rescords Found or Seach faild due to some error')
    }
} else {
    println('Cloned Failed ')
}

