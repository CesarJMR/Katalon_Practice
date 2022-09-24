import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Funciones {

	@Keyword
	def Entrar_a_web_app() {
		WebUI.openBrowser(findTestData('AutomationPractice').getValue(1, 1))

		WebUI.maximizeWindow()

		WebUI.waitForPageLoad(30)
	}

	@Keyword
	def Log_in() {
		WebUI.click(findTestObject('Btn_Sign_in'))

		WebUI.waitForElementPresent(findTestObject('Escenario3/Login_form'), 30)

		WebUI.setText(findTestObject('Escenario3/Email'), findTestData('AutomationPractice').getValue(3, 1))

		WebUI.setText(findTestObject('Escenario3/Password'), findTestData('AutomationPractice').getValue(4, 4))

		WebUI.click(findTestObject('Escenario3/Btn_Log_in'))

		WebUI.waitForPageLoad(30)

		WebUI.verifyTextPresent(findTestData('AutomationPractice').getValue(4, 9), false)
	}
}
