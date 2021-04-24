package demo.gitti.site;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Site {
	
	public String browserName;
	public String userName;
	public String password;
	public String urlSite;
	public Properties prop;
	
	
	public Site() {
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\HILAL\\eclipse-workspace\\GittigidiyorSelenium\\src\\main\\java\\com\\gitti\\config\\config.properties");
			prop.load(fis);

			browserName = prop.getProperty("browser");
			userName = prop.getProperty("username");
			password = prop.getProperty("password");
			urlSite = prop.getProperty("url");
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public String getBrowserName() {
		return browserName;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public String getUrlSite() {
		return urlSite;
	}
	
	
	
}
