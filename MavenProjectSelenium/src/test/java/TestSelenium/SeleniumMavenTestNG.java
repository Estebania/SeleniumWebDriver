package TestSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMavenTestNG {
	
	@Test
	public void EjecutarTest() throws InterruptedException {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        driver.get("https://qa-cs-general.azurewebsites.net/");
        
        Thread.sleep(5000);
        
        driver.close();
		
	}

}
