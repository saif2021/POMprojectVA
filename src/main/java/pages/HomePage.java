package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(id="nav-hamburger-menu")
	WebElement allCategory;
	
	@FindBy(xpath="//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[3]/a[1]")
	WebElement newReleases;
	
public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void allCategoryBtn() {
	allCategory.click();
}
public void clickOnNewReleases() {
	newReleases.click();
	driver.navigate().back();
}
}