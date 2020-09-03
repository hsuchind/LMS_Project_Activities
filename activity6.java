package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity6 {
	
WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[5]/a")).click();
		String title = driver.getTitle();
    	System.out.println("Page title is: " + title);
    	
    	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
    	 WebElement username = driver.findElement(By.cssSelector("#user_login"));
    	 WebElement password = driver.findElement(By.cssSelector("#user_pass"));
    	
         username.sendKeys("root");
         password.sendKeys("pa$$w0rd");
         
         driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
         String title1 = driver.getTitle();
     	 System.out.println("Page title after logged in: " + title1);
	}

}
