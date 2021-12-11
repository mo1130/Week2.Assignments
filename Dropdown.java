package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Select training program using Index
		
		WebElement ele1 = driver.findElement(By.id("dropdown1"));
		Select drpdwn1= new Select(ele1);
		drpdwn1.selectByIndex(2);
		
		//Select training program using Text
		
		WebElement ele2 = driver.findElement(By.name("dropdown2"));
		Select drpdwn2= new Select(ele2);
		drpdwn2.selectByVisibleText("UFT/QTP");
		
		//Select training program using Value
		
		WebElement ele3 = driver.findElement(By.id("dropdown3"));
		Select drpdwn3= new Select(ele3);
		drpdwn3.selectByValue("4");
		
		//Get the number of dropdown options
		
		WebElement ele4 = driver.findElement(By.className("dropdown"));
		Select drpdwn4= new Select(ele4);
		int size = drpdwn4.getOptions().size();
		System.out.println("number of the dropdown option:"+size);
		
		//Select your programs
		
		WebElement ele5 = driver.findElement(By.xpath("//option[text()='Select your programs']/.."));
		Select drpdwn5= new Select(ele5);
		drpdwn5.selectByIndex(3);
		Thread.sleep(1000);
		drpdwn5.selectByVisibleText("Selenium");
		
		
		
		
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Selenium");
		
		
		
		
		
		
	}

}
