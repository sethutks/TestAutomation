package steps;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {

	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

	public RemoteWebDriver getDriver() {
		return driver.get();
	}

}
