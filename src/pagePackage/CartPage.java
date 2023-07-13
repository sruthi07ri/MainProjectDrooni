package pagePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

	WebDriver driver;
	
	
	By quantityMin = By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[1]/form/div/table/tbody/tr[1]/td[5]/div/input[1]");
	By couponCode = By.id("coupon_code");
	By applyCoupon = By.name("apply_coupon");
	By checkoutButton = By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/a");
		
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void decQuantity() {
		
		driver.findElement(quantityMin).click();   // quantity deleted from cart page
		
	}

	public void couponApply(String coupon) {
		
		driver.findElement(couponCode).sendKeys(coupon);   //giving coupon code in area	
		driver.findElement(applyCoupon).click();   //Click apply coupon button
		
	}
	
	public void checkout() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
		driver.findElement(checkoutButton).click();   //Click on checkout button
		
	}

}
