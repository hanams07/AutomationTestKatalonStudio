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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.dicoding.com/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/a_Masuk'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pages/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/emaill'), 'hanamaria2307@gmail.com')

WebUI.setEncryptedText(findTestObject('Pages/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/passwordd'), 'hCc8x1UqSX8vfSLAHukwvg==')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Page_Dicoding Indonesia - Bangun Karirmu Se_eb00a6/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pages/Page_Dicoding Indonesia/a_Lanjut berlangganan'))

WebUI.click(findTestObject('Object Repository/Pages/Page_Biaya Investasi Belajar Kurikulum Glob_5cbbe8/a_Pilih paket'))

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Page_BuyPacket_Dicoding/a_Lihat daftar promo'))

WebUI.click(findTestObject('Pages/Page_BuyPacket_Dicoding/button_Salin Kode'))

WebUI.click(findTestObject('Pages/Page_BuyPacket_Dicoding/svg'))

WebUI.delay(3)

WebUI.click(findTestObject('Pages/Page_BuyPacket_Dicoding/promo'))

WebUI.setText(findTestObject('Pages/Page_BuyPacket_Dicoding/promo'), 'DEALS1122')

WebUI.delay(3)

WebUI.scrollToPosition(50, 60)

WebUI.click(findTestObject('Pages/Page_BuyPacket_Dicoding/button_Bayar'))

WebUI.verifyElementText(findTestObject('Pages/BuyPacket/Price'), 'IDR 1.500.000')

WebUI.delay(5)

WebUI.closeBrowser()

