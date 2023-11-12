package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DYNAMICPOPUP_EXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      
	     try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		WebElement popup=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='button']")));
		if (popup==null) {
			System.out.println("no popup menu appeared");
		}
		else {
			popup.click();
		}
		
		} catch (Exception e) {
			// TODO: handle exception
			
		}  
	      
	   
	}

}
