package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String args[]) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the username as Demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//Enter the password as crmsfa
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		//Click on login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Click on hyper link button
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on create contact button
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Harsath");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("RS");
		
		//Enter the department name
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CSE");
		
		//Enter the description field
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Applying for the Softwate Testing Role");
		
		//Enter the email address
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("harsath@gamil.com");
		
		//Enter the phone number
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8220761150");
		
		//Select the NewYork using visible text
		Select DropDown = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		DropDown.selectByVisibleText("New York");
		
		//Click on create contact
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the description field
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		//Fill the Important Note
		WebElement element = driver.findElement(By.id("updateContactForm_importantNote"));
		element.sendKeys("I will work hard for the growth of the company");
		
		//click on update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title1 = "View Contact | opentaps CRM";
		String title = driver.getTitle();
		if(title1.equals(title)) {
			System.out.println("Contact is created successfully");
		}
		else
		{
			System.out.println("Contact is not created successfully");
		}
		
		
	}

}
