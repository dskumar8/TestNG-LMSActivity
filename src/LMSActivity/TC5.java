package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC5 extends TC4{
  @Test
  public void NavigateMyAccount() {
	  
	  driver.navigate().to("https://alchemy.hguy.co/lms");
	  WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  MyAccount.click();
	  String PageTitle=driver.getTitle();
	  //Print the title of the page
	  System.out.println("Title of the page is: " + PageTitle);
	  //Assertion for page title
	  Assert.assertEquals("My Account – Alchemy LMS", PageTitle);
	  
  }
}
