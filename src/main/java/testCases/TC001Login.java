package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001Login extends LeafTapsWrappers{
	
	@BeforeClass
	public void initialize() {
		testCaseName = "TC001Login";
		testDescription = "Login Positive";
		category = "Smoke";
		authors= "Sethu";
		browserName = "chrome";
		dataSheetName ="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void doLogin(String username, String passwd, String verifyName) {
		new LoginPage(driver, test)
		.enterUserName(username)
		.enterPassword(passwd)
		.clickLogin()
		.verifyLoginName(verifyName);
	}

}
