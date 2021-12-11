package week2.assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//clicking home page
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		//Find where am supposed to go without clicking me
		
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(attribute);
		
		//Verify am I broken
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("error"))
		{
			System.out.println("URL is broken");
		}
		else {
			System.out.println("URL is not broken");
			
		}
		
		//Go to Home Page (Interact with same link name)
		
		String link2 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		
		String link1 = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/a)[4]")).getAttribute("href");
		
		 if (link1.equals(link2))
			 {
			 
			 System.out.println("Same link only");
			 driver.findElement(By.linkText("Go to Home Page")).click();
			 }
		 else {
			 System.out.println("not same link");
		 }
		
		
		 //How many links are available in this page?
		
		 driver.findElement(By.linkText("How many links are available in this page?")).click();
		 List<WebElement> findElements = driver.findElements(By.tagName("a"));
		 int size = findElements.size();
		 System.out.println(size);
		 
		 

		
		

	}

}
