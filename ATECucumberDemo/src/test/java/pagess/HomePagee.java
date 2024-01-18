package pagess;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagee {

	
 WebDriver driver;
	
	@FindBy(id="username")
    static WebElement TxtBox_UserName;
	
	

	@FindBy(id="password")
    static WebElement TxtBox_Password;
    
    
    
    
 
    

	@FindBy(id="submit")
    static WebElement Btn_Login;

 
	
	
	 

	 
	 
	
	
	  

 
	
	public void enterUsername(String s)
	{
		
		
		TxtBox_UserName.sendKeys(s);
	}
	public void enterPassword(String P)
	{
		
		
		TxtBox_UserName.sendKeys(P);
	}
	 
	public void enterLoginDetails(String u, String y) {
		
		
		TxtBox_UserName.sendKeys(u);
		TxtBox_Password.sendKeys(y);
		Btn_Login.click();
		
		
		
		
		
		
	} 
	
	
	public boolean validate_username() {
		
		
		
		
		return TxtBox_UserName.getText().isBlank();
	}
	 
	public boolean validate_password()
	{ 
//		return TxtBox_Password.isDisplayed();
		return TxtBox_Password.getText().isEmpty();
	}
	
	public boolean validate_signin()
	{
		return Btn_Login.isDisplayed();
	}
	
	 

	public HomePagee(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	
	}
	 
	 	
	
	
	
	 
	
	
}
