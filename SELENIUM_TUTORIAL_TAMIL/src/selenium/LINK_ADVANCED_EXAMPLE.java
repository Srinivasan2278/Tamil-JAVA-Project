package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK_ADVANCED_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.leafground.com/link.xhtml;jsessionid=node018u6cyt9t4nym1p6apukaukd3x561627.node0");
		
		//1-  Take me to dashboard
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node018u6cyt9t4nym1p6apukaukd3x561627.node0");
		
		WebElement dashboard = driver.findElement(By.partialLinkText("Go to"));
		dashboard.click();
		driver.navigate().back();
		
		// 2- find the link without clicking
		
		WebElement findlink = driver.findElement(By.partialLinkText("Find the URL"));
		String find = findlink.getAttribute("href");  //--->
		System.out.println(find);
		
		// 3- Am i an broken link?
		
		WebElement brokenlink = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
		brokenlink.click();
		String brokentitle = driver.getTitle();
		
		if (brokentitle.contains("404")) {  //--->
			System.out.println("the current link is broken");
		}
		else {
			System.out.println("the current link is not broken");
		}
		 Thread.sleep(3000);
		driver.navigate().back();
		
		//4- duplicate link or recurring link
		
		// dashboard.click(); --> we can use this step to click the link which is already we found in webElement dashboard
		                   //--> but we will get State Element Reference Exception. so we have to again find the webElement to solve the problem.
		
		WebElement duplicate = driver.findElement(By.partialLinkText("Go to"));
		duplicate.click();
		driver.navigate().back();
		
		// 5- count links
		
		List<WebElement> countlinks = driver.findElements(By.tagName("a")); //--->
		int count= countlinks.size();
		System.out.println("number of link in this page is "+ count);
		
		// 6 - count link in the layout
		
		WebElement layoutlinks = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[3]/div/div/a"));
		layoutlinks.click();
		
		List<WebElement> layoutcount= driver.findElements(By.tagName("a"));
		int number = layoutcount.size();
		System.out.println("number of links in the layout is "+ number);
		driver.navigate().back();
	}

}
