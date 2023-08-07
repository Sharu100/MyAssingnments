package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String args[]) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//print the welcome note
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//click on hyper link button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads tap
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create lead button
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata Consulatancy Service");
		
		//Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Riduvarshini");
		
		//Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RS");
		
		//Enter the department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		
		//Enter the description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have a knowledge in manual and Automation Testing ");
		
		//Enter the email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("varshini@gmail.com");
		
		//select the state\province as NewYork using visible Text
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");

		//click on create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title1 = "view lead | opentaps CRM";
		
		String title2 = driver.getTitle();
		
		if(title1.equals(title2)) {
			System.out.println("create lead created successfully ");
		}
		else {
			System.out.println("create lead not created sucessfully");
		}
		
		//click on duplicate button
		driver.findElement(By.className("subMenuButton")).click();
		
		//clear the companyName field
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Enter the new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexaware");
		
		//Clear the first name field
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		//Enter the first name field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharumathi");
		
		//click on create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		String title3 = "Duplicate Lead | Opentaps CRM";
		
		String title4 = driver.getTitle();
		
		if(title2.equals(title4)) {
			System.out.println("Sucessfully created");
		}
		else {
			System.out.println("There is an error");
		}
		
		
		
		
		
	
		
	}

	
	

}
