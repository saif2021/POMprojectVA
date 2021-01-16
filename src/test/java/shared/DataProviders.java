package shared;

import org.testng.annotations.Test;

import pages.CreateAccountPage;

import org.testng.annotations.DataProvider;

public class DataProviders extends TestBase{
  @Test(dataProvider = "dp")
  public void f(String  name, String email, String psswrd, String repsswrd) throws InterruptedException {
	  CreateAccountPage createAccount=new CreateAccountPage(driver);
	  createAccount.sendkeysToNameField(name);
	  createAccount.sendkeysToEmailField(email);
	  createAccount.sendkeysToPasswordField(psswrd);
	  createAccount.AgainsendkeysToPasswordField(repsswrd);
	 

	
}

@DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Saif_Islam1","saifislam1@gmail","saifislam1","saif islam1"},
      new Object[] { "Saif_Islam2","saifislam1@gmail2","saifislam2","saif islam2" },
    };
  }
}
