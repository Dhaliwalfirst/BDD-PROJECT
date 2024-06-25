package StepDefinations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import util.Utilities;

public class Filtersortpagesteps {
	Utilities utilities = new Utilities();
WebDriver driver;
private WebElement[] customerRating;


	
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
		
	@When("User click on searchbtn")
	public void user_click_on_searchbtn() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	@When("sort product by new arrival option")
	public boolean sort_product_by_new_arrival_option( ) {
 Utilities.selectByvalue(driver.findElement(By.xpath("//select[@id='s-result-sort-select']")), "Newest arrivals");
         
         ArrayList<String> list = new ArrayList<>(4);
		for (WebElement e : customerRating) {
			String rating = e.getText();
			list.add(rating);
		}
		List<String> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l);
		boolean store = list.equals(l);
		return store;
	}
	
	
	
	@When("sort product by High to Low")
	public void sort_product_by_High_to_Low() {
	    List<WebElement>beforeFilterPrice = driver.findElements(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole']"));
	    		List<Double>beforeFilterPriceList = new ArrayList<>();
	    	for(WebElement p: beforeFilterPrice){
	    		beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
	    		
	    	Select dropdown = new Select(driver.findElement(By.xpath("//span[normalize-space()='Sort by:']")));	    	
	    	dropdown.selectByValue("Price: low to high");
	  
	    	List<WebElement>afterFilterPrice = driver.findElements(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//span[@class='a-price-whole']"));
	    		
	    	List<Double>afterFilterPriceList= new ArrayList<>(4);
	    	for(WebElement r: afterFilterPrice){
	    		afterFilterPriceList.add(Double.valueOf(r.getText().replace("$", "")));
	    		
	    		Collections.sort(beforeFilterPriceList);
	    		Assert.assertEquals(beforeFilterPriceList,afterFilterPriceList);
	}	
	    	
	    	
	
	    	}}}
			
		

			
			
	
	
