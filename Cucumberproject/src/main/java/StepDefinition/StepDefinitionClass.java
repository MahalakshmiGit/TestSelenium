package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepDefinitionClass {
	
	WebDriver driver;
	
	@Given("Open firefox and start application")
	public void open_firefox_and_start_application() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	 
	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		
		driver.findElement(By.id("email")).sendKeys("mahalakshmi167@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Adhvik@167");

	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		
		driver.findElement(By.id("loginbutton")).click();

	   
	}


}
