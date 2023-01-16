package Fotografia;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TomarFoto {
	
	public static void TomarFoto(String nombre_paso, WebDriver driver) throws AWTException, IOException, InterruptedException {
		
		 
	        /*String formato_foto = ".png";
	        String path_foto = "C:\\Users\\bjimenez\\eclipse-workspace\\FotografiasSelenium\\target\\";
	        
	        String Archivo_foto = path_foto + nombre_paso + formato_foto;
	        
	        Robot robot = new Robot();
	        
	        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	        ImageIO.write(image, "png", new File(Archivo_foto));
	        
	        Thread.sleep(10000);*/
		
		 String path_foto = "C:\\Users\\bjimenez\\eclipse-workspace\\FotografiasSelenium\\target\\";
		 String formato_foto = ".png";
		File screenshot;
		
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot,new File(path_foto+nombre_paso+"333"+formato_foto));
		
		
	}

}
