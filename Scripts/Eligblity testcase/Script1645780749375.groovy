import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.mongodb.BasicDBObject
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoClient

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-eligibility.jai-kisan.com/signup')

WebUI.setText(findTestObject('Object Repository/Eligblity/Page_Check Eligibility  Sign up/input_This will allow us to help you with y_f69f09'), 
    '9481854890')

WebUI.click(findTestObject('Object Repository/Eligblity/Page_Check Eligibility  Sign up/button_Next'))




//OTP fetching 
static String getOtp() {
	MongoClientURI connectionString = new MongoClientURI('mongodb://admin:Y2Vzc3Bvb2w@cesspool.jai-kisan.com:30001,cesspool.jai-kisan.com:30002,cesspool.jai-kisan.com:30003/vendor_erp?authSource=admin&replicaSet=cesspool&readPreference=primary&appname=MongoDB%20Compass&ssl=false')
	
	MongoClient mongoClient = new MongoClient(connectionString)
	
	String otp = mongoClient.getDatabase('bk-bnpl-uat').getCollection('otp').find().sort(new BasicDBObject('_id', OrderBy.DESC.getIntRepresentation())).limit(
		1).first().getString('otp')
	return otp
}

