package selenium;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FILEDOWNLOAD_EXAMPLE {

	public static void main(String[] args) throws InterruptedException {
	  
		// DOWNLOAD A FILE FROM WEBPAGE AND CHECK WHETHER IT IS DOWNLOADED.
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		
		WebElement download = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		download.click();
		
		Thread.sleep(5000); // NOTE- THIS STEP IS- important for this program because it takes time for the process
		
		File filelocation = new File("C:\\Users\\stanl\\Downloads");	
		
		File[] filelist= filelocation.listFiles();
		
		System.out.println("hello");
		
		for (File alpha : filelist) {
			if (alpha.getName().equals("samplefile.pdf")) {
				System.out.println("the file is downloaded");
				System.out.println("the file location is in c folder");
				break;
			}
		}

	}

}
