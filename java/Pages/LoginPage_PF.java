package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	@FindBy(id = "name")
	WebElement username1;

	@FindBy(id = "password")
	WebElement password1;

	@FindBy(id = "login")
	WebElement login_button;

	WebDriver driver = null;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
//		PageFactory.initElements(factory, this);  // instaed of driver we have to use "factory" object.
		/* It is used when we get No Element Exception or element appeared in different span of time. Time is in second */
	}

	public void userName(String username) {
		username1.sendKeys(username);
	}

	public void Password(String password) {
		password1.sendKeys(password);
	}

	public void login_button() {
		login_button.click();
	}

}
