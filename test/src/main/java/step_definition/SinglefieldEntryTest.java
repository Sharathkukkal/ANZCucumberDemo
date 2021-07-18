package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })
public class SinglefieldEntryTest {

	WebDriver driver;
	String expectedURL= "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";	
    String expectedResponseText ="Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
@SuppressWarnings("deprecation")
@Given("^user is in borrow calculator page$")
public void user_is_in_borrow_calculator_page() throws Throwable {
  
	System.setProperty("webdriver.chrome.driver","D:/ANZ_Workspace/test/driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	Assert.assertEquals(expectedURL, driver.getCurrentUrl());
	
}

   @When("^user enter's '\\$(\\d+)' in the living expense field\\.$")
    public void user_enter_s_$_in_the_living_expense_field(int arg1) throws Throwable {
    
	  driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("1");
	  
   }

   @When("^user leves other field value as zero\\.$")
   public void user_leves_other_field_value_as_zero() throws Throwable {
    
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("0");
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("0");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("0");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("0");
	driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");
    }

    @When("^user click's Work out how much I could borrow button$")
    public void user_click_s_Work_out_how_much_I_could_borrow_button() throws Throwable {
  
	driver.findElement(By.xpath("//button[contains(@id,'btnBorrowCalculater')]")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	Thread.sleep(2000);
    }

      @Then("^user is able to view the expected message in application$")
      public void user_is_able_to_view_the_expected_message_in_application() throws Throwable {
      
      String responseTxt = driver.findElement(By.xpath("//span[@class='borrow__error__text']")).getText().trim();
      Assert.assertEquals(responseTxt,expectedResponseText);
    
      driver.close();
   
}

	
	
	
}
