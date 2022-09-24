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

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(5, 1), false)

WebUI.click(findTestObject('Escenario4/Btn_Add_new_address'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(5, 2), false)

WebUI.setText(findTestObject('Escenario4/Campo_Company'), findTestData('AutomationPractice').getValue(5, 3))

WebUI.setText(findTestObject('Escenario4/Campo_Address'), findTestData('AutomationPractice').getValue(5, 4))

WebUI.setText(findTestObject('Escenario4/Campo_Address_(Line2)'), findTestData('AutomationPractice').getValue(5, 5))

WebUI.setText(findTestObject('Escenario4/Campo_City'), findTestData('AutomationPractice').getValue(5, 6))

WebUI.selectOptionByLabel(findTestObject('Escenario4/Campo_State'), findTestData('AutomationPractice').getValue(5, 7), false)

WebUI.setText(findTestObject('Escenario4/Campo_Zip'), findTestData('AutomationPractice').getValue(5, 8))

WebUI.selectOptionByLabel(findTestObject('Escenario4/Campo_Country'), findTestData('AutomationPractice').getValue(5, 9), 
    false)

WebUI.setText(findTestObject('Escenario4/Campo_Home_phone'), findTestData('AutomationPractice').getValue(5, 10))

WebUI.setText(findTestObject('Escenario4/Campo_Mobile_phone'), findTestData('AutomationPractice').getValue(5, 11))

WebUI.setText(findTestObject('Escenario4/Campo_Additional_information'), findTestData('AutomationPractice').getValue(5, 
        12))

WebUI.setText(findTestObject('Escenario4/Campo_address_title'), findTestData('AutomationPractice').getValue(5, 13))

WebUI.click(findTestObject('Escenario4/Btn_Save'))

WebUI.verifyElementPresent(findTestObject('Escenario4/Confirmacion_address_creada'), 30)

WebUI.closeBrowser()

