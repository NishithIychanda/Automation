import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-anchors.jai-kisan.com/anchors/applications')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Dashboard Login/Login_email'), 'nishith.in@jai-kisan.com')

WebUI.setEncryptedText(findTestObject('Dashboard Login/Login_password'), 'HSbZGfHepnKXpMYblUbvtA==')

WebUI.click(findTestObject('Dashboard Login/button_login'))
