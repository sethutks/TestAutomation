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

public class AttachBrowser {
	
	@Test
	public void browserPage() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("debuggerAddress", "localhost:52433");
		ChromeDriver driver = new ChromeDriver(op);
		driver.findElementByLinkText("Create Lead").click();
		
		
		
	}
	
	
	

}
