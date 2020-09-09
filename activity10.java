package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity10 {
	
WebDriver driver;
WebDriverWait wait;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#post-69 > a:nth-child(2) > img:nth-child(1)")).click();
		
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_login"))); //.visibilityOf(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a"))));
  	  	driver.findElement(By.id("user_login")).sendKeys("root");
  	  	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
  	  	
  	  	driver.findElement(By.id("wp-submit")).click();
  	  	

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu-item-1508")));
		  driver.findElement(By.id("menu-item-1508")).click();
        
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")));  
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();;
        
        
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")));  
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]/a/div[2]")).click();;
        
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[4]/div[2]/form/input[4]")));  
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[4]/div[2]/form/input[4]")).click();;
		
        
		String Page_title = driver.getTitle();
		Assert.assertEquals(Page_title, "Monitoring & Digital Advertising – Alchemy LMS");
}
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}

}
