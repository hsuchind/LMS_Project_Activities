package projectactivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class activity7 {
	
WebDriver driver;
	
	@BeforeMethod
	
public void beforeMethod() {
    	
    	driver = new FirefoxDriver();
    	driver.get("https://alchemy.hguy.co/lms");
	}
	
	@Test
	
	public void exampleTestCase() {
		
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
		
		//driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > h3:nth-child(1)"));
		//driver.findElement(By.cssSelector("#post-71 > div:nth-child(3) > h3:nth-child(1)"));
		//driver.findElement(By.cssSelector("#post-24042 > div:nth-child(3) > h3:nth-child(1)"));
		
		List<WebElement> links = driver.findElements(By.className("entry-title"));    //Identify the number of Link on webpage and assign into Webelement List
	    int linkCount = links.size();     // Count the total Link list on Web Page
	    System.out.println("Total Number of link count on webpage = "  + linkCount);
	    for (WebElement obkCurrentLink : links) {
	        
	        String strLinkText = obkCurrentLink.getText();
	        
	        System.out.println(strLinkText);
		
	}
	
	}
	
}
