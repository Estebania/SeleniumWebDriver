package androidtestdemo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class AppMovilTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void EjecutaMovilTest()  throws MalformedURLException, InterruptedException {
		
		WebDriver driver;
		 //System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
		 DesiredCapabilities cap = new DesiredCapabilities();
		 
		 cap.setCapability("deviceName", "Android Device");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("noReset", true);
		 cap.setCapability("app", "selendroid-test-app-0.16.0.apk");
		 cap.setCapability("appPackage", "io.selendroid.testapp");
		 cap.setCapability("noSign", true);
		 cap.setCapability("autoGrantPermissions", true);
	
		 
		
		 
		 
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 //WebDriverWait wait = new WebDriverWait(driver,30);
		 
		 Thread.sleep(30000);
		 
		 //driver.findElement(By.id("android:id/button1")).click();
		 
		 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"startUserRegistrationCD\"]")).click();
		 
		 
		 System.out.println("Registrar usuario");
		 Thread.sleep(30000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]")).sendKeys("Maria");
		 Thread.sleep(30000);
		 System.out.println("Nombre");
		 Thread.sleep(30000);
		 driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"email of the customer\"]")).sendKeys("maria@meil.com");
		 System.out.println("mail");
		 Thread.sleep(30000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[3]")).sendKeys("maria123");
		 Thread.sleep(30000);
		 System.out.println("pass");
		 Thread.sleep(30000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[4]")).clear();
		 Thread.sleep(30000);
		 System.out.println("cla");
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.CheckBox")).sendKeys("De la Fuente");
		 System.out.println("cla 3");
		 Thread.sleep(30000);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")).click();
		 Thread.sleep(30000);
		 System.out.println("cla 4");
		 
		 System.out.println("Registra USER");
		 //driver.findElement(By.id("")).click();
		 
		 driver.quit(); 
		 
		 
		
		
	}

}
