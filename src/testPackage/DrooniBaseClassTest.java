package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DrooniBaseClassTest {
	
	
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.drooni.com/");
	}

	@AfterClass
	public void tearDown()
	{
		//driver.close();
	}
}
