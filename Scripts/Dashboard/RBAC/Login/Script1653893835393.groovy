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

WebUI.navigateToUrl('https://auth.jai-kisan.com/auth/realms/test/protocol/openid-connect/auth?client_id=rbac-client&redirect_uri=https%3A%2F%2Ftest-access.jai-kisan.com%2Frbac%2Fm%2Fusers%2F7de6958a-b03c-4375-8165-cbf9e65335b0&state=5cee92b8-9427-4d1d-87ea-d4d6a10f911a&response_mode=fragment&response_type=code&scope=openid&nonce=b0b22aec-e1b5-4e57-8d03-3973b8677c1f')

WebUI.setText(findTestObject('Object Repository/Dashboard/RBAC/Login/Input_Log In with Jai Kisan Credentials'), 'nishith.in@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dashboard/RBAC/Login/input_Username or email_password'), 'HSbZGfHepnKXpMYblUbvtA==')

WebUI.click(findTestObject('Object Repository/Dashboard/RBAC/Login/Button_Sign In'))

