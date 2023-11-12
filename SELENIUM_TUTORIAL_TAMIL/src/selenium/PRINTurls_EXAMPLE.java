package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PRINTurls_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	 /*   
	    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");
	    Thread.sleep(3000);
	    
	    // 1-print list of the urls from the suggestions
	    List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//child::li"));
	    
	   List<WebElement> urlLinks = driver.findElements(By.xpath("//a"));
	   for (WebElement alpha : urlLinks) {
		String print =alpha.getAttribute("href");
		System.out.println(print);
	}    */
	    
	    // this code will print the main urls from the page loaded
	    
	    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil"+Keys.ENTER);
	    Thread.sleep(3000);
	    
	    // fetch main links
	    List<WebElement> mainlinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
	    
	    for (WebElement beta : mainlinks) {
		 String print1 =beta.getText();
		 System.out.println(print1);
		}
	}

}
