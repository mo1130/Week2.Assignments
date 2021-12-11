package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		//enter mail
		
	driver.findElement(By.id("email")).sendKeys("mohan@gmail.com");
		
		//append
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("appended");

	
	//default text
	
	String attribute = driver.findElement(By.name("username")).getAttribute("value");
	 System.out.println("default text is" + attribute);
	
	//clear the text in textbox
	
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	//System.out.println("cleared");
	
	//disabled
	
	System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
	
	}

}
