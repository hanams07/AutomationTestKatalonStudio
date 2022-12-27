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

WebUI.verifyElementText(findTestObject('Pages/MyAccountPage/loginpage/Cover'), 'Bangun Karirmu Sebagai Developer Profesional')

WebUI.delay(3)

WebUI.click(findTestObject('Pages/MyAccountPage/loginpage/a_Masuk'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pages/MyAccountPage/loginpage/email'), 'hanamaria2307@gmail.com')

WebUI.setEncryptedText(findTestObject('Pages/MyAccountPage/loginpage/password'), '7C2D4lYIIh+lbRCJsdzH3g==')

WebUI.delay(3)

WebUI.click(findTestObject('Pages/MyAccountPage/loginpage/button_Masuk'))

WebUI.verifyElementText(findTestObject('Pages/MyAccountPage/loginpage/Warning'), 'Gagal melakukan proses autentikasi. Mohon untuk mengisi email & password dengan benar.')

WebUI.delay(3)

WebUI.closeBrowser()

