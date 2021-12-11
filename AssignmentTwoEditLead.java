package week2.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwoEditLead {

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
	
		driver.findElement(By.xpath("//input[@style='width: 212px;']  [@name='firstName']")).sendKeys("Mohan");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//driver.findElement(By.className("x-btn-text")).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-firstName')]/a)[1]")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("tcs1");
		driver.findElement(By.name("submitButton")).click();
		WebElement ele1 = driver.findElement(By.id("viewLead_companyName_sp"));
		String cn = ele1.getText();
		
		if(cn.contains("tcs1")) {
			System.out.println("Company name is updated as changed");
			
			
		}
		else {
			
			System.out.println("Company name is not updated");
		}
		
		
		driver.close();

	}

}
