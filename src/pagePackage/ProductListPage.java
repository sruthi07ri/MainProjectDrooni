package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

	WebDriver driver;
	
	By casualWearLink = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[1]/button");         //casual wears down arrow 
	By legginsOption = By.xpath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[1]/ul/li[2]/a");  // leggings option 
	By selectedItem = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[3]/div[2]/div/div[2]/div[1]/div[1]/a");  //item to be selected for order
	
	
	
	public ProductListPage(WebDriver driver) {
		
		this.driver = driver;
	}
	public void selectItem() {
		
		driver.findElement(casualWearLink).click(); //casual wears down arrow clicked
		driver.findElement(legginsOption).click();  // leggings option selected
		driver.findElement(selectedItem).click();  //item to be ordered is clicked
		
	}
}
