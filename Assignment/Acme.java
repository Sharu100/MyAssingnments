package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acme {

	public static void main(String args[]) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://acme-test.uipath.com/login");
		
		//Enter the email id
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		//click login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String text1 = "ACME System - Dashboard";
		String text = driver.getTitle();
		System.out.println("Welcome, kumar.testleaf@gmail.com to System 1.");
		
		//click on log out
		driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout']")).click();
		
		driver.close();
		
		
	}

}
