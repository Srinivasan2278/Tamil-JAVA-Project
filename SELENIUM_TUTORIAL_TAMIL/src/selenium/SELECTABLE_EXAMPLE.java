package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SELECTABLE_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/list.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));  // since we need to work on list of elements
		int size= selectable.size();
		System.out.println(size);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(2)).build().perform();
		
		// OR//
	/*	Actions actions = new Actions(driver);
		actions.clickAndHold(selectable.get(4));
		actions.build().perform();
		*/

	}

}
