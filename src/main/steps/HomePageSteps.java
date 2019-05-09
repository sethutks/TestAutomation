package steps;

import cucumber.api.java.en.Then;

public class HomePageSteps extends BaseClass {

	@Then("user should be able to navigate to Home page")
	public void user_should_be_able_to_navigate_to_Home_page() {
	    System.out.println("Navigated to Home Page");
	}

}
