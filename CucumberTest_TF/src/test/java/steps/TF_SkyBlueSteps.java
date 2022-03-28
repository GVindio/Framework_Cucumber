package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TF_SkyBlueSteps {

	WebDriver driver;
	
	public TF_SkyBlueSteps(BaseSteps basesteps) {
		this.driver = basesteps.getDriver();
		
	}

	@Given("I am on Techfios Practice Page Scenario1")
	public void i_am_on_Techfios_Practice_Page() {

		WebDriverManager.chromedriver().setup();
		driver.get("http://techfios.com/test/104/");
	}

	@And("Set SkyBlue Background button exists")
	public void button_exists() {

	}

	@When("I click on the sky blue button")
	public void i_click_on_the_sky_blue_button() {
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();

	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {

	}

}
