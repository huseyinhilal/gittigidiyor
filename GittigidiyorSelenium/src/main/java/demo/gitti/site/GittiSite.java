package demo.gitti.site;

import com.gitti.pages.HomePage;
import com.gitti.pages.LoginPage;
import com.gitti.tool.AutomationTool;

public class GittiSite extends Site{

	public LoginPage LoginPage;
	public HomePage HomePage;
	
	
	public GittiSite(AutomationTool tool) {
		HomePage = new HomePage(browserName , urlSite, tool);
		LoginPage = new LoginPage(urlSite,tool);
	}
	
	public Boolean Login() {
		return LoginPage.Login(getUserName(), getPassword());
	}
	
	public void CloseBrowser() {
		HomePage.ClosePage();
	}
}
