package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEXTBOX_EEXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		// 1
		WebElement namebox = driver.findElement(By.id("j_idt88:name"));
		namebox.sendKeys("SRINIVASAN");
		//2
		WebElement appendbox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendbox.sendKeys("TAMBARAM");
		
		//3
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);                               // ---> false
		
		String value = disabledbox.getAttribute("placeholder");
		System.out.println(value);                                 // ---> Disabled
		
		System.out.println(value.contains("Disabled"));           // ---> true.   the word disabled is in the attribute placeholder so it is <true>

		
		//4
		WebElement clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		
		//5
		WebElement retrievebox = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = retrievebox.getAttribute("value");
		System.out.println(text);
		
		
		WebElement tabkeybox = driver.findElement(By.id("j_idt88:j_idt99"));
		tabkeybox.sendKeys("2america12@gmail.com"+Keys.TAB);
		
		
		
		
	}

}
