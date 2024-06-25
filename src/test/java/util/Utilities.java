package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
	public static void selectByvalue(WebElement element, String value) {
		Select select = new Select(element);
	
		select.selectByVisibleText(value);
	}

	public static void selectByVisibleText(WebElement element, String string) {
		Select select = new Select(element);
		select.selectByValue(string);
		
	}

	public static void selectByvalue1(WebElement element, String value1) {
		Select select = new Select(element);
		
		select.selectByValue(value1);
		
	}
	

	}

	

	
		
	
	
	

	
		
	


