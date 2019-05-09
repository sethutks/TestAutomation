package steps;

import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {
	
	private Map<String, String> credentials;
	
	@Given("User navigates to the (.*) Application")
	public void setAppName(String appName) {
		if(appName.equals("leaftaps")) {
			getDriver().get("http://leaftaps.com/opentaps/control/main");
		}else {
			getDriver().get("http://leaftaps.com/opentaps/control/main");
		}
	}
	
	@Given("User prompts the credentials in the Login page")
	public void user_prompts_the_credentials_in_the_Login_page_of_flipkart(Map<String, String> credListFromFF) {
		this.credentials = credListFromFF;
		getDriver().findElementById("username").sendKeys(credentials.get("user_name"));
		getDriver().findElementById("password").sendKeys(credentials.get("password"));
		
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		getDriver().findElementByClassName("decorativeSubmit").click();
	}

}
