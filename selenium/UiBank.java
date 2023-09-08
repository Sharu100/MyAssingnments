package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String args[]) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL
		driver.get("https://uibank.uipath.com/register-account");
		
		//Enter the name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gopika");
		
		//Select the title
		WebElement title = driver.findElement(By.xpath("//select[@id='title']"));
		Select titleDroDown = new Select(title);
		titleDroDown.selectByVisibleText("Ms");
		
		//Enter the initial
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("CV");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sree");
		
		//Select the gender
		Select droDown = new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		droDown.selectByVisibleText("Female");
		
		//Select the employment status
		Select droDown2 = new Select(driver.findElement(By.xpath("//select[@id='employmentStatus']")));
		droDown2.selectByVisibleText("Full-time");
		
		//Enter the username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sree_100");
		
		//Enter the email address
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sree@gmail.com");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Saibaba100");
		
		Thread.sleep(5000);
		
		//Close the browser
		driver.close();
	}
	

}
