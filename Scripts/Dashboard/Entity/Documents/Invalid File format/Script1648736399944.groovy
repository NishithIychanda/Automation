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

WebUI.delay(5)

WebUI.click(findTestObject('Dashboard/Entity/Loan Proposals/Common/div_Entity'))

WebUI.click(findTestObject('Dashboard/Entity/Documents/Page_Anchors Client/div_Documents'))

Actual_txt = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Get Firm Type'))

System.println(Actual_txt)

if (Actual_txt == 'Private Limited Company') {
    WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)

    //VERIFY GIFF FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    System.println(Toast_Message)

    //VERIFY EXCEL FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)

    //VERIFY ABOVE 5MB FILES
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.delay(3)

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)
}else if (Actual_txt == 'Public Limited Company') {
	
	WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)
	
     //VERIFY GIFF FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    System.println(Toast_Message)

    //VERIFY EXCEL FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)

    //VERIFY ABOVE 5MB FILES
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.delay(3)

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)
}else if (Actual_txt == 'Trust') {
	
	WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)
	
     //VERIFY GIFF FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

    System.println(Toast_Message)

    //VERIFY EXCEL FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)

    //VERIFY ABOVE 5MB FILES
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.delay(3)

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)
	
}else if (Actual_txt == 'Partnership') {
    //VERIFY EXCEL FILE FORMAT
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)

    //VERIFY ABOVE 5MB FILES
    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

    WebUI.delay(3)

    Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

    WebUI.takeScreenshot()

    System.println(Toast_Message)
	

    WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Bill 12 months'),'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

    WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
	WebUI.takeScreenshot()
	
	System.println(Toast_Message)
	
}else if (Actual_txt == 'Limited Liability Partnership') {
	
	WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)
	
	 //VERIFY GIFF FILE FORMAT
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

	System.println(Toast_Message)

	//VERIFY EXCEL FILE FORMAT
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)

	//VERIFY ABOVE 5MB FILES
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	WebUI.delay(3)

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)
	
} else if (Actual_txt == 'Proprietorship') {
	
	//VERIFY EXCEL FILE FORMAT
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)

	//VERIFY ABOVE 5MB FILES
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	WebUI.delay(3)

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)
	
	//VERIFY GIFF FILE FORMAT
	
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')
	
	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
	WebUI.takeScreenshot()
	
	System.println(Toast_Message)
	
}else if (Actual_txt == 'One Person Company') {
	WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)
	
		//VERIFY GIFF FILE FORMAT
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
	
		System.println(Toast_Message)
	
		//VERIFY EXCEL FILE FORMAT
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot()
	
		System.println(Toast_Message)
	
		//VERIFY ABOVE 5MB FILES
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		WebUI.delay(3)
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot()
	
		System.println(Toast_Message)
	
}else if (Actual_txt == 'Section 8 Company') {
	WebUI.scrollToElement(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 2)
	
		//VERIFY GIFF FILE FORMAT
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Certificate of Incorporation'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
	
		System.println(Toast_Message)
	
		//VERIFY EXCEL FILE FORMAT
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot()
	
		System.println(Toast_Message)
	
		//VERIFY ABOVE 5MB FILES
		WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')
	
		WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
		WebUI.delay(3)
	
		Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
		WebUI.takeScreenshot()
	
		System.println(Toast_Message)
	
}else if (Actual_txt == 'Limited Liability Company') {
	//VERIFY EXCEL FILE FORMAT
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)

	//VERIFY ABOVE 5MB FILES
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	WebUI.delay(3)

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)
	
	//VERIFY GIFF FILE FORMAT
	
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')
	
	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
	WebUI.takeScreenshot()
	
	System.println(Toast_Message)
}
else if (Actual_txt == 'Co-Operative Society') {
	//VERIFY EXCEL FILE FORMAT
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Certificate'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\Certificate of Incorporation.xlsx')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)

	//VERIFY ABOVE 5MB FILES
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_Company PAN Card'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\10MB file.jpg')

	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))

	WebUI.delay(3)

	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))

	WebUI.takeScreenshot()

	System.println(Toast_Message)
	
	//VERIFY GIFF FILE FORMAT
	
	WebUI.uploadFile(findTestObject('Dashboard/Entity/Documents/FileUpload Objects/FileUpload_GST Bill 12 months'), 'C:\\\\Users\\\\Nishith IN\\\\Desktop\\\\Test Documents\\\\GIF3.gif')
	
	WebUI.click(findTestObject('Dashboard/Entity/Documents/Button_Save'))
	
	Toast_Message = WebUI.getText(findTestObject('Dashboard/Entity/Documents/Invalid File Format/Toast messages'))
	
	WebUI.takeScreenshot()
	
	System.println(Toast_Message)
}

