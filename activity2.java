package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity2 {
	
	WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		WebElement heading = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
		System.out.println("Heading is: "+heading.getText());
		Assert.assertEquals(heading.getText(), "Learn from Industry Experts");
	}
	   @AfterMethod
		
	    public void afterMethod() {
		
	        //Close the browser
		
	        driver.quit();
		
	    }
}
