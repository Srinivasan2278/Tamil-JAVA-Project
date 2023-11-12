package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckbox {

	public static void main(String[] args) {
		// how to select all  checkboxes
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01q9au1c874f40248eu8hs24ah602295.node0");
		
		List<WebElement> allbox = driver.findElements(By.xpath("//form[@id='j_idt87']//div[starts-with(@class,'ui-chkbox-box')]"));
		
		for (WebElement alpha : allbox) {
			alpha.click();
		} 
		
	

	}

}
