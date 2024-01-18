//package steps;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
// 
//import org.testng.annotations.Test;
//
//import io.cucumber.java.Before;
// 
//import listeners.TestBase;
//import pagess.BankingHomePage;
//import pagess.SavingsHomePage;
//
//public class tsttttt extends TestBase {
//	
//WebDriver driver;
//SharedSteps s;
//
// 
//BankingHomePage Bankcomponent;
//SavingsHomePage Savingscomponent;
//
//
// 
//@Before()
//public void setUp() {
//	
//	
//	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriverwin64\\chromedriver.exe");
//	driver = new ChromeDriver();
//	
//	
//}
// 
// 
//
//	@Test
//	public void OpenDemoStore() {
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("http://dbankdemo.com/bank/login");
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		 
//	}
//	
//	@Test
//	public void OpenWebsite() {
//		 
//		    
//		   
//
//		
//	}
//	
//	@Test
//
// 
//public void ukk()  {
//	
//
//		 
//		Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_" );
//		
//	}
//
//   @Test
//   public void Savingsopen() {
//	   
//		Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_" );
//		Bankcomponent = PageFactory.initElements(driver,BankingHomePage.class);
//		Savingscomponent = PageFactory.initElements(driver,SavingsHomePage.class);
//		 
//	   
//		Savingscomponent.clickthemenu();
//   }
//
//public WebDriver getDriver() {
//	
//	
//	return driver;
//	
//	
	

}