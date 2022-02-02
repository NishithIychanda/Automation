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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

KeywordLogger log = new KeywordLogger()

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Filter'), 0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Filter'))

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Leader_filter'), 0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Leader_filter'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Leader_filter_Checkbox'), 0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Leader_filter_Checkbox'))

//Filtername = " Care India finvest "
//WebUI.click(findTestObject('Dashboard/LOS/Bookings/Leader_filter_Checkbox'))
WebUI.click(findTestObject('Dashboard/LOS/Bookings/button_filter_Apply'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Filter'))

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Filter'), 0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/button_filter_Clear'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/button_filter_Apply'))

