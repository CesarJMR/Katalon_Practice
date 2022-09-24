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

CustomKeywords.'Funciones.Entrar_a_web_app'()

CustomKeywords.'Funciones.Log_in'()

WebUI.click(findTestObject('Escenario4/Btn_My_Adresses'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Escenario4/Btn_Update'))

WebUI.waitForElementPresent(findTestObject('Escenario4/Confirmacion_modifying_address'), 30)

WebUI.clearText(findTestObject('Escenario4/Campo_Company'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Escenario4/Campo_Address_(Line2)'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Escenario4/Campo_Home_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Escenario4/Campo_Additional_information'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Escenario4/Btn_Back_to_your_addresses'))

WebUI.verifyElementPresent(findTestObject('Escenario4/Confirmacion_address_creada'), 30)

WebUI.closeBrowser()

