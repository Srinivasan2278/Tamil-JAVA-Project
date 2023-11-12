package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOOLTIP_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
		
	
		WebElement name = driver.findElement(By.id("firstname"));
		
		 String print = name.getAttribute("title");
		 System.out.println(print);
	}

}
