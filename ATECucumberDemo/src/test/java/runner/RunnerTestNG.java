package runner;
//
//import org.junit.runner.RunWith;
 

 
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith (Cucumber.class)

@CucumberOptions(features = "C:\\Users\\master\\aa\\AssignmentSelenium\\ATECucumberDemo\\src\\test\\java\\features\\Savings.feature",

		glue = { "steps"  }, plugin = { "html:target/Cucumberreport.html", "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" })
public class RunnerTestNG extends AbstractTestNGCucumberTests{

	
	
//	
//	@BeforeClass
//	public static void  beforeclass() {
//		
//		
//		
//		
//	}
//	
//	@AfterClass
//	public static void afterclass() {
//		
//		
//		
//		
//	}
}


