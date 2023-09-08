package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String args[]) throws InterruptedException {
		
		// Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Add implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL
		driver.get("https://www.facebook.com/");
		
		//Click on create new account button
		//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("SHARUMATHI");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("CV");
		
		//Enter the mobile number
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9383987290");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Charu@55");
		
		//Select the date
		WebElement DateDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select DateDroDown = new Select(DateDD);
		DateDroDown.selectByIndex(18);
		
		//Select the month
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Month.sendKeys("Oct");
		
		//Select the year
		WebElement YearYY = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		Select YearDroDown = new Select(YearYY);
		YearDroDown.selectByIndex(50);
		
		//Click on Gender
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio.click();
		
		Thread.sleep(2000);
		
		//Close the Browser
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
