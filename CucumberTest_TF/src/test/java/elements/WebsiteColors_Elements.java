package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsiteColors_Elements {
	
	WebDriver driver;
	
		@FindBy(xpath = "//*[@id=\\\"extra\\\"]/button[1]") public WebElement ColorSkyBlue;
		@FindBy(xpath = "//button[normalize-space()='Set White Background']") public WebElement ColorWhite;
		
		public WebsiteColors_Elements(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
}
