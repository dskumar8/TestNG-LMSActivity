package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4 extends TC3 {
  @Test
  public void SecondPopularCourse() {
	  
	   driver.navigate().to("https://alchemy.hguy.co/lms"); 
	   WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
	   String SecondPopularCourse = element.getText();	
	   //Print the heading title of the page
	   System.out.println("Title of Second mostpopular course is: " +SecondPopularCourse);
	   //Assertion for page title
	   Assert.assertEquals("Email Marketing Strategies", SecondPopularCourse); 
	  
  }
}
