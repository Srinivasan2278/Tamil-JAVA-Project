package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class REFRESHmethods_example {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");

	    // 1- refresh
	    //   driver.navigate().refresh();
	    // 2-get current url method
	    	  Thread.sleep(2000);
	    //    driver.get(driver.getCurrentUrl());

	    // 3- JavascriptExecutor
	    //	JavascriptExecutor executor = (JavascriptExecutor) driver;
	    //executor.executeScript("location.reload()");  // (or)--->  history.go(0)

	    // 4- robot

	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_F5);
	    robot.keyRelease(KeyEvent.VK_F5);
	}

}
