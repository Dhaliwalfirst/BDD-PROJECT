package StepDefinations;
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Utilities;

public class Shoppingcartpagesteps {
	Utilities utilities = new Utilities();
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
	@When("user move to searchbox and enter {string}")
	public void user_move_to_searchbox_and_enter(String product) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iwoly vacuum");
	}
		
	@And("User click on searchbtn")
	public void user_click_on_searchbtn() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@And("click on product to buy")
	public void click_on_product_to_buy() {
		driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(text(),'Cordless Vacuum Cleaner Rechargeable, 18000Pa Powe')]")).click();
	    
	}
	@When("Select the quantity")
	public void select_the_quantity() {
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	
	}
}*/