package page_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_login_objects {
	
	WebDriver driver;
	
	By txt_User = By.xpath("//input[@id='UserName']");
	By txt_Pass = By.xpath("//input[contains(@id,'Password')]");
	By btn_Login = By.xpath("//button[contains(@type,'submit')]");
	
	public void IniciarDriver(WebDriver driver) {
		driver.close();
		
	}
	public void FinalizarDriver(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void EscribeUser(String user) {
		
		driver.findElement(txt_User).sendKeys(user);
	}
	
	public void EscribePass(String pass) {
		
		driver.findElement(txt_Pass).sendKeys(pass);
	}
	public void clickLogin() {
		
		driver.findElement(btn_Login).click();
	}
	
	
}
