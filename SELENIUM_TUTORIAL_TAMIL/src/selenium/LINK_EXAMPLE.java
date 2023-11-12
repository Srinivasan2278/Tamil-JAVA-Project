package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
	//	driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();

	}

}
 // NOTE-> most links are given in <a-tag> or anchor tag.