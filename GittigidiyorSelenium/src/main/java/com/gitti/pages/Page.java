package com.gitti.pages;

import com.gitti.tool.AutomationTool;

public class Page {

	protected AutomationTool tool;
	protected String urlPage;
	protected String browserName;
	
	public Boolean OpenPage() {
		return true;
	}
	public Boolean ClosePage() {
		return true;
	}
}
