package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWHANDLES_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node013fgqwhhgajq1sazq622vukxi558342.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// 1- click and open new window and switch to it.
		
		String parentwindow = driver.getWindowHandle();  // stores all function of the main window /parent window
		
		WebElement clickwindow = driver.findElement(By.id("j_idt88:new"));
		clickwindow.click();
		
		Set<String> childwindow = driver.getWindowHandles(); // stores all functions of the parent window and child window.
		
		for (String newwindow : childwindow) {
		
			driver.switchTo().window(newwindow);  // important function to remember
		}
		WebElement dailyquiz = driver.findElement(By.xpath("//*[@id=\'j_idt107\']/div[2]"));
		dailyquiz.click();
	//	Thread.sleep(4000);
		driver.close();
		
		
		// 2- find the number of opened tabs
		
		driver.switchTo().window(parentwindow);
		
		WebElement multiplewindow = driver.findElement(By.id("j_idt88:j_idt91"));
		multiplewindow.click();
		
		int windownumber = driver.getWindowHandles().size();
		System.out.println("the number of windows opened is  "+ windownumber);
		
		
		// 3-  close all window except parent window
		 
		WebElement dontclosewindow =driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		dontclosewindow.click();
		Set<String> childwindow1 = driver.getWindowHandles();
		for (String newwindow1 : childwindow1) {
			Thread.sleep(4000);
			if (!newwindow1.equals(parentwindow)) {
				driver.switchTo().window(newwindow1);
				
				driver.close();
			}
		}
		}
	}
			
			
			
			
			
			
			
			
			
			
		
		
		
		

	


