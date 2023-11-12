package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEARCHways_example {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// ways to press enter in google search
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	//	driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");
	//    Thread.sleep(3000);
         
	    // 1- method
	    
	 //   driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil"+Keys.ENTER);
	    
	    // 2-method using \n
	    
	//    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil \n");  //---> \n
	    
	    // 3-method using submit() function
	 /* WebElement search=  driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
	  search.sendKeys("tamil");
	  search.submit();   */ 
		
	   // 4- using robot class
	  
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	  
	}

}
