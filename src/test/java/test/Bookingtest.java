package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Booking1;

public class Bookingtest {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()

	{
		driver=new ChromeDriver();

		driver.get("https://www.swiggy.com/");
	}
	
	@Test
	public void test1()
	{
		Booking1 ob= new Booking1(driver);
		ob.signin1();
		ob.setvalues("7907787332", "anjna", "anjnadas16@gmail.com");
		
		ob.continu(); 
		ob.login("7907787332");
		//ob.login2();
		driver.navigate().refresh();
		ob.locate1();
		ob.itemsearch();
		
	}
}


