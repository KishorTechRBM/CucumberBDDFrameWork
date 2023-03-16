package HooksDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Hook {
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

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
		

	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		WebElement username1 = driver.findElement(By.id("name"));
		username1.clear();
		username1.sendKeys(username);

		WebElement password1 = driver.findElement(By.id("password"));
		password1.clear();
		password1.sendKeys(password);

	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		System.out.println("User is on Home Page");
		Thread.sleep(2000);
		driver.close();
	}

	@After
	public void clos_browser() {
		System.out.println("Browser is closed");
		driver.close();
		driver.quit();
	}

}
