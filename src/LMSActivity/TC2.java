package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends TC1 {
  @Test
  public void VerifyPageHeading() {
	  
	  driver.navigate().to("https://alchemy.hguy.co/lms");  
	  WebElement element = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
	  String PageHeading = element.getText();	
	  //Print the heading title of the page
	  System.out.println("Page heading is: " + PageHeading);
	  //Assertion for page title
	  Assert.assertEquals("Learn from Industry Experts", PageHeading); 
	  
  }
}
