package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMaven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
         
         driver = new ChromeDriver();

         Thread.sleep(5000);
         driver.manage().window().maximize();
         driver.get("https://qa-cs-general.azurewebsites.net/");
         
         Thread.sleep(5000);
         
         driver.close();
         
		
	}

}
