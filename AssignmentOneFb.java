package week2.assigments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOneFb {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Mohan");
		driver.findElement(By.name("lastname")).sendKeys("k");
		driver.findElement(By.name("reg_email__")).sendKeys("975177332");
		driver.findElement(By.id("password_step_input")).sendKeys("pw@123456");
		
		WebElement ele1 = driver.findElement(By.id("day"));
		Select drdwn1= new Select(ele1);
		drdwn1.selectByValue("2");
		
		WebElement ele2 = driver.findElement(By.id("month"));
		Select drdwn2 = new Select(ele2);
		int size = drdwn2.getOptions().size();
		drdwn2.selectByIndex(size-1);
		
		WebElement ele3 = driver.findElement(By.id("year"));
		Select drdwn3= new Select(ele3);
		drdwn3.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		System.out.println("Test case passsed");
		
		

	}

}
