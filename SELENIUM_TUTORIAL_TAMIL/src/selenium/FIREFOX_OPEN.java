package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIREFOX_OPEN {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\firefox driver latest\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");

	}

}
