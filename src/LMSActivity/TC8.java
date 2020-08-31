package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC8 extends TC7 {
  @Test
  public void ContactAdmin() {
	  
	    driver.navigate().to("https://alchemy.hguy.co/lms");
	    //Click on Contact
	    WebElement Contact = driver.findElement(By.id("menu-item-1506"));
	    Contact.click();
	    //Enter Message
	    WebElement fullName=driver.findElement(By.id("wpforms-8-field_0"));
	    //Enter full name
	    fullName.sendKeys("Dinesh kumar");
	    WebElement email=driver.findElement(By.id("wpforms-8-field_1"));
	    //Enter email
	    email.sendKeys("testd@ibm.com");
	    WebElement subject=driver.findElement(By.id("wpforms-8-field_3"));
	    //Enter subject
	    subject.sendKeys("Test");
	    WebElement message=driver.findElement(By.id("wpforms-8-field_2"));
	    //Enter message
	    message.sendKeys("Test");
	    WebElement sendMessageButton=driver.findElement(By.name("wpforms[submit]"));
	    //Click on Send message button
	    sendMessageButton.click();
	    WebElement messageContent = driver.findElement(By.id("wpforms-confirmation-8"));
	    String MessageContent = messageContent.getText();
	    //Print the message
	    System.out.println("Message displayed after submission is: " +MessageContent);
	    Reporter.log("Message displayed is: " +MessageContent); 

	  
  }
}
