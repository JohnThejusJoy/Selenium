package base;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ScreenshotUtility;

public class TestNGBase {
	public WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser(){
		ChromeOptions options = new ChromeOptions();//Change settings within Chrome
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(options);
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
	//	driver.close();//tab
	//	driver.quit();//window
	}
	@AfterMethod(alwaysRun = true)//alwaysRun = true: @AfterMethod must run in every scenario
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		//ITestResult: predefined interface having all info regarding test data
		if(iTestResult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			//iTestResult.getName: Returns name of test method
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
