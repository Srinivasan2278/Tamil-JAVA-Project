package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGetandNavigate {

	public static void main(String[] args) {
		// how to hit a link without get and navigate function
		
		
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location='https://www.google.co.in'","");

	}

}
