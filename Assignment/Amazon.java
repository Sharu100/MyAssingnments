package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String args[]) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load the URL
		driver.get("https://www.amazon.in/");
		
		//Type "Bags" in the search box
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Bags");
		
		//choose the item in the result (bags for girls)
		//driver.findElement(By.xpath("//span[text()='for girls']")).click();
		driver.findElement(By.xpath("//div[@aria-label='bags for girls']")).click();
		
		//print the total number of results
		System.out.println(driver.findElement(By.xpath("//span[text()='1-48 of over 100,000 results for']")).getText());
		
		//Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[7]")).click();
		Thread.sleep(5000);
		
		//Click on sort by
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		
		//Click on Newest arrival
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//print the first resulting bag info(name)
		WebElement title1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']"));
		String title2 = title1.getText();
		System.out.println("name of the resulting bag : " +title2);
		
		WebElement price1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']"));
		String price2 = price1.getText();
		System.out.println("Discount price of the resulting bag : " +price2);
		
		Thread.sleep(5000);
		
		driver.close();
				
		
		
		
		
		
		
		
		
		
	}

}
