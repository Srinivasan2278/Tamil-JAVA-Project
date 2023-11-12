package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CHECKBOX_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01e3raqxs39l58bojopi8tzaij555926.node0");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// 1-BASIC CHECKBOX
		WebElement basicbox = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/child::span"));
		basicbox.click();
		
		//2-notificationbox
		WebElement notificationbox = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt91\']/div[2]"));
		notificationbox.click();
	//	Thread.sleep(4000);
		WebElement text = driver.findElement(By.xpath("//*[@id=\'j_idt87:msg_container\']/div/div/div[2]/span"));
		String a = text.getText();
		System.out.println(a);
		
		// 3-LANGUAGE BOX
		
		WebElement language = driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
		language.click();
		
		// 4- triStatebox
		WebElement triStatebox = driver.findElement(By.xpath("//*[@id=\'j_idt87:ajaxTriState\']/div[2]"));
		triStatebox.click();
		triStatebox.click();
	//	triStatebox.click();
	//	triStatebox.click();
		
		// 5- is disabled
		
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt102\']/span"));
		boolean status= disabledbox.isEnabled();
		System.out.println(status);
		
		// 6 - multiselect
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
		multiSelect.click();
		
		driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/div/div[2]")).click();
		
		//7- deselect a checkbox is already selected
		
		/* question- suppose you have two checkbox . one of which is already selected .
		           now what you have to do is check which check box is selected and deselect it.
		           
		             program-
		             WebElement checkbox1 = driver.findElement(By.(""));
		           		
		           	if(checkbox1.isSelected()) 
		           	{
		           		checkbox1.click();
		           	}
		           	
		            WebElement checkbox2 = driver.findElement(By.(""));
	           		
		           	if(checkbox2.isSelected())                                    if checkbox2 is already selected . now it will get deselected
		           	{
		           		checkbox2.click();
		           	}  
		           	
		           	*/
		 
		           	
		
	}

}
