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

WebUI.navigateToUrl('https://test-dashboard.jai-kisan.com/home')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Dashboard Login/Login_email'), 'nishith.in@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Dashboard Login/Login_password'), 'HSbZGfHepnKXpMYblUbvtA==')

WebUI.click(findTestObject('Dashboard Login/button_login'))

//Output = WebUI.verifyElementPresent(findTestObject('Dashboard Login/Page_Jai Kisan Applications/Jai Kisan Logo'), 2)
String currentUrl = WebUI.getUrl()

System.println(currentUrl)

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')

if (currentUrl == 'https://test-dashboard.jai-kisan.com/home') {
    System.println('LOGIN SUCCESSFUL')

    WebUI.takeScreenshot(((('C:\\Users\\Nishith IN\\Downloads\\Katalon_Studio_Windows_64-8.2.5\\Katalon_Studio_Windows_64-8.2.5\\Automation\\Screenshots\\OutputScreenshots\\screenshot_' + todaysDate) + '-') + nowTime) + 
        '.PNG')
} else {
    WebUI.takeScreenshot(((('C:\\Users\\Nishith IN\\Downloads\\Katalon_Studio_Windows_64-8.2.5\\Katalon_Studio_Windows_64-8.2.5\\Automation\\Screenshots\\OutputScreenshots\\screenshot_' + todaysDate) + '-') + nowTime) + 
        '.PNG')

    WebUI.verifyElementPresent(findTestObject('Dashboard Login/Text_Invalid username or password'), 2)

    Message = WebUI.getText(findTestObject('Dashboard Login/Text_Invalid username or password'))

    System.println(Message)
}

