package Assignment;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	private static final String Sign = null;

	public static void main(String args[]) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.facebook.com/login/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on sign up button
		driver.findElement(By.partialLinkText("Sign up for Facebook")).click();
		
		//Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Reena");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("CS");
		
		//Enter the email address
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sit19ec083@sairamtap.edu.in");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Baba@500");
		
		//Locate the drop down for date
		WebElement DateDD = driver.findElement(By.name("birthday_day"));
		Select DateDroDown = new Select(DateDD);
		DateDroDown.selectByIndex(19);
		
		//Locate the drop down for month
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.sendKeys("Jan");
		
		//Locate the drop down for year
		WebElement YearDD = driver.findElement(By.name("birthday_year"));
		Select YearDroDown = new Select(YearDD);
		YearDroDown.selectByIndex(50);
		
		//Select radio button as female
		WebElement radio = driver.findElement(By.xpath("//label[@class='_58mt']"));
		radio.click();
		
	    
		
		
		
	}

}
