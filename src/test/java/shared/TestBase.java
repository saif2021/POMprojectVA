package shared;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class TestBase {
	public WebDriver driver;
 @Parameters({"browser","url"})
  @BeforeClass
  public void driverSetup(String browser, String url) {
	  if (browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mimni\\eclipse-workspace\\Pnt_With_VA\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
  }else if (browser.equalsIgnoreCase("firefox")){
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\mimni\\eclipse-workspace\\Pnt_With_VA\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
  } else {
	  System.out.println("Browser is not valid");
	  }
  }
  
  

  @AfterClass
  public void afterClass() throws IOException, InterruptedException {
	  Pictures();
	  Thread.sleep(3000);
	  driver.quit();
  }
  public void Pictures() throws IOException {
	  String userDirectory=System.getProperty("user.dir");
	  Date dt=new Date();
	  String ut=dt.toString().replace(" ", "_").replace(":", "_")+".jpg";
	  File Capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Capture, new File(userDirectory+"\\Photos\\"+ut));
	  
  }

}
