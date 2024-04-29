package testCases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.Confluence_Xpaths_And_RunMethods;
import testBase.BaseClass;

public class Comala_SmokeTest_Confluence extends BaseClass {
	public ResourceBundle rb = ResourceBundle.getBundle("confluence");

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException, AWTException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginRun.LoginTest();
		System.out.println("Login and Invalid Login validation Completed");
	}

	@Test(priority = 2)
	public void pageCreation() throws InterruptedException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.ServiceDeliveryOperations();
		LoginRun.ComalaPageCreation();
		System.out.println("Comala Page Created");
	}

	@Test(priority = 3)
	public void pageUpdates() throws InterruptedException, AWTException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.ComalaPageEdit();
		LoginRun.AttachmentCode();
		LoginRun.CommentsCode();
		LoginRun.ConfluenecePageLink();
		LoginRun.PageVersionHistory();
	}

	@Test(priority = 4)
	public void AppovalFlow() throws InterruptedException, IOException, AWTException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.DocumentApprovalFlow();
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	public void PermissionPageCreation() throws InterruptedException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.PermissionCheckPageCreation();
		LoginRun.WorkFlowPermission();
	}
}