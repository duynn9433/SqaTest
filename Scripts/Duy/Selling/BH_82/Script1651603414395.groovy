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

WebUI.click(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_btn'))

WebUI.click(findTestObject('Object Repository/selling/Page_Seller Home/input_Trang ch nhn vin bn hng_btn btn-primary'))

WebUI.setText(findTestObject('Object Repository/selling/Page_Bn hng/input_Tm_goodsname'), 'bi')

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Tm'))

WebUI.setText(findTestObject('Object Repository/selling/Page_Bn hng/input_goi_amount'), '1')

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Thm'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/td_bim bim'))

WebUI.verifyElementPresent(findTestObject('selling/Page_Bn hng/td_bim bim'), 0)

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/label_Tng tin 5000'))

'Tổng tiền: 5000' == WebUI.getText(findTestObject('selling/Page_Bn hng/label_Tng tin 5000'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/input'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/label_Tng tin 0'))

'Tổng tiền: 0' == WebUI.getText(findTestObject('selling/Page_Bn hng/label_Tng tin 0'))

WebUI.verifyElementNotPresent(findTestObject('selling/Page_Bn hng/td_bim bim'), 0)

WebUI.closeBrowser()

