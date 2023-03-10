package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Annotations {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser", true);
	}
	@BeforeMethod
	public void LogintoApp() {
		Reporter.log("Login to App", true);
	}

	@Test
	public void verifyText() {
		Reporter.log("Running Actual test case", true);
	}

	@AfterMethod
	public void LogoutApp() {
		Reporter.log("Logout From app", true);
		}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("Close browser", true);
	}
	}