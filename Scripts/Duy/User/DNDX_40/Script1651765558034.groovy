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

WebUI.click(findTestObject('Object Repository/login/Page_ng nhp/form_Ti khon                               _746716'))

WebUI.setText(findTestObject('Object Repository/login/Page_ng nhp/input_Ti khon_username'), 'manager')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_ng nhp/input_Mt khu_password'), 'RVfeMFa65gU=')

WebUI.sendKeys(findTestObject('Object Repository/login/Page_ng nhp/input_Mt khu_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/login/Page_Trang ch qun l/input_Xin cho manager_btn btn-danger'))

WebUI.click(findTestObject('Object Repository/login/Page_ng nhp/h1_ng nhp'))

WebUI.verifyElementPresent(findTestObject('login/Page_ng nhp/h1_ng nhp'), 0)

WebUI.closeBrowser()

