package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintSuggestion_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    
	    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");
	    Thread.sleep(1000);
	    List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//child::li"));
	    
	    for (WebElement alpha : suggestions) {
	    	
			String print= alpha.getText();
			System.out.println(print);
		}

	}

}
