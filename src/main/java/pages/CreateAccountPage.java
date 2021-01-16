package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage{
	public WebDriver driver;
	
	@FindBy(id="ap_customer_name")
	WebElement nameField;
	
	@FindBy(id="ap_email")
	WebElement emailField;
	
	
	@FindBy(id="ap_password")
	WebElement passwordField;
	
	@FindBy(id="ap_password_check")
	WebElement againPasswordField;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement createAccountBtn;
	
	public CreateAccountPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void sendkeysToNameField(String name) {
	nameField.sendKeys(name);
}
public void sendkeysToEmailField(String email) {
	emailField.sendKeys(email);
}
public void sendkeysToPasswordField(String psswrd) {
	passwordField.sendKeys(psswrd);
}
public void AgainsendkeysToPasswordField(String repsswrd) {
	againPasswordField.sendKeys(repsswrd);
}
public void clickOnCreateAccount() {
	createAccountBtn.click();
}
}