package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CALENDER_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/calendar.xhtml");
		
		WebElement nextbutton = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		nextbutton.click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[6]"));
		day.click();
				//*[@id="j_idt87:schedule"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[6]
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div/div/div[2]/div[2]/div/div[1]/input"));
		title.sendKeys("HELLO");
		
		WebElement save = driver.findElement(By.xpath("//span[contains(text(),'Save')]"));
		save.click();
		
	}

}
