package testPackage;


import org.testng.annotations.Test;

import pagePackage.AccountsPage;
import pagePackage.CartPage;
import pagePackage.CheckoutPage;
import pagePackage.HomePage;
import pagePackage.ProductListPage;
import pagePackage.ProductSpecificationPage;
import pagePackage.RegistrationPage;



public class DrooniTest extends DrooniBaseClassTest {


	
	@Test (priority = 0)
	public void clickRegister() throws Exception {
		
		HomePage home = new HomePage(driver);
		home.clickRegister();
		
	}
	
	@Test (priority = 1)
	public void registration() throws Exception {
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.userRegister("testuser123@yopmail.com", "Testing#123456");  //use new user name each time
	}
	
	@Test (priority = 2)
	public void clickMenuItem() throws Exception {
		
		AccountsPage ap = new AccountsPage(driver);
		ap.clickItem();
	}
	
	
	@Test (priority = 3)
	public void productSelection() throws Exception {
		
		ProductListPage plp = new ProductListPage(driver);
		plp.selectItem();
	}
	
	@Test (priority = 4)
	public void addToCart() throws Exception {
		
		ProductSpecificationPage psp = new ProductSpecificationPage(driver);
		psp.zoom();
		psp.specifications();
	}
	
	@Test (priority = 5)
	public void proceedToCheckout() throws Exception {
		
		CartPage cp = new CartPage(driver);
	//	cp.decQuantity();
		cp.couponApply("couponnew");
		cp.checkout();
	}
	
	@Test (priority = 6)
	public void placeOrder()  throws Exception {
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.billingName("user1", "test");
		cop.billingCountry();
		cop.billingAddress("Test street", "Test appartment", "Test city");
		cop.billingstate();
		cop.pinPhone("670987", "9876543210");
		cop.whatsappUnchk();
		cop.shippingName("ship user", "test");
		cop.shippingCountry();
		cop.shippingAddress("ship street", "ship appartment", "ship city");
		cop.shippingState();
		cop.shippingPinNote("R2M 0T7", "Test order.... Do not dispatch");
		cop.paymentOption();
		cop.termsSelection();
		cop.clickPlaceOrder();
	}
	
	
}
