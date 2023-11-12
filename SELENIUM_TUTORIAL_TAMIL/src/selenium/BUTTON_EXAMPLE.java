package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BUTTON_EXAMPLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01kaf558mrl7qc1r51f4c8ivm7p550712.node0");
		
		// 1- confirm button is diasbled
		WebElement disabledbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enabled = disabledbutton.isEnabled();
		System.out.println(enabled);
		
		String value= 	disabledbutton.getAttribute("disabled");
		System.out.println(value);
		
		//2-find the position of the button
		
		WebElement positionbutton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyPoint = positionbutton.getLocation();
		int Xvalue= xyPoint.getX();
		int Yvalue = xyPoint.getY();
		System.out.println("X value is "+ Xvalue +" Y value is "+ Yvalue);
		
		// 3- find the color of the button
		
		WebElement colorbutton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color =  colorbutton.getCssValue("background");
		System.out.println("color of the button is  " +color);
		
		//4- height and width of the button
		
		WebElement buttonsize = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = buttonsize.getSize().getHeight();
		int width = buttonsize.getSize().getWidth();
		
		System.out.println("the button height is  "+ height +" the button width is "+ width);
		
		
		// 5 - click the confirmbutton
		
		/*	WebElement confirmbutton = driver.findElement(By.id("j_idt88:j_idt90"));
			confirmbutton.click();   */

	}

}
