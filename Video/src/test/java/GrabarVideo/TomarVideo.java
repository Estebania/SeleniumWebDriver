package GrabarVideo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class TomarVideo {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		WebDriver driver;
		
		ATUTestRecorder grabarVideo;
		
        System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        
        grabarVideo =  new ATUTestRecorder("C:\\Users\\bjimenez\\eclipse-workspace\\Video\\Videos\\","Evidencia1",false);
        
        grabarVideo.start();
        
        driver.get("https://www.youtube.com/");
        
        
        String video = "(//yt-formatted-string[contains(@id,'video-title')])[1]";
        
        driver.findElement(By.xpath(video)).click();
        
        
        Thread.sleep(5000);
       
        grabarVideo.stop();
        
        driver.close();
        
        		

	}

}
