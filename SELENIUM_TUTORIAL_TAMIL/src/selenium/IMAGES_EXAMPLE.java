package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMAGES_EXAMPLE {

	public static void main(String[] args) { // INTERVIEW
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		//FIND WHETHER THE IMAGE IS BROKEN IMAGE
		// thinks to remember-- naturalWidth= 0 then the image is broken
		// naturalWidth != 0 then the image is  not broken.   here naturalWidth is the attribute value.
		
		WebElement brokenimage1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
	
		if (brokenimage1.getAttribute("naturalWidth").equals("0")) {
			System.out.println("the image is broken");
		}
		else {
			System.out.println("the image is not broken");
		}
		
		// normal image check whether it is broken or not
		WebElement normalimage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		
		if (normalimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("the image is broken");
		}
		else {
			System.out.println("the image is not broken");
		}
	}

}
