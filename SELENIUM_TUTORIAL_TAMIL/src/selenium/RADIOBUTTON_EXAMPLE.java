package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADIOBUTTON_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node091drupmi9gw11etxl3cf9ds6l554703.node0");
		
		// 1
		
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]"));
		radiobutton1.click();
		
		
		// 2- is selected radio button
		WebElement chrome = driver.findElement(By.id("j_idt87:console2:0"));
		boolean status1 = chrome.isSelected();
		System.out.println(status1);
		
		WebElement firefox = driver.findElement(By.id("j_idt87:console2:1"));
		boolean status2 = firefox.isSelected();
		System.out.println(status2);
		
		WebElement safari = driver.findElement(By.id("j_idt87:console2:2"));
		boolean status3 =safari.isSelected();
		System.out.println(status3);
		
		WebElement edge = driver.findElement(By.id("j_idt87:console2:3"));
		boolean status4= edge.isSelected();
		System.out.println(status4);
	}

}
