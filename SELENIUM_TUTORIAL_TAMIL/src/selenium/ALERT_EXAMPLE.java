package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node089ii7ka40zqzp68g0hxs2eer554502.node0");

		// 1- simple alert (NOTE- in alert . we cannot inspect an alert box)
		WebElement simpleAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		 simpleAlert.click();
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 
		
		 
		 // 2- confirm alert (NOTE-  common type of exception in alerts are unhandled alert exception, no alert present exception)
		 
		 WebElement confirmAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		 confirmAlert.click();
		 Thread.sleep(5000);
		 
		 Alert alert2 = driver.switchTo().alert();
		 alert2.dismiss();
		 
		 // 3- prompt alert
		  
		 WebElement promptAlert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		 promptAlert.click();
		 Thread.sleep(5000);
		 Alert alert3 = driver.switchTo().alert();
		String text = alert3.getText();
		System.out.println(text);
		 alert3.sendKeys("SRINIVASAN");
		 alert3.accept();
		 WebElement name = driver.findElement(By.xpath("//*[@id=\"confirm_result\"]"));
		  String result = name.getText();
		  System.out.println(result);
		 
	
		// 4- sweet alert (NOTE- sweet alert is not an alert but an web element)
		 WebElement sweetAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
		 sweetAlert.click();
		 Thread.sleep(5000);
		  WebElement sweet = driver.findElement(By.id("j_idt88:j_idt98"));
		  sweet.click();
		     // OR you use the method below
		//  driver.findElement(By.id("j_idt88:j_idt98")).click();
		  
		  
		  // 5- sweet alert confirmation
		  
		  WebElement sweetAlert2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]"));
		  sweetAlert2.click();
		  Thread.sleep(5000);
		  WebElement yes = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt108\"]/span[2]"));
		  yes.click();
		  
		  // 6- max/min alert

		  	WebElement sweetAlert3 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]"));
		  	sweetAlert3.click();
		  	Thread.sleep(5000);
		  	 WebElement minimize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[3]"));
		  	 minimize.click();
		  	 
		  	Thread.sleep(5000);
		  	 driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]/span")).click();
	}

}
