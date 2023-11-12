package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingSendKeys {

	public static void main(String[] args) throws AWTException {
		// How to send key inputs without Send keys method ?
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	//	WebElement searchbox = driver.findElement(By.name("q"));
		
		// using send keys
	//	searchbox.sendKeys("tamil");
		
		//1- using JavaScript Executor
	/*	
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	//	executor.executeScript("document.getElementsByName('q')[0].value='tamil'", ""); // this step does not need to find web elements
		
	//	executor.executeScript("arguments[0].value='tamil'", searchbox);  */
		
		//2- using robot class
		
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		
		
	}

}
