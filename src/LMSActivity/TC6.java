package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC6 extends TC5 {
  @Test
  public void LogintoLMS() {
	  
	    driver.navigate().to("https://alchemy.hguy.co/lms");
	    WebElement myaccountpage = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	    myaccountpage.click();
	    String PageTitle=driver.getTitle();
		//Print the title of the page
		System.out.println("Title of the page is: " + PageTitle);
		//Assertion for page title
		Assert.assertEquals("My Account – Alchemy LMS", PageTitle);
	    WebElement login = driver.findElement(By.xpath("//*[@href='#login']")); 
	    //Login to the LMS page	    
	    login.click();
	    WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
	    username.sendKeys("root");
	    WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
	    password.sendKeys("pa$$w0rd");
	    WebElement loginbutton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
	    loginbutton.click();
	    //Verify page logged in Successfully
	    WebElement editProfile = driver.findElement(By.className("ld-profile-edit-link"));
	    editProfile.isDisplayed();
	          
  }
}
