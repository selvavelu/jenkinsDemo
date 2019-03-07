package MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class googleTest {
	WebDriver driver;
	
  @Test
  public void LauchTest() {
	  String Expected="Google";
	  String Actual=driver.getTitle();
	  Assert.assertEquals(Expected, Actual);
  }
  
  @BeforeTest
  public void LaunchBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SelvakumarVelu\\Downloads\\Before_Jan24\\sw\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.quit();
  }

}
