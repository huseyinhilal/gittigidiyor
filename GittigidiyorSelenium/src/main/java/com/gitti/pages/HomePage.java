package com.gitti.pages;


import com.gitti.tool.AutomationTool;

public class HomePage extends Page{
	
	public HomePage() {
	}
	

	public HomePage(String browserName, String url, AutomationTool tool) {
		this.tool = tool;
		//Tool = new AutomationTool();
		tool.OpenBrowser(browserName);
	}
	
	@Override
	public Boolean OpenPage() {
		tool.GoToPage(urlPage);
		return true;
	}
	public Boolean ClosePage() {
		tool.CloseBrowser();
		return true;
	}
	

	public Boolean GoToLogin() {
		
		return true;
	}
}
