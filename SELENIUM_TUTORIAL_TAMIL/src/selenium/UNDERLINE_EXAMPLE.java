package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UNDERLINE_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		  // how to verify an element is underlined or not??
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		
		 String beforehovering=  tamil.getCssValue("text-decoration");   //NOTE- < text-decoration > we will find this attribute in DOM-CSS SECTION for an element.
		 System.out.println("the element is underlined = "+ beforehovering);   
		 
		 Actions action = new Actions(driver);
		 action.moveToElement(tamil);
		 action.build().perform();
		 Thread.sleep(3000);
		 
		 String afterhovering = tamil.getCssValue("text-decoration");
		 System.out.println("the element is underlined = "+ afterhovering);
	}

}
