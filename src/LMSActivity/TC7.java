package LMSActivity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC7 extends TC6 {
  @Test
  public void ListAllCourses() {
	  
	    driver.navigate().to("https://alchemy.hguy.co/lms");
	    WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
	    allCourses.click();
	    //Get the total no of courses on the page
	    List<WebElement> Course = driver.findElements(By.className("entry-title"));
	    int countofcourses = Course.size();
	    //Print the total no of courses on the page
	    System.out.println("Number of courses on the page is:" +countofcourses);
	    Reporter.log("Courses count is: " +countofcourses);
	    for (int i = 0 ; i < countofcourses ; i++)
	    {
	    	int j = i+1;
	    	System.out.println(j+" : "+ Course.get(i).getText());
	    	Reporter.log("Courses"+j+" : " +Course.get(i).getText());
	    }
	    
	  
  }
}
