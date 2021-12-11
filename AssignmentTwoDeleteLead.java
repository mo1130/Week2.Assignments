package week2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoDeleteLead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("0");
		driver.findElement(By.name("phoneNumber")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//System.out.println("good");
		
		//String leadid = driver.findElement(By.xpath("//a[text()='10651']")).getText();
		

		try{
			Thread.sleep(5000);
			}
			catch(InterruptedException ie)
		{
			}
		String leadid = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).getText();
		System.out.println(leadid);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		  driver.findElement(By.name("id")).sendKeys(leadid);
		  driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		  
		  try{
				Thread.sleep(5000);
				}
				catch(InterruptedException ie)
			{
				}
		  String texterror =driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 String error="No records to display";
		 
		 if(texterror.equals(error)) {
			 
			 System.out.println("lead is successfully deleted");
		 }
		 else {
			 System.out.println("not deleted");
		 
		 }
		  driver.close();
		  
		 
		
		
		
		
		
		

	}

}
