package LMSActivity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;


public class TC1 {
 
	  WebDriver driver;
	  
	  
	  @BeforeMethod
	  public void OpenBrowser() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\SDineshKumar\\Desktop\\All_Releases\\Jan21\\SDET_training\\Test_NG\\chromedriver_win32\\chromedriver.exe");
			 
		  // Initialize browser
		  driver = (WebDriver) new ChromeDriver();
		  driver.manage().window().maximize();
	  }


	
	  @Test
	  public void validatePageTitle() {
		  driver.navigate().to("https://alchemy.hguy.co/lms");
		  System.out.println("Page title :"+driver.getTitle());
		  Assert.assertEquals("Alchemy LMS – An LMS Application", driver.getTitle());
		  
	  }
	  
	  
	  	  @AfterMethod
	  public void CloseBrowser() {
		  
		  driver.close();
		  
	  }


	
}
