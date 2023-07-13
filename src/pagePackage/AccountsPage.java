package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountsPage {
	
	WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By menu = By.id("menu-item-8776");
	By menuItem = By.id("menu-item-8788");

	public void clickItem() {
		
		Actions act = new Actions(driver);
		WebElement kurtie = driver.findElement(menu);
		act.moveToElement(kurtie).perform();  //move to kurtis tab
		driver.findElement(menuItem).click();  //click on cotton kurtis from kurtis tab
		
	}

}
