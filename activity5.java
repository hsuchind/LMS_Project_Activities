package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity5 {
	
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
	}
	 @AfterMethod
		
	    public void afterMethod() {
		
	        //Close the browser
		
	        driver.quit();
		
	    }
}
