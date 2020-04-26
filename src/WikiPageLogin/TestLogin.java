package WikiPageLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\SeleniumDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Login");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//*[@id='pt-login']/a"));
		login.click();
		
		WebElement UserName = driver.findElement(By.id("wpName1"));
		UserName.sendKeys("vgnsh814@gmail.com");
		
		WebElement passWord = driver.findElement(By.id("wpPassword1"));
		passWord.sendKeys("Vignesh@123");
		
		WebElement Submit = driver.findElement(By.xpath("//*[@id='wpLoginAttempt']"));
		Submit.click();
	}

}
