package testCases;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.testng.annotations.Test;

import pageObjects.Confluence_Xpaths_And_RunMethods;
import testBase.BaseClass;

public class Atlassian_SmokeTest_Confluence extends BaseClass {
	public ResourceBundle rb = ResourceBundle.getBundle("confluence");

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException, AWTException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// LoginRun.LoginTest();
		// LoginRun.avatarTest();
		// Thread.sleep(5000);
		LoginRun.ValidatingLoginTest();
		BackToLogin();
		LoginRun.LoginTest();
		System.out.println("Login and Invalid Login validation Completed");
		System.out.println("******************************************************");
		//Thread.sleep(35000);
		}

	@Test(priority = 2)
	public void Page_Creation() throws InterruptedException {

		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.ServiceDeliveryOperations();
		LoginRun.ConfluencePageCreation();
		System.out.println("Comala Page Created");
	}

	@Test(priority = 3)
	public void Page_Updates() throws InterruptedException, AWTException {
		Confluence_Xpaths_And_RunMethods LoginRun = new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.PageEdit();
		Thread.sleep(3000);
		LoginRun.AttachmentCode();
		LoginRun.CommentsCode();
		LoginRun.Integration();
		LoginRun.PageVersionHistory();
	}
	
	@Test(priority = 4)//dependsOnMethods = "Page_Updates"
	public void DuplicatePageCreationCheck() throws InterruptedException, IOException {
		Confluence_Xpaths_And_RunMethods LoginRun=new Confluence_Xpaths_And_RunMethods(driver);
		LoginRun.DuplicatePageCreation();
	}
}