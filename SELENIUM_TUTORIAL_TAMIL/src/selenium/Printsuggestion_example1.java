package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printsuggestion_example1 {

	public static void main(String[] args) throws InterruptedException {
		// 	PRINT a particular term from list of suggestions.
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    
	    driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("tamil");
	    Thread.sleep(1000);
	    List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//child::li"));
	
	    /*
	    // 1- click a the webelement from particular position
	    int position=0;
	    
	    for (WebElement alpha : suggestions) {
	    	
			String print= alpha.getText();
			System.out.println(print);
			
			position= position+1;
			
			if (position==3) {
				alpha.click();
				break;
			}
		} */
	    
	    // 2- click the webelment which contains a particular term.
	    
	    for (WebElement alpha2 : suggestions) {
			String print2= alpha2.getText();
			System.out.println(print2);
			if (print2.contains("news")) {
				alpha2.click();
				break;
			}
		}

	}

}
