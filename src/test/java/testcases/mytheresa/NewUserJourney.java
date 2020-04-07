package testcases.mytheresa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class NewUserJourney {

	@Test
	public void accountCreate() {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		

		driver.get("https://www.facebook.com");

		
		driver.close();

	}

	
}
