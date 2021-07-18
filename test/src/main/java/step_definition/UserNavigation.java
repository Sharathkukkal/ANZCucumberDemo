package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UserNavigation {

	WebDriver driver;
	
	@Given("^user is opening the browser$")
	public void user_is_opening_browser() {
			
	  System.setProperty("webdriver.chrome.driver","D:/ANZ_Workspace/test/driver/chromedriver.exe");
	  driver = new ChromeDriver();
 	  
	}
	
	@When("^user enter's the correct URL'$")
	public void user_enter_s_the_correct_URL() throws Throwable {
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	    
	}

	
	@SuppressWarnings("deprecation")
	@Then("^user is able to navigate to expected page$")
	public void user_is_able_to_navigate_to_expected_page() throws Throwable {
	String title= driver.getTitle().trim();
	Assert.assertEquals("Home loan borrowing power calculator | ANZ",title);
	System.out.println("&&&"+title);	
    driver.close();
	}
	
	
	
	
}
