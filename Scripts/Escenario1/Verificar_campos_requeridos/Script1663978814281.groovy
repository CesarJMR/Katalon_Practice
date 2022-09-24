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

WebUI.click(findTestObject('Escenario1/btn_Contact_us'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('Escenario1/Header_Contact_us'), 5)

WebUI.click(findTestObject('Escenario1/btn_Send'))

WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(2, 1), false)

WebUI.setText(findTestObject('Escenario1/Email_address'), findTestData('AutomationPractice').getValue(3, 1))

WebUI.click(findTestObject('Escenario1/btn_Send'))

WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(2, 2), false)

WebUI.setText(findTestObject('Escenario1/txtbx_Message'), findTestData('AutomationPractice').getValue(2, 3))

WebUI.click(findTestObject('Escenario1/btn_Send'))

WebUI.verifyElementPresent(findTestObject('Escenario1/Alerta'), 30)

WebUI.selectOptionByLabel(findTestObject('Escenario1/Subject_Heading'), findTestData('AutomationPractice').getValue(2, 5), 
    false)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(2, 7), false)

WebUI.click(findTestObject('Escenario1/btn_Send'))

WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(2, 9), false)

WebUI.closeBrowser()

