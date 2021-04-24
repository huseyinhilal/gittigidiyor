package com.gitti.test;

import org.junit.Test;

import com.gitti.tool.AutomationTool;

import demo.gitti.site.GittiSite;

public class GittiTest {

	@Test
	public void run() throws InterruptedException {
		AutomationTool tool = new AutomationTool();
		GittiSite site = new GittiSite(tool);
		
		//siteyi aç
		tool.GoToPage(site.urlSite);
		//giriş üzerine gel ve giriş yap tıkla
		tool.hoverAndClickOnElementByXpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[1]", "//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a");
		
		//login sayfası ve giriş
		tool.sendKeysOnElementByXpath("//*[@id=\"L-UserNameField\"]", site.getUserName());
		tool.sendKeysOnElementByXpath("//*[@id=\"L-PasswordField\"]", site.getPassword());
		tool.clickOnElementByXpath("//*[@id=\"gg-login-enter\"]");
		
		//arama 
		tool.sendKeysOnElementByXpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input", "bilgisayar");
        tool.clickOnElementByXpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");
        
      //2.sayfaya geçme
        Thread.sleep(3000);

        //tool.scrollDownByValue(0, 30000); //sayfada en aşağı in
        tool.scrollDown();
        Thread.sleep(3000);
        tool.clickOnElementByXpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");

      //ürün seçme
        tool.clickOnElementByXpath("//*[@product-index=\"1\"]");
        
        //sepete ekle
        tool.scrollDownByValue(0, 600); //sayfada biraz aşağı in
        tool.hoverOnElementByXpath("//*[@id=\"purchaseSoldInfoActionButtons\"]");
        
        tool.clickOnElementByXpath("//*[@id=\"sp-addbasket-button\"]/form");
        
        //sepete git
        tool.clickOnElementByXpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/a");
        
      //ürünü sil
        tool.clickOnElementByXpath("//*[@title=\"Sil\"]");
        
	}
}
