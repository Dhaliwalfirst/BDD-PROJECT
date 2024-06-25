package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	
	
	WebDriver driver;
	
	@FindBy (id="ap_email")
	WebElement email;
	
	@FindBy (id="continue")
	WebElement Continue;
	
	@FindBy (id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	
	/*By txt_username=By.id("ap_email");
	
	By btn_continue=By.id("continue");
	
	By txt_password=By.id("ap_password");
	
	By Btn_signin=By.id("signInSubmit");*/
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enteremail(String username) {
		email.sendKeys(username);
		Continue.click();	
	}
	
	public void enterpassword(String passwrd) {
		password.sendKeys("passwrd");
		signinbutton.click();	
	}	
}
			
	
	
	
	


