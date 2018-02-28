package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	
	public CreateLeadPage enterFirstName(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		enterById("createLeadForm_lastName", lName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
	}
	
	public ViewLeadPage clickCreateSubmit() {
		clickByName("submitButton");
		return new ViewLeadPage(driver, test);
	}
	
	

}
