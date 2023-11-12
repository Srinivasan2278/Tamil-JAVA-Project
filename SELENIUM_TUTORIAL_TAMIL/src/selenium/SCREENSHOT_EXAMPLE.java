package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT_EXAMPLE {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.leafground.com/alert.xhtml");
	  // FIRSTMETHOD  
	 /*   WebElement alert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
	    alert.click(); */
	 /*   Alert alert1 = driver.switchTo().alert();
	   String print= alert1.getText();
	   System.out.println(print);
	   alert1.dismiss();
	   // remove the alert comment for the first method to work. without removing you wil get unhandled alert exception.
	   */
	   
	   // 1-screenshot
	   /*
	   TakesScreenshot screenshot = (TakesScreenshot)driver;
	   File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
	   File destinationfile = new File("D://alert.png");
	   FileHandler.copy(sourcefile,destinationfile);
	    
	    
	    // this method of screenshot will not take full screenshot(like Window+PrtSc). also it does'nt work efficiently in some cases like Alert handling.
	   */
	   // SECONDMETHOD
	   // 2- screenshot
	    
	    WebElement alert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
	    alert.click();
	    Thread.sleep(2000);
	   Robot robot = new Robot();
	   Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	   Rectangle rectangle = new Rectangle(screensize); 
	   BufferedImage source = robot.createScreenCapture(rectangle);
	   File destination = new File("D://alertSnap.png");
	   ImageIO.write(source, "png", destination);
	   
	}
   
}
