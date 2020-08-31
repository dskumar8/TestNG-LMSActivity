package LMSActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC9 extends TC8{
  @Test
  public void CompleteLesson() {
	  
	    driver.navigate().to("https://alchemy.hguy.co/lms");
	    //Login to the LMS page	 
	    driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	    WebElement login = driver.findElement(By.xpath("//*[@href='#login']")); 
	    login.click();
	    WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
	    username.sendKeys("root");
	    WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
	    password.sendKeys("pa$$w0rd");
	    WebElement loginbutton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
	    loginbutton.click();
        WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
	    //Click on all courses link
	    allCourses.click();
	    //Get the course link
	    WebElement course = driver.findElement(By.xpath("//article[@id='post-24042']//a[@class='btn btn-primary'][contains(text(),'See more...')]"));
	    //Click on the course link
	    course.click();
	    //Get the title of the course
	    String titleOfCourse = driver.getTitle();
	    //Print the title of the course
	    System.out.println("Title of the course page is: "+ titleOfCourse);
	    driver.findElement(By.xpath("(//*[@class= 'ld-item-title'])[2]")).click();
	    driver.findElement(By.xpath("(//*[@class='ld-topic-title'])[4]")).click();
	    try {
	       driver.findElement(By.xpath("(//input[@value='Mark Complete'])[2]"));
	       driver.findElement(By.xpath("(//input[@value='Mark Complete'])[2]")).click();
	    } catch (NoSuchElementException e) {
	       System.out.println(titleOfCourse + " is already completed....");
	    }   
	    
  }
}
