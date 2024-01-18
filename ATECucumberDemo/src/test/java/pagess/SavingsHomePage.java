package pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsHomePage {

	
	
	 


	@FindBy(xpath="//a[@class='nav-link'][normalize-space()='Create Data']")
		    static WebElement createdata;
		@FindBy(xpath ="//img[@alt='User Avatar']")
 
		static WebElement menu;
		 
		 
		@FindBy(xpath = "//a[@id='savings-menu'][@class='dropdown-toggle'][normalize-space()='Savings']")
	    static WebElement savings;
	
		 
		@FindBy(xpath = "//a[@id='view-savings-menu-item'][normalize-space()='View Savings']")
	    static WebElement savingsView;
		
		@FindBy(xpath = "//input[@class='form-control form-control-sm']")
		static WebElement SearchTransaction;
		
		

		public void clickTheCreateData() {
		
		
		createdata.click();
		}

		public void clickthemenu() {
			
			
			menu.click();
		
		
	}

		

		public void clickTheSavings() {
		
		
		savings.click();
		}
		
		
		

		public void clickTheViewSavings() {
		
		
		savingsView.click();
		}
	
		
		public void searchTransactionDetails() {
			
			SearchTransaction.sendKeys("11112.18");
			
		}
		
		
		
		
		
		
		
		
		
		
		
}
