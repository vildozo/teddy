package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test_Steps {
	
		
	@BeforeClass
    public static void setUp(){
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/home/jv/Desktop/SeleniumBrowserDrivers/browserMozila/geckodriver");	       
    }
	
	
	

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		//MozillaFirefox.configure();
		System.setProperty("webdriver.gecko.driver", "/home/jv/Desktop/SeleniumBrowserDrivers/browserMozila/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
		driver.get("http://www.store.demoqa.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://store.demoqa.com/products-page/your-account/");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/home/jv/Desktop/SeleniumBrowserDrivers/browserMozila/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.id("log")).sendKeys("Jav.Vil"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("@prender1");
	    driver.findElement(By.id("login")).click();
		}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
//
//	@When("^User LogOut from the Application$")
//	public void user_LogOut_from_the_Application() throws Throwable {
//		System.setProperty("webdriver.gecko.driver", "/home/jv/Desktop/SeleniumBrowserDrivers/browserMozila/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
//	}
//
//	@Then("^Message displayed Logout Successfully$")
//	public void message_displayed_Logout_Successfully() throws Throwable {
//		System.setProperty("webdriver.gecko.driver", "/home/jv/Desktop/SeleniumBrowserDrivers/browserMozila/geckodriver");
//		//WebDriver driver = new FirefoxDriver();
//        System.out.println("LogOut Successfully");
//	}

}