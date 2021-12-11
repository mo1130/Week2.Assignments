package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoDuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@style='width: 212px;']  [@name='emailAddress']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		String leadfn1 = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[1]")).getText();//error line for element click intercepted- runtime error
		
		
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[1]")).click();
		
		
		
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String leadFn2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(leadfn1.equals(leadFn2)) {
			System.out.println("lead FN is same");
			
		}
		
		else
		{System.out.println("Lead FN is not same");
			}
		
		

	}

}
