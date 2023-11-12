package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {

	public static void main(String[] args) {
	  
			WebDriver driver = new ChromeDriver();
		//	driver.get("https://the-internet.herokuapp.com/basic_auth");
			
			// Solved method
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			/*
			 Note- authentication popup in which you cannot inspect elements.
			       if you cannot inspect elements then how will you be able to send keys.
			       so in this case we will give the credentials along with get() function.
			 */
	}

}
