package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	
	@Given("user is on the the website {string}")
	public void user_is_on_the_the_website(String string) 
	{
		BrowserFactory.getDriver().get(string);
		
	}    
	

	@When("user enters login details email {string} password {string}")
	public void user_enters_login_details_email_password(String string, String string2) {
		BrowserFactory.getDriver().findElement(By.linkText("Sign in")).click();
		BrowserFactory.getDriver().findElement(By.name("username")).sendKeys(string);
		BrowserFactory.getDriver().findElement(By.name("password")).sendKeys(string2);
	}

	@When("user clicks on SignIn button")
	public void user_clicks_on_sign_in_button() {
		BrowserFactory.getDriver().findElement(By.id("submit-button")).click();
	    
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() {
		Assert.assertTrue(BrowserFactory.getDriver().findElement(By.xpath("//span[text()='Your account']")).isDisplayed());
	}

	@Given("user navigates to weather")
	public void user_navigates_to_weather() {
		BrowserFactory.getDriver().findElement(By.id("orbit-more-button")).click();
		BrowserFactory.getDriver().findElement(By.xpath("//ul[@class='more-international']//*[text()='Weather']")).click();
	}

	@When("user searches {string}")
	public void user_searches(String string) {
		BrowserFactory.getDriver().findElement(By.xpath("//a[@id='orbit-search-button']")).click();
		BrowserFactory.getDriver().findElement(By.id("search-input")).sendKeys(string);
	}

	@When("user click on search")
	public void user_click_on_search() {
		BrowserFactory.getDriver().findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("location should be displayed")
	public void location_should_be_displayed() {
	   Assert.assertTrue(BrowserFactory.getDriver().getTitle().contains("London"));
	    
	}

	@Given("user have searched for weather location {string}")
	public void user_have_searched_for_weather_location(String string) {
		BrowserFactory.getDriver().findElement(By.xpath("//a[@id='orbit-search-button']")).click();
		BrowserFactory.getDriver().findElement(By.id("search-input")).sendKeys(string);
	    
	}

	@When("user clicked on search")
	public void user_clicked_on_search() {
		BrowserFactory.getDriver().findElement(By.cssSelector("button[type='submit']")).click();
	    
	}

	@When("user selects preferred location")
	public void user_selects_preferred_location() {
		// please complete from your end
	}

	@When("user can adds weather to locations")
	public void user_can_adds_weather_to_locations() {
	   // please complete from your end 
	    
	}

	@Then("location should be added")
	public void location_should_be_added() {
	   
		// please complete from your end 
	    
	}

}
