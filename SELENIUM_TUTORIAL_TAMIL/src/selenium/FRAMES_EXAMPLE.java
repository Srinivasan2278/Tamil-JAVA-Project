package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRAMES_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1- click the frame
		 driver.switchTo().frame(0); // if there is no name or id for a frame then we can consider the starting frame with index no <frame(0)>.
		 WebElement button1 = driver.findElement(By.id("Click"));
		 button1.click();
		 String name1= button1.getText();
		 System.out.println(name1);
		 
		 // nested frames
		 driver.switchTo().defaultContent(); // move from an frame to mainpage then we can proceed with other frames.
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'page.xhtml')]"))); 
	//	 driver.switchTo().frame(1);
		 
		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'framebutton.xhtml')]")));
		 driver.switchTo().frame("frame2");
		 WebElement button2 = driver.findElement(By.id("Click")); 
		 button2.click(); 
		 String name2 = button2.getText();
		 System.out.println(name2);
		 
		 // count frames
		 
		 driver.switchTo().defaultContent();
		 List<WebElement> framescount= driver.findElements(By.tagName("iframe"));
		 int count= framescount.size();
		 System.out.println(count);
	}

}
