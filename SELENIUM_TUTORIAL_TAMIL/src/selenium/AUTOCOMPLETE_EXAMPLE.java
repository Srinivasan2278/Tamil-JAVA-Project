package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOCOMPLETE_EXAMPLE {  // INTERVIEW

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement textbox = driver.findElement(By.xpath(""));
		
		textbox.sendKeys("a");
		
		List<WebElement> list = driver.findElements(By.xpath("/li"));
		
		for (WebElement alpha : list) {
			
			if (alpha.getText().equals("the word from suggestion")) {
				alpha.click();
				System.out.println("the selected word is" + alpha.getText());
				break;
				}
		}
	}
}
