package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	
	By registerLink = By.id("menu-item-2243");
	
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
	}


	public void clickRegister() {

		try {
			
			driver.findElement(registerLink).click();
			
		} catch (Exception e) {
			
			System.out.println("Exception caught "+ e.getMessage());
		}
		
	}
}
