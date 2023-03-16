package Background;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class BackgroundDemo {
	WebDriver driver = null;
	String URL = "https://example.testproject.io/web/";

	@Before
	public void launch_browser() {
		System.out.println("Launching Chrome Browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\CucumberBDD\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@Given("User is on login screen")
	public void user_is_on_login_screen() {
		System.out.println("User is on login page");

	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		WebElement username1 = driver.findElement(By.id("name"));
		username1.sendKeys("User1");

		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("12345");

	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Then("User is rediretced to the Home screen")
	public void user_is_rediretced_to_the_home_screen() throws InterruptedException {
		System.out.println("User is on Home Page");
		Thread.sleep(2000);
	}

	@When("User fill the SignUp form")
	public void user_fill_the_sign_up_form() {
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Mohali");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@yopmail.com");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("1234567890");
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		driver.findElement(By.id("save")).click();
	}

	@Then("Form is saved")
	public void form_is_saved() {
		System.out.println("Form is saved successfully");
	}

	@When("User clicks on logout button")
	public void user_clicks_on_logout_button() {
		driver.findElement(By.id("logout")).click();
	}

	@Then("User will be redirected the login screen")
	public void user_will_be_redirected_the_login_screen() {
		System.out.println("User is on Login Screen");
	}
	
	@After
	public void clos_browser() {
		System.out.println("Browser is closed");
		driver.close();
		driver.quit();
	}

}
