package projectactivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity8 {

WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		driver.findElement(By.cssSelector("#menu-item-1506 > a:nth-child(1)")).click();
		WebElement fullname = driver.findElement(By.cssSelector("#wpforms-8-field_0"));
		WebElement email = driver.findElement(By.cssSelector("#wpforms-8-field_1"));
		WebElement subject = driver.findElement(By.cssSelector("#wpforms-8-field_3"));
		WebElement cmdormeg = driver.findElement(By.cssSelector("#wpforms-8-field_2"));
		
		fullname.sendKeys("hariharan");
		email.sendKeys("hsuchind@in.ibm.com");
		subject.sendKeys("software");
		cmdormeg.sendKeys("hardware");
		
		driver.findElement(By.cssSelector("#wpforms-submit-8")).click();
		
		WebElement submitmessage =  driver.findElement(By.cssSelector("#wpforms-confirmation-8 > p:nth-child(1)"));
		System.out.println("Message after submit: "+submitmessage.getText());
		Assert.assertEquals(submitmessage.getText(), "Thanks for contacting us! We will be in touch with you shortly.");
		
}
}
