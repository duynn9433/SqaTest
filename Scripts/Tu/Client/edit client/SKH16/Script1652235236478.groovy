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

WebUI.navigateToUrl('http://localhost:8088')

WebUI.setText(findTestObject('Object Repository/selling/Page_ng nhp/input_Ti khon_username'), 'manager')

WebUI.setText(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_password'), 'manager')

WebUI.click(findTestObject('login/Page_ng nhp/Page_ng nhp/input_Mt khu_btn'))

WebUI.click(findTestObject('client/Page_Trang ch qun l/input_Trang ch qun l_btn btn-primary'))

WebUI.setText(findTestObject('client/Page_Seller Home/input_Qun l khch hng_search_phone'), '0833081220')

WebUI.click(findTestObject('client/Page_Seller Home/input_Qun l khch hng_search'))

WebUI.click(findTestObject('client/Page_Seller Home/input_Hoa Binh_edit'))

WebUI.setText(findTestObject('client/Page_Manager Home/input_Tn_name'), 'La Manh Tu')

WebUI.setText(findTestObject('client/Page_Manager Home/input_a ch_address'), '+++++++')

WebUI.setText(findTestObject('client/Page_Manager Home/input_ST_phoneNumber'), '0833081220')

WebUI.click(findTestObject('client/Page_Manager Home/input_ST_btn btn-primary'))

WebUI.verifyAlertPresent(1)

WebUI.closeBrowser()

