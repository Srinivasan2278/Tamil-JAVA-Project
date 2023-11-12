package selenium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ALERT_WAIT {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.automationtesting.in/FileDownload.html");
	      
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 
	
		 
		// Using expected condtions
		try {
		 if (wait.until(ExpectedConditions.alertIsPresent())==null) {
			System.out.println("alert is not present");
		}
		 else {
			 Alert alert1 = driver.switchTo().alert();
			 alert1.dismiss();
			      // OR
		//	driver.switchTo().alert().dismiss();
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}   
		 
		
		   // OR
		
		 // try and catch method
	/*	 
		 try {
			
			Alert alert2 = driver.switchTo().alert();
			alert2.dismiss();
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
	}
   
}
