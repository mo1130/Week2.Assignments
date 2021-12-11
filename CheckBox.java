package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Select the languages that you know?
		
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		
		//Confirm Selenium is checked
		
		boolean enabled = driver.findElement(By.xpath("//div[text()='Selenium']/input")).isEnabled();
		System.out.println(enabled);
		
		//DeSelect only checked
		
		 boolean selected = driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected();
		 System.out.println(selected);
		 if(selected==true) {
			 
			 driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
			 System.out.println("Deslected the selected option");
		 }
		 else {
			 System.out.println("this is already deselected");
		 }
		 
		 //Select all below checkboxes
		 
		  driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		  driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		  driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		  driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		  driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
		  
		  
		 

		
	}

}
