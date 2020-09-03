package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity11 {
	
WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#post-69 > a:nth-child(2) > img:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".ld-button")).click();
		
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		
        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div/span[2]")).click();
        
        driver.findElement(By.xpath("#ld-table-list-item-181 > a:nth-child(1) > span:nth-child(2)")).click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[4]/div[2]/form/input[4]")).click();
        
	}
	
	//close the browser
	  @AfterTest
		public void afterMethod() {
		driver.close();
	  }
}
