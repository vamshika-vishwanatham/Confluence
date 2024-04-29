package testBase;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
 
public class BaseClass {
	public static WebDriver driver;
	public ResourceBundle rb;
	@BeforeClass
	public void Confluence_Login() {
	    rb=ResourceBundle.getBundle("confluence");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("appURL"));  //Reading Data From Properties File.
		driver.manage().window().maximize();
	}

	public void Refresh() throws InterruptedException {
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.navigate().refresh();
 
	}
	public void BackToLogin() throws InterruptedException {
		driver.get(rb.getString("appURL"));
}
	public String captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver; 
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		try 
		{
			FileUtils.copyFile(source, new File(destination)); 
		} 
		catch (Exception e) 
		{ 
			e.getMessage(); 
		} 
		return destination;
	}

}