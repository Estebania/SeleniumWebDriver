package dockertest;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//s import atu.testrecorder.ATUTestRecorder;

public class validacion {

	public static void main(String[] args) throws MalformedURLException {
        WebDriver driver;
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "110.0");
        chromeOptions.setCapability("platformName", "LINUX");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
        driver.get("http://www.google.com");
   
        driver.quit();
        

	}

}
