package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@id='nav-link-accountList']" )
	WebElement signIN;
	
	@FindBy(linkText = "Start here.")
	WebElement startNewCustomer;


public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void signInField() {
	Actions actions=new Actions(driver);
	actions.moveToElement(signIN);
}
public void clickOnStartHere() {
	startNewCustomer.click();
}
}