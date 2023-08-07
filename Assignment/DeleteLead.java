package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String args[]) {
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//Click on login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on hyper link button
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click the leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on find Lead
		driver.findElement(By.partialLinkText("Find")).click();
		
		//Click on phone number
		driver.findElement(By.linkText("Phone")).click();
		
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("310");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("765-3423");
		
		//Click on find lead button
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		//Click First Resulting Load
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=DemoLeadB']")).click();
		
		//click delete
		driver.findElement(By.xpath("//a[@href='javascript:document.deleteLeadForm.submit()']")).click();
		
		//click find leads
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		
		driver.findElement(By.partialLinkText("Find")).click();
		
		
		
			
	}

}
