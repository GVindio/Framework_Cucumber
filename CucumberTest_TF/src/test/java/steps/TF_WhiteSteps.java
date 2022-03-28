package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TF_WhiteSteps {

	WebDriver driver;
	
	public TF_WhiteSteps(BaseSteps basesteps) {
		this.driver = basesteps.getDriver();
		
	}

	@Given("I am on Techfios Practice Page Scenario2")
	public void i_am_on_Techfios_Practice_Page() {
		driver.get("http://techfios.com/test/104/");

	}

	@And("Set SkyWhite Background button exists")
	public void button_exists() {
	}

	@When("I click on the sky white button")
	public void i_click_on_the_sky_white_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Set White Background']")).click();

	}

	@Then("the background color will change to sky white")
	public void the_background_color_will_change_to_sky_white() {

	}

}
