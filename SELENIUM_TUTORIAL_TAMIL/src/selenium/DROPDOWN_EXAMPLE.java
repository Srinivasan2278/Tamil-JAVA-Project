package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01k9nny8iipiwd7n8yw1xy4o7y552014.node0");
	
		//1- selecting checkbox using index
		
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select1 = new Select(checkbox1);
		select1.selectByIndex(1);
		Thread.sleep(3000);
		select1.selectByVisibleText("Puppeteer"); 
		
		// finding the number of elements in the checkbox.
		List<WebElement> elements = select1.getOptions();
		int size = elements.size();
		System.out.println(size);
		
		// NOTE - STILL NEED TO LEARN MORE ABOUT THE OPERATIONS OF DROPDOWN IN SELENIUM.
		// TO LEARN - HOW TO PRINT THE OPTIONS FROM AN DROPDOWN BOX.

	}

}
