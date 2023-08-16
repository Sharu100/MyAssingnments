package week5.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String args[]) throws InterruptedException{
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL
		driver.get("https://www.facebook.com/");
		
		//click on create new account button
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		//Enter the First name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SHARUMATHI");
		
		//Enter the Last name
		driver.findElement(By.name("lastname")).sendKeys("CV");
		
		//Enter your Phone number
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8220485831");
		
		//Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("Selvi@08");
		
		//Select the date
		WebElement DateDD = driver.findElement(By.name("birthday_day"));
		Select DateDroDown = new Select(DateDD);
		DateDroDown.selectByVisibleText("10");
				
		//Select a month
	    WebElement month = driver.findElement(By.id("month"));
	    month.sendKeys("Jan");
	    
	    //Select the year
	    WebElement YearYY = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select YearDroDown = new Select(YearYY);
	    YearDroDown.selectByVisibleText("2001");
	    
	    //Click on the Gender
	    WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    gender.click();
	    
	    Thread.sleep(5000);
	    
	    //Close the browser
	    driver.close();
		
		
	}
	

}