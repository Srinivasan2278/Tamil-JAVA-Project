package selenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FLUENTWAIT_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.leafground.com/waits.xhtml");
	      
	      /* //button[@id='j_idt87:j_idt89']*/
	 
	      /*   
	      WebElement click = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']"));
	      click.click();
	      Thread.sleep(10000);
	      WebElement text = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']"));
	     String print= text.getText();
	     System.out.println(print);  */
	     /*
	      the above coding works only works when (thread.sleep) is used . otherwise 
	      we will get exception like no such element exception. etc.	      */ 
	      
	      WebElement click = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']"));
	      click.click();
	      
	      
	          Wait <WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
	    		  .pollingEvery(Duration.ofSeconds(5))
	    		  .ignoring(NoSuchElementException.class);   // note- in this function. we should use NoSuchElementException.class of selenium not java.(refer-import org.openqa.selenium.NoSuchElementException;)
	          
	       WebElement text = wait.until( new Function<WebDriver, WebElement>(){

			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']"));
			}
	    	   
	       });
	       
	       String print= text.getText();
		     System.out.println(print); 
	     
	}

}
