package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String args[]) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the Url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the user name as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Print welcome note
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//click on hyper link button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads tag
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create lead button
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Enter the company name 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Oracle");
		
		//Enter the first name field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopikasree");
		
		//Enter the last name field
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CV");
		
		//Enter the Department name 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		
		//Enter the Description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I have a knowledge in both manual and automation testing");
		
		//Enter the email id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopikasree@gmail.com");
		
		//select the value from dropdown 
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		
		//click on create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = "Create Lead | Opentaps CRM";
		
		String title2 = driver.getTitle();
		
		if(title1.equals(title2)) {
			System.out.println("Create lead created successfully");
		}
		else {
			System.out.println("Created lead created not successfully");
		}
		
		//click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//clear the description field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//enter the new decription field
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("I have done a real time project based on software testing");
		
		//click on update button
		driver.findElement(By.name("submitButton")).click();
		
		String title3 = "View Lead | opentaps CRM";
		
		String title4 = driver.getTitle();
		
		if(title3.equals(title4)) {
			System.out.println("Updated Successfully");
		}
		else {
			System.out.println("Not Updated Successfully");
		}
		
		
		
		
		
	    
		
		
		
		
	}

}
