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

KeywordLogger log = new KeywordLogger()

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Dashboard Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Sign in Google Account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Menu_LOS'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/SubMenu_Bookings'))

//WebUI.verifyElementNotClickable(findTestObject('Dashboard/LOS/Bookings/Previous_Page'))
//WebUI.verifyElementNotClickable(findTestObject('Dashboard/LOS/Bookings/First_Page'))
//WebUI.verifyElementClickable(findTestObject('Dashboard/LOS/Bookings/Next_Page'))
//WebUI.verifyElementClickable(findTestObject('Dashboard/LOS/Bookings/Last_Page'))
WebUI.click(findTestObject('Dashboard/LOS/Bookings/Last_Page'))

//WebUI.verifyElementNotClickable(findTestObject('Dashboard/LOS/Bookings/Last_Page'))
//WebUI.verifyElementNotClickable(findTestObject('Dashboard/LOS/Bookings/Next_Page'))
//WebUI.verifyElementClickable(findTestObject('Dashboard/LOS/Bookings/Previous_Page'))
//WebUI.verifyElementClickable(findTestObject('Dashboard/LOS/Bookings/First_Page'))
WebUI.click(findTestObject('Dashboard/LOS/Bookings/First_Page'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Next_Page'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Previous_Page'))

WebUI.callTestCase(findTestCase('Dashboard/Common Cases/Filters'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Invoice-SNRN'), 0)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Invoice-SNRN'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Loan Scheme Invoice'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Loan Scheme Invoice option'))

WebUI.delay(1)

//WebUI.sendKeys(findTestObject('Dashboard/LOS/Bookings/Loan Scheme Invoice option'), Keys.chord(Keys.TAB))
//WebUI.delay(3)
WebUI.click(findTestObject('Dashboard/LOS/Bookings/button_invoice_cancel'))

WebUI.delay(1)

Customername = WebUI.getText(findTestObject('Dashboard/LOS/Bookings/Customer_name'))

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Search_box'))

WebUI.setText(findTestObject('Dashboard/LOS/Bookings/Search_box'), Customername)

WebUI.clearText(findTestObject('Dashboard/LOS/Bookings/Search_box'))

WebUI.sendKeys(findTestObject('Dashboard/LOS/Bookings/Search_box'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Dashboard/LOS/Bookings/Booking_1stApplication_id'), 0)

Applicationid = WebUI.getText(findTestObject('Dashboard/LOS/Bookings/Booking_1stApplication_id'))

log.logInfo(Applicationid)

WebUI.click(findTestObject('Dashboard/LOS/Bookings/Booking_1stApplication_id'))

WebUI.waitForElementVisible(findTestObject('Dashboard/LOS/Bookings/Booking_Applicationid'), 0)

Applicationid1 = WebUI.getText(findTestObject('Dashboard/LOS/Bookings/Booking_Applicationid'))

log.logInfo(Applicationid1)

WebUI.verifyEqual(Applicationid, Applicationid1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

