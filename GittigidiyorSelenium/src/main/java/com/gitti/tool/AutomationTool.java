package com.gitti.tool;

import java.text.MessageFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;


//tüm selenium webdriver gereçleri

public class AutomationTool {

	protected WebDriver driver;
	protected String browserName;
	protected WebElement element;
	
	
	public AutomationTool() {
		driver = null;
		browserName = null;
		element = null;
	}
	public Boolean OpenBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        //driver.manage().deleteAllCookies();
		}
		return true;
	}
	
	public Boolean GoToPage(String url) {
		driver.get(url);
		return true;
	}
	
	public void CloseBrowser() {
		driver.quit();
	}
	
	/*public WebDriver getDriver() {
		return driver;
	}*/
	
	
	
	public Boolean hoverOnElementByXpath(String xPath) {
		Actions action = new Actions(driver);
		WebElement hoverOn = driver.findElement(By.xpath(xPath));
	    action.moveToElement(hoverOn).build().perform();
		return true;
	}
	
	public Boolean hoverAndClickOnElementByXpath(String xPath,String secondXPath) {
		Actions action = new Actions(driver);
		WebElement hoverOn = driver.findElement(By.xpath(xPath));
	    action.moveToElement(hoverOn).build().perform();
	    try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    action.moveToElement(hoverOn).moveToElement(driver.findElement(By.xpath(secondXPath))).click().build().perform();
		return true;
	}

	public Boolean clickOnElementByXpath(String xPath) {
		//Actions action = new Actions(driver);
		driver.findElement(By.xpath(xPath)).click();
        return true;
	}

	public Boolean sendKeysOnElementByXpath(String xPath,String value) {
        driver.findElement(By.xpath(xPath)).sendKeys(value);
        return true;
	}
	
	public Boolean scrollDownByValue(int val1,int val2) {
		String temp = "window.scrollBy({0},{1})";
		String val = MessageFormat.format(temp, val1,val2);
		((JavascriptExecutor)driver).executeScript(val);
		return true;
	}
	public Boolean scrollDown() {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,25000)");
		return true;
	}
	
}
