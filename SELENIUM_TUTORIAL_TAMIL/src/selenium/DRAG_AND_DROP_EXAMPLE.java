package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAG_AND_DROP_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node06lsnjh76ykp7fcr88ldj9bo2559968.node0");
		
		// 1- DRAG AND DROP
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
	//	action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		    // or
		   
		action.dragAndDrop(from, to).build().perform();
	

	}

}
