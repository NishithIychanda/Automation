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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://auth.jai-kisan.com/auth/realms/test/protocol/openid-connect/auth?client_id=dashboard&redirect_uri=https%3A%2F%2Ftest-dashboard.jai-kisan.com%2F&state=72f75b32-3635-4c03-826a-151f7d085024&response_mode=fragment&response_type=code&scope=openid&nonce=8f0dd764-353d-4d87-8d73-3daabd9fb451')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Dashboard Login/Login_email'), 'nishith.in@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Dashboard Login/Login_password'), 'HSbZGfHepnLggGGGOb19Sw==')

WebUI.click(findTestObject('Dashboard Login/button_login'))

