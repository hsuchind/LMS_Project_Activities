package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity4 {
	
WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		
		WebElement secondmostservice =  driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)"));
		System.out.println("First InfoBox title is: "+secondmostservice.getText());
		Assert.assertEquals(secondmostservice.getText(), "Email Marketing Strategies");
	}
	   @AfterMethod
		
	    public void afterMethod() {
		
	        //Close the browser
		
	        driver.quit();
		
	    }

}
