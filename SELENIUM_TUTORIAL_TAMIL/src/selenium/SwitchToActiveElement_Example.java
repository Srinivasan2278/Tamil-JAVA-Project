package selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement_Example {
	
	   static WebElement q;   // ---> should be give outside the main function.

	public static void main(String[] args) {
		
		// how to send keys to an active element without finding the webelements.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//1- using active element
	//	driver.switchTo().activeElement().sendKeys("tamil"+Keys.ENTER);
		
		//2-using pagefactory
       
		PageFactory.initElements( driver,SwitchToActiveElement_Example.class);
        q.sendKeys("tamil");   // name="q" 
	}

}
