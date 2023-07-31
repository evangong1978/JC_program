import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://dch-ecomplatform.com/home#/home")
selenium.click("xpath=//div[@id='app']/div/section/aside/div/ul/li[4]/div")
selenium.click("xpath=//ul[@id='productManage$Menu']/li[7]/span")
selenium.open("https://dch-ecomplatform.com/home#/product-inventory-monitoring")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='JCFA'])[1]/following::span[3]")
selenium.click("xpath=//button[@type='submit']")
selenium.click("xpath=//div[@id='app']/div/section/section/main/div[2]/div/div[2]/div/div[2]/button")
Thread.sleep(2000);
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='÷	éüú„pn'])[1]/following::span[1]")
Thread.sleep(2000);
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Ö ˆ'])[1]/following::button[1]")
Thread.sleep(2000);
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='üúÍ\ò÷( å×¡-üú‡ö¡-å'])[1]/following::button[1]")
selenium.click("xpath=//div[@id='app']/div/section/aside/div/ul/li[17]/div")
selenium.click("xpath=//ul[@id='reportsManage$Menu']/li/span")
selenium.open("https://dch-ecomplatform.com/home#/report/order-shipping")
selenium.click("xpath=//div[@id='app']/div/section/section/main/div[2]/div/div/div/div/form/div/div/div/div/div[2]/div/span/span/span")
selenium.click("css=i.anticon.anticon-caret-down.ant-select-switcher-icon > svg > path")
selenium.click("xpath=//div[@id='rc-tree-select-list_1']/ul/li/ul/li[3]/span[2]/span")
selenium.click("css=div.ant-select-selection.ant-select-selection--single > span.ant-select-selection__clear > i.anticon.anticon-close-circle.ant-select-clear-icon > svg > path")
selenium.click("css=div.ant-select-selection.ant-select-selection--single > span.ant-select-selection__clear > i.anticon.anticon-close-circle.ant-select-clear-icon > svg > path")
selenium.click("xpath=//button[@type='submit']")
selenium.click("xpath=//button[@type='button']")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='üúÍ\ò÷( å×¡-üú‡ö¡-å'])[1]/following::button[1]")
selenium.click("xpath=//ul[@id='reportsManage$Menu']/li[3]/span")
selenium.open("https://dch-ecomplatform.com/home#/report/order-detail")
selenium.click("xpath=//div[@id='app']/div/section/section/main/div[2]/div/div/div/div/form/div/div/div/div/div[2]/div/span/span/span")
selenium.click("css=i.anticon.anticon-caret-down.ant-select-switcher-icon > svg > path")
selenium.click("xpath=//div[@id='rc-tree-select-list_2']/ul/li/ul/li[3]/span[2]/span")
selenium.click("xpath=//button[@type='submit']")
selenium.click("xpath=//button[@type='button']")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='üúÍ\ò÷( å×¡-üú‡ö¡-å'])[1]/following::button[1]")
