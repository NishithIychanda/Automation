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

WebUI.navigateToUrl('https://test-anchors.jai-kisan.com/anchors/proposals-listing')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Dashboard Login/Login_email'), 'nishith.in@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Dashboard Login/Login_password'), 'HSbZGfHepnKXpMYblUbvtA==')

WebUI.click(findTestObject('Dashboard Login/button_login'))

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Search/input_SearchText'))

WebUI.setText(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Search/input_SearchText'), SeachLenderName)

WebUI.delay(5)

FetchedLenderName = WebUI.getText(findTestObject('Dashboard/Entity/Loan Proposals/Loan Proposal Search/LenderName'))

System.println(FetchedLenderName)

if (SeachLenderName == FetchedLenderName) {
    System.println('Proposal fetched successfully')
} else {
    System.println('Proposal fetching failed!')
}
