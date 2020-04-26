package ObjectPageLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPage.Loginclass;

public class testcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Selenium\\SeleniumDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.manage().window().maximize();
		
		Loginclass lg = new Loginclass(driver);
		lg.mloginlink();
		lg.musername();
		lg.mpassword();
		lg.mloginbutton();

	}

}
