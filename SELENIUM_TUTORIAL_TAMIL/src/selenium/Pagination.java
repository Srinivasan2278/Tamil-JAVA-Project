package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		// how to handle pagination elements 

		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

		List<String> namelist = new ArrayList<String>();
		//   List<WebElement> listofNames;
		//   WebElement nextbutton;
		int sizeofPagination = driver.findElements(By.xpath("//ul[@class='pagination']//a")).size();
		System.out.println(sizeofPagination);

		if (sizeofPagination>0) {  // if it is above 0 then pagination exist.


			do { 
				
				List<WebElement>listofNames=driver.findElements(By.xpath("//td[@class='sorting_1']"));

				for (WebElement name : listofNames) {
					
					namelist.add(name.getText());  // here the names are added to the list<array> in the variable namelist
				}


				WebElement nextbutton = driver.findElement(By.id("dtBasicExample_next"));

				String nextbuttonclassname = nextbutton.getAttribute("class");

				if (!nextbuttonclassname.contains("disabled")) {
				
					Thread.sleep(1000);
					
					nextbutton.click();
				}else {
					break;
				}
			}
			while(true);   // it will keep on looping until condition becomes false . or until next button becomes disabled


		} else {
			System.out.println("there is no pagination");
		}
		for (String allnames : namelist) {
			System.out.println(allnames);
		}
	}

}
