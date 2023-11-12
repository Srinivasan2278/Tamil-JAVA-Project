package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MOUSEHOVER_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		WebElement hover1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));  // submit button
		WebElement mousehover = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span")); // this element where color changes (sucess button)
		Actions builder = new Actions(driver); // ---> very important line to remember.
		Thread.sleep(5000);
		builder.moveToElement(mousehover).perform();
		Thread.sleep(5000);
		builder.moveToElement(hover1).perform();
		Thread.sleep(5000);
		builder.moveToElement(mousehover).perform();
		

	}

}
