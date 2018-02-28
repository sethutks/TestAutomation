package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC002CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void initialize() {
		testCaseName = "TC003CreateLead";
		testDescription = "CreateLead with Mandate Steps";
		category = "Smoke";
		authors = "Sethu";
		browserName = "chrome";
		dataSheetName = "TC003";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(String username, String passwd, String cName, String fName, String lName) {
		new LoginPage(driver, test)
		.enterUserName(username)
		.enterPassword(passwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateSubmit()
		.verifyFname(fName);
	}
}
