package steps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class CucumberAnnotations extends BaseClass {
	
	private int i=1;
	
	@Before
	public void initScenario(Scenario sc) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver.set(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@After
	public void endScenario(Scenario sc) {
		getDriver().quit();
	}
	
	@BeforeStep
	public void beforeEachStep() {
		
	}
	
	@AfterStep
	public void AfterEachStep() {
		File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			//Do nothing
		}
		finally {
			i++;
		}
	}

}
