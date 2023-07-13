package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {


	WebDriver driver;
		
	By billingFname = By.id("billing_first_name");
	By billingLname = By.id("billing_last_name");
	By billingCountry = By.id("billing_country");
	By billingStreet = By.id("billing_address_1");
	By billingAprtmnt = By.id("billing_address_2");
	By billingCity = By.id("billing_city");
	By billingState = By.id("billing_state");
	By billingPin = By.id("billing_postcode");
	By billingPhone = By.id("billing_phone");
	By whtsappChk = By.id("custom_checkbox");
	By shipFname = By.id("shipping_first_name");
	By shipLname = By.id("shipping_last_name");
	By shipCountry = By.id("shipping_country");
	By shipStreet = By.id("shipping_address_1");
	By shipAprtmnt = By.id("shipping_address_2");
	By shipCity = By.id("shipping_city");
	By shipState = By.id("shipping_state");
	By shipPin = By.id("shipping_postcode");
	By shipNote = By.id("order_comments");
	By upiPay = By.id("payment_method_payuindia");
	By termsCheckbox = By.id("terms");
	By placeOrderbtn = By.id("place_order");
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void billingName(String fname, String lname) {
		
		WebElement namef = driver.findElement(billingFname);
		namef.clear();
		namef.sendKeys(fname);  // giving billing first name
		WebElement namel = driver.findElement(billingLname);
		namel.clear();
		namel.sendKeys(lname);  //giving billing last name
		
	}
	
	public void billingCountry() {
		
		WebElement country = driver.findElement(billingCountry);
		Select countrysel = new Select(country);
		countrysel.selectByValue("IN");   
		
	}
	
	public void billingAddress(String street, String aprtmnt,String city) {
		
		WebElement addr1 = driver.findElement(billingStreet);
		addr1.clear();
		addr1.sendKeys(street);  //street address
		WebElement addr2 = driver.findElement(billingAprtmnt);
		addr2.clear();
		addr2.sendKeys(aprtmnt);    // Apartment suite etc
		WebElement addr3 = driver.findElement(billingCity);
		addr3.clear();
		addr3.sendKeys(city);  // city
	}
	
	public void billingstate() {
		
		WebElement state = driver.findElement(billingState);   //state selection
		Select statesel = new Select(state);
		statesel.selectByValue("KA");   
	}
	
	public void pinPhone(String pin, String phone) {
		
		WebElement pincode = driver.findElement(billingPin);
		pincode.clear();
		pincode.sendKeys(pin);    //pin code
		WebElement phno = driver.findElement(billingPhone);
		phno.clear();
		phno.sendKeys(phone);  // phone number
		
	}
	
	public void whatsappUnchk() {
		
		WebElement whatsapp = driver.findElement(whtsappChk);  
		Boolean whatsappcheck = whatsapp.isSelected();        //whatsapp checked or not
		if(whatsappcheck) {
			whatsapp.click();                                 //if checked, uncheck it
		}
	}
	
	public void shippingName(String shipfname, String shiplname) {
		
		WebElement shipnamef = driver.findElement(shipFname);
		shipnamef.clear();
		shipnamef.sendKeys(shipfname);  // giving shipping first name
		WebElement shipnamel = driver.findElement(shipLname);
		shipnamel.clear();
		shipnamel.sendKeys(shiplname);  //giving shipping last name
	}
	
	public void shippingCountry() {
		
		WebElement shipcountry = driver.findElement(shipCountry);         // shipping country
		Select shipcountrysel = new Select(shipcountry);
		shipcountrysel.selectByValue("CA");
	}
	
	public void shippingAddress(String shipstreet, String shipaprtmnt, String shipcity) {
		
		WebElement shipaddr1 = driver.findElement(shipStreet);
		shipaddr1.clear();
		shipaddr1.sendKeys(shipstreet);  // shipping street address
		WebElement shipaddr2 = driver.findElement(shipAprtmnt);
		shipaddr2.clear();
		shipaddr2.sendKeys(shipaprtmnt);    //  shipping Apartment suite etc
		WebElement shipaddr3 = driver.findElement(shipCity);
		shipaddr3.clear();
		shipaddr3.sendKeys(shipcity);
	}
	
	public void shippingState() {
		
		WebElement province = driver.findElement(shipState);         // shipping province
		Select provincesel = new Select(province);
		provincesel.selectByValue("MB");
	}
	
	public void shippingPinNote(String zip,String note ) {
		
		WebElement shippin = driver.findElement(shipPin);
		shippin.clear();
		shippin.sendKeys(zip);
		WebElement shipnote = driver.findElement(shipNote);
		shipnote.clear();
		shipnote.sendKeys(note);
	}
	
	public void paymentOption() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement payment = driver.findElement(upiPay);  
		js.executeScript("arguments[0].click()", payment);     // select net banking option
	}
	
	public void termsSelection() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement termschk = driver.findElement(termsCheckbox);	
		if (!termschk.isSelected()) {
			
		js.executeScript("arguments[0].click()", termschk);      // check terms check box
		
		}
	}
	public void clickPlaceOrder() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement submit = driver.findElement(placeOrderbtn);		
		js.executeScript("arguments[0].click()", submit);       //click place order button	
		
	}
}
