package steps;

 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.BankingHomePage;
import pagess.SavingsHomePage;
import pagess.TestBase;

 
public class SavingsTest  extends TestBase{

	
		SharedSteps s;
		BankingHomePage Bankcomponent;
		SavingsHomePage Savingscomponent;
 

		
		
	@Given("I open the banking website")
			
			
public void i_open_the_banking_website() throws Throwable{
		driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		 
		
	}
		
	@When("I enter Username and password")	
	public void  i_enter_username_and_password() throws Throwable{
		

		Bankcomponent = PageFactory.initElements(driver,BankingHomePage.class);
		Savingscomponent = PageFactory.initElements(driver,SavingsHomePage.class);

		Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_");
	}
 		
		
		
 @Test
public void openwebsite() throws Throwable{
    
	 
	driver =new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dbankdemo.com/bank");

	Bankcomponent = PageFactory.initElements(driver,BankingHomePage.class);
	Savingscomponent = PageFactory.initElements(driver,SavingsHomePage.class);

	Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_");
	  
		Savingscomponent.clickthemenu();
		Savingscomponent.clickTheSavings();
		Savingscomponent.clickTheViewSavings();
		Savingscomponent.searchTransactionDetails();
}
@Test

public void  entercredentials() throws Throwable{
	Bankcomponent = PageFactory.initElements(driver,BankingHomePage.class);
	Savingscomponent = PageFactory.initElements(driver,SavingsHomePage.class);

	Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_");
   
}


 
@Then("I click on the Sign in buttton")
public void i_click_on_the_sign_in_buttton() throws Throwable{
	driver.findElement(By.id("submit")).click();
	Savingscomponent.clickthemenu();}
  
@Then("I click on the Savings tab")
public void i_click_on_the_savings_tab() throws Throwable {
    Savingscomponent.clickTheSavings();
}

@Then("I click on the 	view savings option")
public void i_click_on_the_view_savings_option() throws Throwable {
    Savingscomponent.clickTheViewSavings();
}

@Then("I should see the Savings account Screen")
public void i_should_see_the_savings_account_screen()  throws Throwable{
    Savingscomponent.searchTransactionDetails();
}

@Then("I should search transcation in the search option")
public void i_should_search_transcation_in_the_search_option()  throws Throwable {
 
}
	@After
	
	public void teardown(Scenario scenario) {
	
	    
		   
		   {
		   
		   
		   TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		   byte [] scrennshot = takescreenshot.getScreenshotAs(OutputType.BYTES);
		   
		   scenario.attach (scrennshot,"image/png","Failed Taking Screenshot");
		   }
		driver.quit();
	
	
	
	}
	
	
}
