package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchBrowser {
	
	public static void main(String args[]) {
		
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the user name as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//print the welcome note
		String text = driver.findElement(By.tagName("h2")).getText();
		
		//click on hyper link button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads tap
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create lead button
		driver.findElement(By.partialLinkText("Create")).click();
		
		//enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("qeagle");
		
		//enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharumathi");
		
		//enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CV");
		
		//locate the dropdown
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		//select the value from dropdown using select class
		Select industryDroDown=new Select(industryDD);
		
		
		//select by text
		//industryDropDown.selectByVisibleText("Computer Software");
		//select by value
		//industryDropDown.selectByValue("industryEnumId");
		//select by index value
		industryDroDown.selectByIndex(1);
		
		//enter the email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sharumathi.cv@gmail.com");
		
		

		
		//select the state/province as New York using visible Text
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		
		//click on create lead button
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title1 = "View Lead | opentaps CRM";
		
		String title = driver.getTitle();
		
		if(title1.equals(title)) {
			System.out.println("Create lead created successfully");
			
		}
		else {
			System.out.println("Create lead created not successfully");
		}
	}
	

}
     