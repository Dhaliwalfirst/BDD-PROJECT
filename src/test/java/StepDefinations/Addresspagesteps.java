package StepDefinations;
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addresspagesteps {
	
	
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

	@Then("return AccountPage")
	public void return_account_page() {
	    
	}
	@Then("click on YourAddress")
	public void click_on_your_address() {
		driver.findElement(By.xpath("//h2[normalize-space()='Your Addresses']")).click();
		
	}

	@And("click on addaddress")
	public void click_on_addaddress() {
		driver.findElement(By.cssSelector((".a-box.first-desktop-address-tile"))).click();
	   
	}

	@Then("click on Country")
	public void click_on_country() {
		Actions action	= new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@id='address-ui-widgets-countryCode']//span[@role='button']"))).build().perform();
		}
	
	

	@Then("add full name")
	public void add_full_name() {
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).clear();
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("Prabhjotkaur");
	}

	@Then("add phone number")
	public void add_phone_number() {
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("6474105250");
	}

	@Then("add address")
	public void add_address() {
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("82 sedgegrass way");
	}

	@Then("add city")
	public void add_city() {
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Brampton");
	}
	
	@Then("add province")
	public void add_province() {
		Actions action	= new Actions (driver);
	//action.moveToElement(driver.findElement(By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']//span[@role='button']"))).build().perform();
	action.moveToElement(driver.findElement(By.cssSelector("span[id='address-ui-widgets-enterAddressStateOrRegion'] span[role='button']"))).build().perform();
	}

	@Then("select province")
	public void select_province() {
	//	driver.findElement(By.xpath("//span[@id='address-ui-widgets-enterAddressStateOrRegion']")).click();
		driver.findElement(By.cssSelector("span[id='address-ui-widgets-enterAddressStateOrRegion'] span[role='button']")).click();	}
	
	@Then("add postalcode")
	public void add_postalcode() {
	    driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("L6R 3E3");
	    
	}


	@Then("click on add address")
	public void click_on_add_address() {
		driver.findElement(By.id("address-ui-widgets-use-as-my-default")).click();
	 }   
	}

*/	
	
	
	


