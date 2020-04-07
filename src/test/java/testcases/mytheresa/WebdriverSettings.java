
package testcases.mytheresa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naresh.nadimpalli\\azuredevops\\maven-selenium-webdriver-testng-example-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
