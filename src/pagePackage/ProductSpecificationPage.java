package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductSpecificationPage {

	WebDriver driver;
	
	By zoomArrow = By.xpath("//*[@class='image-tools absolute bottom left z-3']/a");
	By lensIcon = By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/button[2]");
	By zoomClose = By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/button[1]");
	By sizeSelected = By.id("pa_size");
	By quantity = By.xpath("//*[@id=\"product-2019\"]/div/div[1]/div/div[2]/form/div/div[2]/div/div/div[2]/input[3]");
	By addToCart = By.xpath("//*[@id=\"product-2019\"]/div/div[1]/div/div[2]/form/div/div[2]/div/div/button");
	
	
	public ProductSpecificationPage(WebDriver driver) {
		
		this.driver = driver;
	
	}

	public void zoom() {
		
		driver.findElement(zoomArrow).click();  //zoom in left bottom corner
		driver.findElement(lensIcon).click();   // zoom in button in popup
		driver.findElement(zoomClose).click(); //close zoom in popup
	}
	
	public void specifications() {
		
		WebElement size = driver.findElement(sizeSelected);   //select size xl
		Select s = new Select(size);
		s.selectByValue("xl");
		
//		driver.findElement(quantity).click(); // quantity added
		driver.findElement(addToCart).click(); // add to cart clicked
	}
}
