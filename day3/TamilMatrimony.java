package week5.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String args[]) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL
		driver.get("https://www.tamilmatrimony.in/");
		
		//Select the matrimony profile for yourself
		Select profile = new Select(driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
		profile.selectByVisibleText("Myself");
		
		//Enter the name
		driver.findElement(By.xpath("//input[@name='NAME']")).sendKeys("Rohit");
		
		//Click on gender
		driver.findElement(By.xpath("//label[@for='gendermale']")).click();
		
		//Select the date
		Select date = new Select(driver.findElement(By.xpath("//select[@id='DOBDAY']")));
		date.selectByIndex(10);
		
		//Select the month
		Select month = new Select(driver.findElement(By.xpath("//select[@name='DOBMONTH']")));
		month.selectByVisibleText("Jan");
		
		//Select the year
		Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
		year.selectByVisibleText("1995");
		
		//Select the religion
		WebElement reg = driver.findElement(By.xpath("//select[@class='selectfield']"));
		Select reg1 = new Select(reg);
		reg1.selectByVisibleText("Hindu");
		
		//Select the mother tongue
		Select language = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
		language.selectByVisibleText("Malayalam");
		
		//Select the country
		Select country = new Select(driver.findElement(By.xpath("//select[@name='COUNTRY']")));
		country.selectByVisibleText("India");
				
		//Enter the mobile number
		driver.findElement(By.xpath("(//input[@class='hp-regform-txtfield'])[2]")).sendKeys("9947382765");
		
		//Enter the email address
		driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("rohit@gmail.com");
		
		Thread.sleep(5000);
		
		//close the browser
		driver.close();
		
		
	}

}