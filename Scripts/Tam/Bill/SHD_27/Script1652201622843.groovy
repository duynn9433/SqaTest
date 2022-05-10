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

WebUI.navigateToUrl('http://localhost:8088/')

WebUI.click(findTestObject('Object Repository/Page_ng nhp/input_Mt khu_btn'))

WebUI.click(findTestObject('Object Repository/Page_Trang ch qun l/input_Trang ch qun l_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Seller Home/input_Qun l ho n_search'))

WebUI.click(findTestObject('Object Repository/Page_Seller Home/input_Ch_edit'))

WebUI.click(findTestObject('Object Repository/Page_Trang Ch Sn Phm/tr_Ch thch'))

WebUI.setText(findTestObject('Object Repository/Page_Trang Ch Sn Phm/input_Ch thch_note'), '')

WebUI.click(findTestObject('Object Repository/Page_Trang Ch Sn Phm/input_Ch thch_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Trang Ch Sn Phm/html_Trang Ch Sn Phm                       _6ca6c4'), 
    0)

WebUI.closeBrowser()

