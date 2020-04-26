package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginclass {
	
	WebDriver driver;
	
	By LoginLink = By.xpath("//*[@id='pt-login']/a");
	By userName = By.id("wpName1");
	By passWord = By.id("wpPassword1");
	By submit = By.id("wpLoginAttempt");
	
	
	public Loginclass(WebDriver driver)
	{
	 this.driver = driver;
	}
	
	public void mloginlink()
	{
		driver.findElement(LoginLink).click();
	}
	
	public void musername()
	{
		driver.findElement(userName).sendKeys("DivyaKothandan");;
	}

	
	public void mpassword()
	{
		driver.findElement(passWord).sendKeys("SeleniumTesting");
	}

	
	public void mloginbutton()
	{
		driver.findElement(submit).click();
	}


}


