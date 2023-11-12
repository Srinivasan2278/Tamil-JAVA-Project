package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SORTABLE_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://jqueryui.com/sortable/");
	
		
		List<WebElement> sortable= driver.findElements(By.xpath("//*[@class='ui-sortable']/li"));
	     	
	    int print = sortable.size();
	    System.out.println(print);
	    
		WebElement fromelement = sortable.get(5);
		WebElement toelement = sortable.get(1);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(fromelement);
		action.moveToElement(toelement);
		action.release(toelement);
		action.build().perform();   
	    
	   
	    
	    
	    
	}

}
