package selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.chrome.ChromeOptions;

public class MAXIMIZEmethods_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// 3- method chrome options
	/*	 ChromeOptions chromeOptions = new ChromeOptions(); 
	        chromeOptions.addArguments("--start-maximized");  */    // it should be given before setting driver
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    
	    
	    // 1-method
	      driver.manage().window().maximize();
	    
	    // 2- set size method
	    
	 /*   Dimension dimensions = new Dimension(1300, 700);
	    driver.manage().window().setSize(dimensions);   */

	}

}
