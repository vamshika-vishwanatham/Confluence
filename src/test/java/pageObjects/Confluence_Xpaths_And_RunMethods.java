package pageObjects;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
public class Confluence_Xpaths_And_RunMethods extends BasePage {
	public ResourceBundle rb=ResourceBundle.getBundle("confluence");
	public Confluence_Xpaths_And_RunMethods(WebDriver driver) {
		super(driver);
	}
	//Login Test Xpaths and Run Methods
	@FindBy(xpath= "//*[@id='os_username']")
	WebElement emailid;
	@FindBy(xpath= "//*[@id='os_password']")
	WebElement password;
	@FindBy(xpath= "//*[@id='loginButton']")
	WebElement login;
	@FindBy(xpath= "//*[@id='os_username']")
	WebElement emailidwrong;
	@FindBy(xpath= "//*[@id='os_password']")
	WebElement passwordwrong;
	@FindBy(xpath= "//*[@id='user-menu-link']/div/div/img")
	WebElement avatar;
	@FindBy(xpath= "//*[@id='logout-link']")
	WebElement logout;
	@FindBy(xpath= "//*[@id=\"login-container\"]/div/form/div[1]")
	WebElement failedlogintext;
	@FindBy(xpath= "//*[@id=\"rw_search_query\"]")
	WebElement SDHomeSearch;
	@FindBy(xpath= "//*[@id=\"search-filter-input\"]")
	WebElement SDHomeEnter;
	@FindBy(xpath= "//*[@id=\"search-result-container\"]/div[2]/a[1]/div[2]/div[1]")
	WebElement SDHomeClick;
	@FindBy(xpath= "//*[@id=\"create-page-button\"]")
	WebElement PlusSign;
	@FindBy(xpath= "//*[@id=\"promoted-link\"]")
	WebElement ShowMore;
	@FindBy(xpath= "//*[@id=\"create-dialog\"]/div/div[1]/div/div[2]/div[2]/div[2]/ol/li[3]/div/div[1]")
	WebElement BlankPage;
	@FindBy(xpath= "//*[@id=\"create-dialog\"]/div/div[2]/button")
	WebElement CreatePage;
	@FindBy(xpath= "//*[@id=\"content-title\"]")
	WebElement PageTitle;
	@FindBy(xpath= "//*[@id=\"tinymce\"]/p/br")
	WebElement PageDescription;
	@FindBy(xpath= "//*[@id='rte-button-publish']")
	WebElement SavingPage;
	@FindBy(xpath= "//*[@id=\"editPageLink\"]/span")
	WebElement EditPage;
	@FindBy(xpath= "//*[@id=\"action-menu-link\"]")
	WebElement ThreeDotsIcon;
	@FindBy(xpath= "//*[@id=\"view-attachments-link\"]")
	WebElement Attachments;
	@FindBy(xpath= "//*[@id=\"edit\"]")
	WebElement Attach;
	@FindBy(xpath= "//*[@id='view-attachments']/table/tbody/tr[2]/td[2]/a")
	WebElement AttachmentClick;
	@FindBy(xpath= "//*[@id=\"cp-container-1\"]/div[1]/div[2]/span[2]/a")
	WebElement AttachmentDownload;
	@FindBy(xpath= "//*[@id=\"cp-container-1\"]/div[1]/div[2]/span[6]/button")
	WebElement AttachmentPageClose;
	@FindBy(xpath= "//div[@class='quick-comment-prompt']")
	WebElement CommentBox;
	@FindBy(xpath= "//*[@title='Rich Text Area']")
	WebElement CommentFrame;
	@FindBy(xpath= "//*[@id='tinymce']/p")
	WebElement CommentBody;
	@FindBy(xpath= "//li[@id='insert-menu']")
	WebElement InsertMenu;
	@FindBy(xpath= "//*[@id=\"jiralink\"]")
	WebElement JiraIssueFilter;
	@FindBy(xpath= "//*[@class='inline']/div/input")
	WebElement IssueKeyFilter;
	@FindBy(xpath= "//button[@class='button-panel-button insert-issue-button']")
	WebElement InsertButton;
	@FindBy(xpath= "//input[@id='versionComment']")
	WebElement VersionComment;
	@FindBy(xpath= "//*[@id='action-view-history-link']")
	WebElement PageHistory;
	@FindBy(xpath= "//table[@id='page-history-container']/tbody/tr")
	List<WebElement> VersionList;
	@FindBy(xpath="//*[@id='viewPageLink']")
	WebElement ViewPage;
	@FindBy(xpath="//a[@title='Internal Articles - Service Desk']")
	WebElement Internal_Articles_Service_Desk;
	@FindBy(xpath="//div/a[@title='JIRA ENTERPRISE APPLICATION SERVICE DESK'][1]")
	WebElement JIRA_ENTERPRISE_APPLICATION_SERVICE_DESK;
	//@FindBy(xpath = "//a[@title='TESTING']")      //Sandbox
	@FindBy(xpath="//a[@title='QA TESTING']")   // PROD
	WebElement QA_Testing;
	@FindBy(xpath="//span[@class='duplicate-title']")
	WebElement DuplicateTitle;
	@FindBy(xpath="//button[@id='rte-button-cancel']")
	WebElement close; 
	@FindBy(xpath="//*[(text() = 'Draft')]")
	WebElement Draft;
	@FindBy(xpath="//iframe[@class='cml-iframe']")
	WebElement WorkFlowFrame;
	@FindBy(xpath="//div[@class=' css-gwngf9']")
	WebElement WorkFlowDropDown;
	@FindBy(xpath="//*[text()='Submit']")
	WebElement submit;
	@FindBy(xpath="//a[text()='Ready']")
	WebElement Ready;
	@FindBy(xpath="//textarea[@name='comment']")
	WebElement WorkFlowComments;
	@FindBy(xpath="//a[@aria-label='Insert link']/span[1]")
	WebElement InsertLink;
	@FindBy(xpath="//input[@name='linkSearch']")
	WebElement LinkSearch;
	@FindBy(xpath="//button[@id='link-browser-insert']")
	WebElement Insert;
	@FindBy(xpath="//input[@id='kb-article-title']")
	WebElement KbArticleTitle;
	@FindBy(xpath="//*[@class='text-placeholder']")
	List<WebElement> DescriptionPlaceholder;
	@FindBy(xpath="//*[text()='Next']")
	WebElement Next;
	@FindBy(xpath="//*[@class='wysiwyg-macro']")
	List<WebElement> TableContent;
	@FindBy(xpath="//*[text()='How-to article']")
	WebElement HowToArticle;
	@FindBy(xpath= "//button[text()='Create']")//*[@id="create-dialog"]/div[2]/div[2]/button[2]
	WebElement CreateButton;
	@FindBy(xpath= "//*[@class='cml-iframe']")
	WebElement ApprovalFrame;
	@FindBy (xpath="//body[@data-id='wysiwygTextarea']/h2")
	List<WebElement> Headings;
	@FindBy(xpath="//body[@data-id='wysiwygTextarea']/p")
	List<WebElement> paragraphs;
	@FindBy(xpath="//body/ol")
	List<WebElement> listPoints;
	@FindBy(xpath="//a[@id='action-remove-content-link']")
	WebElement Delete;
	@FindBy (xpath="//button[@id='delete-dialog-next']")
	WebElement DeleteButton;
	@FindBy(xpath= "//*[@class='text-placeholder']")
	List<WebElement> placeHolder;
	@FindBy(xpath="//*[@id='tinymce']")
	WebElement content;
	@FindBy(xpath="//a[@title='Jira reports']")
	WebElement Jira_reports;
 
	public void LoginTest() throws InterruptedException{
		emailid.sendKeys(rb.getString("emailid"));
		password.sendKeys(rb.getString("password"));
		login.click();
		Thread.sleep(3000);
		System.out.println("Confluence Login Successful");
		System.out.println("***********************************************************************");
	}
	public void avatarTest() {
		avatar.click();
		logout.click();
	}
	public void ValidatingLoginTest(){
		emailidwrong.sendKeys(rb.getString("wrongemailid"));
		passwordwrong.sendKeys(rb.getString("wrongpassword"));
		login.click();
		System.out.println(failedlogintext.getText());
		System.out.println("***********************************************************************");
	}
	public void ServiceDeliveryOperations(){
		SDHomeSearch.click();
		SDHomeEnter.sendKeys(rb.getString("SearchText"));
		SDHomeClick.click();
		Internal_Articles_Service_Desk.click();
		JIRA_ENTERPRISE_APPLICATION_SERVICE_DESK.click();
		QA_Testing.click();
		//driver.get("https://confluenceet-sandbox.cotiviti.com/display/SD/TESTING");
	}
	public void ConfluencePageCreation(){
		PlusSign.click();
		ShowMore.click();
		BlankPage.click();
		CreatePage.click();
	}
	public void PageEdit() throws InterruptedException, AWTException{
		PageTitle.sendKeys(rb.getString("Title"),Keys.ENTER);
		driver.switchTo().frame(CommentFrame);//wysiwygTextarea_ifr
		PageDescription.sendKeys(rb.getString("Description"));
		driver.switchTo().parentFrame();
		SavingPage.click();
		EditPage.click();
		PageTitle.clear();
		PageTitle.sendKeys(rb.getString("EditTile"));
		VersionComment.sendKeys("Updated Title");
		SavingPage.click();
	}
	public void AttachmentCode() throws InterruptedException, AWTException {
		ThreeDotsIcon.click();
		Attachments.click();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//*[@id=\"upload-files\"]/ol/li[1]/div[1]/label"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(5000);
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(5000);
		StringSelection ss= new StringSelection("C:\\Users\\vamshika.vishwanatha\\OneDrive - Cotiviti\\Desktop\\QA error.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		Attach.click();
		Thread.sleep(3000);
		AttachmentClick.click();
		Thread.sleep(3000);
		AttachmentDownload.click();
		Thread.sleep(3000);
		AttachmentPageClose.click();
		System.out.println("Attachment added & downloaded Successfully");
		System.out.println("***********************************************************************");
		ViewPage.click();
	}
	public void CommentsCode() throws InterruptedException {
		CommentBox.click();
		Thread.sleep(7000);
		driver.switchTo().frame(CommentFrame);
		CommentBody.sendKeys("testing comments");
		driver.switchTo().parentFrame();
		SavingPage.click();
		Thread.sleep(3000); 
		System.out.println("Comments added Successfully");
		System.out.println("***********************************************************************");
	}
	public void Integration() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",EditPage);
		//EditPage.click();
		Thread.sleep(4000);
		InsertMenu.click();
		JiraIssueFilter.click();
		IssueKeyFilter.sendKeys("IT-1329149",Keys.ENTER);
		InsertButton.click();
		VersionComment.sendKeys("Linked Jira Ticket");
		Thread.sleep(2000);
		SavingPage.click();
		//driver.navigate().refresh();
	}
	public void PageVersionHistory() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();", ThreeDotsIcon);
		//je.executeScript("window.scrollBy(0,2000)");
		//ThreeDotsIcon.click();
		PageHistory.click();
		System.out.println("Page Version History");
		if(VersionList.size()>=1) {
			for(int i=0; i< VersionList.size();i++)	{		
			System.out.println(VersionList.get(i).getText());
		}
		}
		ViewPage.click();
	}
	public void DuplicatePageCreation() throws InterruptedException, IOException {
		ServiceDeliveryOperations();
		ConfluencePageCreation();
		PageTitle.sendKeys(rb.getString("EditTile"));
		SavingPage.click();
		Thread.sleep(3000);
		System.out.println("***********************************************************************");
		System.out.println("Validation Message: " + DuplicateTitle.getText());
		System.out.println("***********************************************************************");
		if(DuplicateTitle.getText().contains(rb.getString("DuplicateTitleError"))){
			close.click();
		}

	}
	public void ConfluenecePageLink() throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();",EditPage );
		//Thread.sleep(3000);
		//EditPage.click();
		Thread.sleep(4000);
		InsertLink.click();
		Thread.sleep(2000);
		LinkSearch.sendKeys(rb.getString("ConfluencePageTitle"));
		Thread.sleep(2000);
		LinkSearch.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
		Insert.click();
		SavingPage.click();
	}
	public void DocumentApprovalFlow() throws InterruptedException, AWTException {
		Draft.click();
		Thread.sleep(3000);
		driver.switchTo().frame(WorkFlowFrame);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click();", submit);
		driver.switchTo().parentFrame();
		String CurrentPageurl = driver.getCurrentUrl();
		driver.get(CurrentPageurl+"?admin=true");
		Thread.sleep(5000);
		Ready.click();
		driver.switchTo().frame(WorkFlowFrame);
		Thread.sleep(3000);
		WorkFlowComments.sendKeys(rb.getString("Reviewed"));
		submit.click();     //reviewed
		Thread.sleep(6000);
		WorkFlowComments.click();
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(6000);
		WorkFlowComments.sendKeys(rb.getString("publish"));
		submit.click();     //publish
		driver.switchTo().parentFrame();
		driver.navigate().refresh();
	}
	public void ComalaPageEdit() throws InterruptedException, AWTException{
		driver.switchTo().frame(CommentFrame);//wysiwygTextarea_ifr
		content.clear();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		SavingPage.click();
		EditPage.click();
		driver.switchTo().frame(CommentFrame);//wysiwygTextarea_ifr
		PageDescription.sendKeys(rb.getString("Description"));
		driver.switchTo().parentFrame();
		SavingPage.click();
		EditPage.click();
		PageTitle.clear();
		PageTitle.sendKeys(rb.getString("ComalaEditTile"));
		VersionComment.sendKeys("Updated Title");
		SavingPage.click();
	}
	public void ComalaPageCreation(){
		PlusSign.click();
		HowToArticle.click();
		Next.click();
		KbArticleTitle.sendKeys(rb.getString("ComalaTitle"));
		CreateButton.click();
	}
	//table[@class='wysiwyg-macro']
	public void PermissionCheckPageCreation() throws InterruptedException {
		Jira_reports.click();
		PlusSign.click();
		HowToArticle.click();
		Next.click();
		KbArticleTitle.sendKeys(rb.getString("ComalaPermissionCheckTitle"));
		CreateButton.click();
		Thread.sleep(5000);
		SavingPage.click();
		Thread.sleep(3000);
	}
	public void WorkFlowPermission() {
		try {
			Assert.assertEquals("Draft", Draft.getText());
		} catch (Exception e) {
			System.out.println("Report Error" + e);
		}
	}
	  public void pageDelete() throws InterruptedException { 
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].click();", ThreeDotsIcon); 
		Delete.click(); 
		Thread.sleep(1000); 
		DeleteButton.click(); 
		}
}		