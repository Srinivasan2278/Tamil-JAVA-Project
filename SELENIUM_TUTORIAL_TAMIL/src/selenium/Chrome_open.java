package selenium;
 import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_open {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
	//	driver.findElement(By.id("APjFqb")).sendKeys("agni"+Keys.ENTER);
		
		
		WebElement search =	driver.findElement(By.id("APjFqb"));
		search.sendKeys("agni");
		search.clear();
		search.sendKeys("tamil");
		search.sendKeys(Keys.ENTER);
		
		
		
	}

}
