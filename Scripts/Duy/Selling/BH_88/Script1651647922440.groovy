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

WebUI.click(findTestObject('Object Repository/selling/Page_ng nhp/tbody_Ti khon                              _4d7b64'))

WebUI.setText(findTestObject('Object Repository/selling/Page_ng nhp/input_Ti khon_username'), 'seller')

WebUI.setEncryptedText(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_password'), 'e1V7F5cNMHE=')

WebUI.sendKeys(findTestObject('Object Repository/selling/Page_ng nhp/input_Mt khu_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/selling/Page_Seller Home/input_Trang ch nhn vin bn hng_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Tm'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/input_lon_chooseIndex'))

WebUI.setText(findTestObject('Object Repository/selling/Page_Bn hng/input_lon_amount'), '1')

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Thm'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Tm khch hng'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/td'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/input_lon_chooseIndex'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Chn khch hng'))

WebUI.click(findTestObject('Object Repository/selling/Page_Bn hng/button_Lu ho n'))

//lay so ban ghi ban dau trong bang bill
CustomKeywords.'duynn.MyDatabaseUtils.connectDB'('127.0.0.1', 'sqaspring', '3306', 'root', 'root')

def recordset = CustomKeywords.'duynn.MyDatabaseUtils.executeQuery'('SELECT COUNT(*) as num FROM sqaspring.bill;')
recordset.next()
def num_count = Integer.parseInt(recordset.getString("num"))
System.out.println(num_count)

WebUI.click(findTestObject('Object Repository/selling/Page_Xc nhn ho n/button_Lu'))

//lay so luong ban ghi trong bill luc sau
recordset = CustomKeywords.'duynn.MyDatabaseUtils.executeQuery'('SELECT COUNT(*) as num FROM sqaspring.bill;')
recordset.next()
def num2 = Integer.parseInt(recordset.getString("num"))

System.out.println(num_count)
System.out.println(num2)


//tang 1 la dung
WebUI.verifyEqual(num_count + 1, num2)


WebUI.closeBrowser()

