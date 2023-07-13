package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistrationPage {

	WebDriver driver;
	
	
	By userName = By.id("reg_email");
	By password = By.id("reg_password");
	By login = By.name("register");

	
//	giving login instead registration
//	By userName = By.id("username");
//	By password = By.id("password");
//	By login = By.name("login");
	
	
	public RegistrationPage(WebDriver driver) {
		
		this.driver = driver;
	}


	public void userRegister(String user, String pass) {
	
		
		driver.findElement(userName).sendKeys(user);	
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
	}
}
