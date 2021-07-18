package step_definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BorrowEstimator {
      
	WebDriver driver;
	String ExpectedURL= "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";
	
	@Given("^user is in calculator page$")
	public void user_is_in_calculator_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:/ANZ_Workspace/test/driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
	Assert.assertEquals(ExpectedURL, driver.getCurrentUrl());	
		
	}

	@When("^a person is single$")
	public void a_person_is_single() throws Throwable {
	driver.findElement(By.xpath("//label[@for='application_type_single']")).click();;
	
	}

	@When("^person has (\\d+) dependants,$")
	public void person_has_dependants(int arg1) throws Throwable {
	    
	Select selectDependants = new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
	selectDependants.selectByIndex(0);
		
	}

	@When("^person is	buying a home to live in,$")
	public void person_is_buying_a_home_to_live_in() throws Throwable {
	driver.findElement(By.xpath("//label[@for='borrow_type_home']")).click();
	
	}
	
	
	@When("^person with income of \\$(\\d+),(\\d+),$")
	public void person_with_income_of_$(int arg1, int arg2) throws Throwable {
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).sendKeys("80000");
	 
	}
	
	@When("^person has other income \\$(\\d+),(\\d+),$")
	public void person_has_other_income_$(int arg1, int arg2) throws Throwable {
	driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).sendKeys("10000");
	
	}
	
	
	@When("^person's living expenses \\$(\\d+),$")
	public void person_s_living_expenses_$(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).sendKeys("500");
	}
	
	@When("^person's current home loan repayments \\$(\\d+),$")
	public void person_s_current_home_loan_repayments_$(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).sendKeys("0");
	}
	
	@When("^person's other loan repayments \\$(\\d+),$")
	public void person_s_other_loan_repayments_$(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).sendKeys("100");
			
	}
  
	@When("^person's other commitments \\$(\\d+)$")
	public void person_s_other_commitments_$(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).sendKeys("0");
	}
	
	@When("^person's total credit card limits \\$(\\d+),(\\d+)$")
	public void person_s_total_credit_card_limits_$(int arg1, int arg2) throws Throwable {
		driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).sendKeys("10,000");
		 
	}

	@SuppressWarnings("deprecation")
	@Then("^person's borrowing capacity would be \\$(\\d+),(\\d+)\\.$")
	public void person_s_borrowing_capacity_would_be_$(int arg1, int arg2) throws Throwable {	
	driver.findElement(By.xpath("//button[contains(@id,'btnBorrowCalculater')]")).click();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	Thread.sleep(4000);
	String borrowCapacity=driver.findElement(By.xpath("//span[@id='borrowResultTextAmount']")).getText();
	System.out.println("*&&&^^^"+borrowCapacity);
	Assert.assertEquals(borrowCapacity,"$507,000");
	
	}
	

   @SuppressWarnings("deprecation")
@Given("^start over button is visible and active$")
   public void start_over_button_is_visible_and_active() throws Throwable {
    List<WebElement>  btnStartOver = driver.findElements(By.xpath("//span[@class='icon icon_restart']"));
	   
	Assert.assertTrue(btnStartOver.get(0).isDisplayed());
	Assert.assertTrue(btnStartOver.get(0).isEnabled());  
   }

   @When("^user clicks start over button$")
   public void user_clicks_start_over_button() throws Throwable {
   List<WebElement>  btnStartOver = driver.findElements(By.xpath("//span[@class='icon icon_restart']"));
   btnStartOver.get(0).click();
	   
   }

   @SuppressWarnings("deprecation")
@Then("^form fields values get cleared$")
   public void form_fields_values_get_cleared() throws Throwable {
 
	   
	String fieldValue =    driver.findElement(By.xpath("//input[@aria-labelledby='q2q1']")).getAttribute("value");
	String fieldValueOtherIncome = driver.findElement(By.xpath("//input[@aria-labelledby='q2q2']")).getAttribute("value");
	String fieldValueLivingExpense = driver.findElement(By.xpath("//input[@aria-labelledby='q3q1']")).getAttribute("value");
	String fieldValuecurrentHomeLoanPayment =driver.findElement(By.xpath("//input[@aria-labelledby='q3q2']")).getAttribute("value");
	String fieldValueOtherHomeLoanPayment =driver.findElement(By.xpath("//input[@aria-labelledby='q3q3']")).getAttribute("value");
	String fieldValueOtherCommitments = driver.findElement(By.xpath("//input[@aria-labelledby='q3q4']")).getAttribute("value");
	String fieldValueCreditCardLimits = driver.findElement(By.xpath("//input[@aria-labelledby='q3q5']")).getAttribute("value");
   	
	Assert.assertEquals(fieldValue,"0");
	Assert.assertEquals(fieldValueOtherIncome,"0");
	Assert.assertEquals(fieldValueLivingExpense,"0");
	Assert.assertEquals(fieldValuecurrentHomeLoanPayment,"0");
	Assert.assertEquals(fieldValueOtherHomeLoanPayment,"0");
	Assert.assertEquals(fieldValueOtherCommitments,"0");
	Assert.assertEquals(fieldValueCreditCardLimits,"0");
	
	driver.close();
   
   }
	
	
	
	
}
