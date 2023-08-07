package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	
	public static void main(String args[]) {
		
		//Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		// wait for the page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the url
		driver.get("https://www.abhibus.com/");
		
		// Type "chennai" in the from text box
		 driver.findElement(By.id("source")).sendKeys("Chennai");
		 
		//Click the first option from the pop up box
		 driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		 
		
		//Type Banglore in the to text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		//Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		//Select the tommottow's date in the Datefield
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		
		//Click the search buses
		driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
		
		//print the name of the first resulting bus
		WebElement name = driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
		name.click();
		String name1 = name.getText();
		System.out.println("name of the first resulting bus : " +name1);
		
		//Choose sleeper in the left menu from bus type
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
		
		//Click on the select seat
				driver.findElement(By.partialLinkText("SELECT")).click();
				
				
		//print the first resulting bus seat count
		WebElement name2 = driver.findElement(By.xpath("//h3[text()='24  Seats Available ']"));
		name2.click();
		String name3 = name2.getText();
		System.out.println("name of the first resulting bus seat : " +name3);
		
		//Choose any one available seat
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		
		//print seats selected,total fare
		WebElement name4 = driver.findElement(By.xpath("//span[text()='DU2']"));
		String name5 = name4.getText();
		System.out.println("Seats Selected : " +name5);
		
		WebElement name6 = driver.findElement(By.xpath("//span[@id='ticketfare']"));
		String name7 = name6.getText();
		System.out.println("Total Fare : " +name7);
		
		//Select the boarding point 
		driver.findElement(By.xpath("//select[@name='boardingpoint_id']")).click();
		driver.findElement(By.xpath("//option[text()='Guindy-22:35']")).click();
		
		//Select the dropping point
		driver.findElement(By.xpath("//select[@name='droppingpoint_id']")).click();
		driver.findElement(By.xpath("//option[text()='Mahadev Pura-05:53']")).click();
		
		driver.close();
		
		
		
		

		
		
		
		
		
		
	
	}

	

	

}
