package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity10 {
	
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
		
		WebElement titlemessage =  driver.findElement(By.cssSelector(".entry-title"));
		System.out.println("Title Message: "+titlemessage.getText());
		Assert.assertEquals(titlemessage.getText(), "Social Media Marketing");
}

}
