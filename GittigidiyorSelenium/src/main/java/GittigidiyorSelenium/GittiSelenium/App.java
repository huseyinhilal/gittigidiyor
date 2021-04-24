package GittigidiyorSelenium.GittiSelenium;


import java.util.concurrent.TimeUnit;
import java.util.function.DoublePredicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gitti.test.GittiTest;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	GittiTest gittiTest = new GittiTest();
    	gittiTest.run();
    	/*
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.gittigidiyor.com");


        Actions action = new Actions(driver);
       //giris yap üzerine gelip menünün açılması için mouse hover yap
        WebElement girisMenu = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[1]"));
        action.moveToElement(girisMenu).build().perform();
        
        //giriş yap butonuna bas
        action.moveToElement(girisMenu).moveToElement(driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div[2]/div/div/div/a"))).click().build().perform();
        
        //login sayfası ve giriş
        driver.findElement(By.xpath("//*[@id=\"L-UserNameField\"]")).sendKeys("kullanıcı");
        driver.findElement(By.xpath("//*[@id=\"L-PasswordField\"]")).sendKeys("sifre");
        driver.findElement(By.xpath("//*[@id=\"gg-login-enter\"]")).click();
        
        //arama 

        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("bilgisayar");
        driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button")).click();
        
        //2.sayfaya geçme
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,25000)");
        //WebElement ikinciSayfa = driver.findElement(By.xpath("//*[@id=\\\"best-match-right\\\"]/div[5]/ul/li[2]/a"));
        //action.moveToElement(ikinciSayfa).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a")).click();
        
        //ürün seçme
       // WebElement urunSec = driver.findElement(By.xpath("//*[@id=\"item-info-block-680235132\"]/div/div[1]"));
       // action.moveToElement(urunSec).build().perform();
        
        
        driver.findElement(By.xpath("//*[@product-index=\"1\"]")).click();
      
        //sepete ekle
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)");
        WebElement sepeteEklemeButonu = driver.findElement(By.xpath("//*[@id=\"purchaseSoldInfoActionButtons\"]"));
        action.moveToElement(sepeteEklemeButonu).build().perform();
      
      //ürün fiyatı al
        String fiyat = driver.findElement(By.xpath("//*[@id=\"sp-price-highPrice\"]")).getText();
        //Double fiyatDouble = Double.parseDouble(fiyat);
        System.out.println( "fiyat== "+ fiyat );
        
        driver.findElement(By.xpath("//*[@id=\"sp-addbasket-button\"]/form")).click();
        
        Thread.sleep(1000);
        //sepete git
        driver.findElement(By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]/div/a")).click();
      //*[@id="header_wrapper"]/div[4]/div[3]/a/div[2]/span
        //sepetteki ürün fiyatı al
        String fiyatSepet = driver.findElement(By.xpath("//*[@id=\"submit-cart\"]/div/div[2]/div[3]/div/div[1]/div/div[5]/div[1]/div/ul/li[1]/div[2]")).getText();
        //Double fiyatSepetDouble = Double.parseDouble(fiyatSepet);

        System.out.println( "fiyatSepet== "+ fiyatSepet );
        //driver.findElement(By.xpath("//*[@id=\"cart-item-470532976\"]/div[1]/div[4]/div/div[2]/select")).click();
    	Thread.sleep(1000);
    	
    	//dropdowndan 2 ye tıkla
    	//driver.findElement(By.xpath("//*[@data-value=\"2\"]")).click();
    	//driver.findElement(By.xpath("//*[@id=\"cart-item-470558577\"]/div[1]/div[4]/div/div[2]/select/option[2]")).click();
        
    	//ürünü sil
    	driver.findElement(By.xpath("//*[@title=\"Sil\"]")).click();
        
      */
      
    }
}
