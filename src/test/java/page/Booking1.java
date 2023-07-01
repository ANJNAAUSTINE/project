package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking1 {
	
	
	
	
WebDriver driver;
	
	By signin=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[2]");

	By phno=By.xpath("//*[@id=\"mobile\"]");
	By name=By.xpath("//*[@id=\"name\"]");
	By email=By.xpath("//*[@id=\"email\"]");
	
	By cont=By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a");
	
	By login=By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div/div[3]/a");
	By loginmob=By.xpath("//*[@id=\"mobile\"]");
	By loginbtn=By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a");
	//By logotp=By.xpath("//*[@id=\"otp\"]");
	//By logotpbtn=By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a");
	
	
	By locate=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[2]/div/button/span[2]");
	By locateelmnt=By.xpath("//*[@href=\"/search\"]");
	By itemon=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div[3]/div/div/div[1]/div/div/div[1]/button/img");
	public Booking1(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public void signin1()
	{
		driver.findElement(signin).click();
	}
	public void setvalues(String phno1,String name1,String email1)
	{
		driver.findElement(phno).sendKeys(phno1);
		driver.findElement(name).sendKeys(name1);
		driver.findElement(email).sendKeys(email1);
	}
	public void continu() 
	{
		driver.findElement(cont).click();
	}
	
	public void login(String logmobile)
	{
		driver.findElement(login).click();
		driver.findElement(loginmob).sendKeys(logmobile);
		//driver.findElement(loginbtn).click();
	}
	/*public void login2()
	{
		driver.findElement(logotpbtn).click();


	}*/
	public void locate1()
	{
		driver.findElement(locate).click();
	}
	public void itemsearch()
	{
		driver.findElement(locateelmnt).click();
		driver.findElement(itemon).click();
	}

}
