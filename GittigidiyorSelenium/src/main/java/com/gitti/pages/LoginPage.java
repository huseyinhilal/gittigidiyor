package com.gitti.pages;

import com.gitti.tool.AutomationTool;

public class LoginPage extends Page{

	
	//String urlPage;
	
	public LoginPage(String url,AutomationTool tool) {
		urlPage = url;
		this.tool = tool;
		
	}
	public Boolean Login(String username, String password) {
		Boolean result = true;
		//tool.GoToPage(urlPage);
		return result;
	}
}
