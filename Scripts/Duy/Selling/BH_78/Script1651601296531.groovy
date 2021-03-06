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

WebUI.navigateToUrl('http://127.0.0.1:8088/')

WebUI.click(findTestObject('Object Repository/selling/Page_ng nhp/form_Ti khon                               _746716'))

WebUI.setText(findTestObject('Object Repository/selling/Page_ng nhp/input_Ti khon_username'), 'seller')

WebUI.setEncryptedText(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_password'), 'e1V7F5cNMHE=')

WebUI.sendKeys(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/selling/Page_Seller Home/input_Trang ch nhn vin bn hng_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/selling/Page_Bn hng/input_Tm_goodsname'), 'abc')

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Tm'))

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'Kh??ng t??m th???y s???n ph???m n??o;', false)

WebUI.closeBrowser()

