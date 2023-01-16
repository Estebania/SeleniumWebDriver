package Fotografia;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Rectangle;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
//import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomarFotoPrueba {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        
        driver.get("https://www.youtube.com/");
        
        ;
        
        String nombre_paso = "Abre la pagina";
        
        TomarFoto.TomarFoto(nombre_paso, driver);
        
        String video = "(//yt-formatted-string[contains(@id,'video-title')])[1]";
        
        driver.findElement(By.xpath(video)).click();
        
        nombre_paso = "Se Abre el video";
        Thread.sleep(5000);
        TomarFoto.TomarFoto(nombre_paso, driver);
        
        driver.close();
        
        		


	}

}
