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

WebUI.click(findTestObject('Escenario5/Btn_My_Personal_Information'))

WebUI.waitForElementPresent(findTestObject('Escenario5/Confirmacion_formulario_personal_info'), 30)

WebUI.setText(findTestObject('Escenario5/Campo_First_name'), findTestData('AutomationPractice').getValue(6, 5))

WebUI.setText(findTestObject('Escenario5/Campo_Last_name'), findTestData('AutomationPractice').getValue(6, 4))

WebUI.selectOptionByLabel(findTestObject('Escenario5/Campo_DoB_Day'), findTestData('AutomationPractice').getValue(6, 1), 
    false)

WebUI.selectOptionByLabel(findTestObject('Escenario5/Campo_DoB_Month'), findTestData('AutomationPractice').getValue(6, 2), 
    false)

WebUI.selectOptionByLabel(findTestObject('Escenario5/Campo_DoB_Year'), findTestData('AutomationPractice').getValue(6, 3), 
    false)

WebUI.setText(findTestObject('Escenario5/Campo_current_password'), findTestData('AutomationPractice').getValue(4, 4))

WebUI.click(findTestObject('Escenario5/Btn_Back_to_your_account'))

WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(4, 9), false)

WebUI.closeBrowser()

