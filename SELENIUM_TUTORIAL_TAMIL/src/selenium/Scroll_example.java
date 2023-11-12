package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_example {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Tamil_language");
		
		//1- scroll to some position
		
	/*	JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,900)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-900)", "");  */
		
		// 2-scroll to bottom pf the page
	/*	
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("window.scroll(0, document.body.scrollHeight)", "");
		Thread.sleep(3000);
		executor1.executeScript("window.scroll(0,0)", "");   */
		
		// 3- go to specific element position
		
	/*	WebElement link = driver.findElement(By.linkText("Tamil Sangams"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].scrollIntoView(true)", link ); 
		Thread.sleep(3000);
		executor2.executeScript("window.scroll(0,0)", "");   */
		  
		
		// 4- using robot class
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);  
	}

}
