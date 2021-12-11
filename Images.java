package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		//Click on this image to go home page

		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		//Am I Broken Image?
		
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		String currentUrl = driver.getCurrentUrl();
		
		String currenturl2="http://leafground.com/pages/Image.html";
		
		if(currentUrl.equals(currenturl2)) {
			
			System.out.println("Image is broken");
		}
		else {
			System.out.println("image is not broken..it is in the same screen");
		}
		
		//Click me using Keyboard or Mouse
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).sendKeys(Keys.ENTER);

	}

}
