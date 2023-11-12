package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWSHANDLING_EXAMPLE2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		String parentwindow= driver.getWindowHandle();
		 
		WebElement browserwindow = driver.findElement(By.name("newbrowserwindow123"));
		browserwindow.click();
		
		Set<String> childwindow1 = driver.getWindowHandles();
	
		
		for (String newwindow1 : childwindow1) {
			driver.switchTo().window(newwindow1);	
		}  
		
		
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/div[1]/button"));
		button.click();
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		WebElement messagewindow = driver.findElement(By.name("123newmessagewindow321"));
		messagewindow.click();
		
		Set<String> childwindow2= driver.getWindowHandles();
		for (String newwindow2 : childwindow2) {
			driver.switchTo().window(newwindow2);	
		}
	//	driver.close();
		
		driver.switchTo().window(parentwindow);
		WebElement browsertab = driver.findElement(By.name("145newbrowsertab234"));
		browsertab.click();
		
		Set<String>childwindow3 = driver.getWindowHandles();
		for (String newwindow3 : childwindow3) {
			driver.switchTo().window(newwindow3);
		}
		WebElement python = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[5]/a"));
		python.click();
		
		for (String newwindow3 : childwindow3) {
			if (!driver.equals(parentwindow)) {
				driver.switchTo().window(newwindow3);
				driver.close();
			}
		}

	}

}
