package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver = null;

	By name = By.id("name");
	By password = By.id("password");
	By login = By.id("login");
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
	}
	
	public void userName(String usrname) {
		driver.findElement(name).sendKeys(usrname);
	}
	
	public void Password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void login_button() {
		driver.findElement(login).click();
	}

}
