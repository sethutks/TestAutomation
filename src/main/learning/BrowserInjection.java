package learning;

import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class BrowserInjection {
	
	@Test
	public void browserPage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		//op.addArguments("--start-maximized");
		op.addArguments("--window-position=100,600");
		ChromeDriver driver = new ChromeDriver(op);
		//driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement userName = driver
				.findElementById("username");
		userName.sendKeys("DemoSalesManager", Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit")
		.click();
		String title = driver.getTitle();
		System.out.println(title);
		String version = driver.getCapabilities().getVersion();
		System.out.println(version);
		//moz:firefoxOptions
		Object capability = driver.getCapabilities().getCapability("goog:chromeOptions");
		@SuppressWarnings("unchecked")
		Map<String, Object> cap = (Map<String, Object>) capability;
		Object object = cap.get("debuggerAddress");
		System.out.println(object.toString());
		
		
		
	}
	
	
	

}
