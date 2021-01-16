package shared;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CreateAccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Runner extends TestBase{
	
	@Test(enabled = false)
	public void ValidateHomePage() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		homepage.allCategoryBtn();
		Thread.sleep(3000);
		homepage.clickOnNewReleases();
	}
	
  @Test(enabled = false)
  public void f() throws InterruptedException {
	  LoginPage login=new LoginPage(driver);
	  Thread.sleep(3000);
	  login.signInField();
	  Thread.sleep(3000);
	  login.clickOnStartHere();
  }
  
  @Test(dataProvider="dp",dataProviderClass = DataProviders.class )
  public  void validateCreateAccountsFunctionality(String email, String name, String psswrd, String repsswrd) throws InterruptedException { 
	  LoginPage login=new LoginPage(driver);
	  CreateAccountPage createAccount=new CreateAccountPage(driver);
	  login.signInField();
	  Thread.sleep(3000);
	  login.clickOnStartHere();
	  Thread.sleep(3000);
	  createAccount.sendkeysToNameField(name);
	  createAccount.sendkeysToEmailField(email);
	  createAccount.sendkeysToPasswordField(psswrd);
	  createAccount.AgainsendkeysToPasswordField(repsswrd);
	   createAccount.clickOnCreateAccount();
	   driver.navigate().back();
	   Thread.sleep(4000);
	   driver.navigate().forward();
	   Thread.sleep(4000);
  }
}
