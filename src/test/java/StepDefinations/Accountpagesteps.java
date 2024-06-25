package StepDefinations;
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accountpagesteps {
	
WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");   
	}
   
	
	@When("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click(); 
	}
	
	@Then("return Homepage")
	public void return_homepage() {    
	}
	
	@When("user moves to accountslists")
	public void user_moves_to_accountslists() {
		Actions action	= new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']//span[@class='nav-icon nav-arrow']"))).build().perform();  
		}   
	

	@When("click on youraccounts")
	public void click_on_youraccounts() {
		driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click() ; 
		}


	@When("click on your order")
	public void click_on_your_order() {
	driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")).click();	    
	}

	@Then("return Orderpage")
	public void return_orderpage() {
	    
	}
	
	@When("click on youraccount")
	public void click_on_youraccount() {
		Actions action	= new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']//span[@class='nav-icon nav-arrow']"))).build().perform();  
		   
	   driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click() ; 
	   
	   }

	@When("click on Yourpayments")
	public void click_on_yourpayments() {
		driver.findElement(By.xpath("//div[@data-card-identifier='PaymentOptions']//div[@class='a-box-inner']")).click();
	   
	}
	@When("click on youraddress")
	public void click_on_youraddress() {
		Actions action	= new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']//span[@class='nav-icon nav-arrow']"))).build().perform(); 
		driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click() ; 
	driver.findElement(By.xpath("//a[@href='https://www.amazon.ca/a/addresses?ref_=ya_d_c_addr']//div[@class='a-box ya-card--rich']")).click();
	 
	}

	@Then("Close the page")
	public void close_the_page() {
		driver.quit();
	}
	    

}
	    
*/	

