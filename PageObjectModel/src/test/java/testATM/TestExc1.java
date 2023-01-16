package testATM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_Login.page_login_objects;
public class TestExc1 {
	
	 public static void main (String arggs[]) {
		 System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
		
		 WebDriver driver;
		 page_login_objects phome = new page_login_objects();
		 driver = new ChromeDriver();
		// WebDriverWait wait = new W;
		 driver.get("https://qa-cs-general.azurewebsites.net/User/Login");
		 
		 phome.IniciarDriver(driver);
		 phome.EscribeUser("SeguroMultipleTest");
		 phome.EscribeUser("Admin2012.");
		 
		 phome.clickLogin();
		 phome.FinalizarDriver(driver);
		 
	 }

}
