package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	WaitUtility waitUtility = new WaitUtility();
	public WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement adminbtn;
public void adminButton() {
	waitUtility.waitUntilClickable(driver, adminbtn);
	adminbtn.click();
}
@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']") WebElement logoutbtn;
public void logOut() {
	waitUtility.waitUntilClickable(driver, logoutbtn);
	logoutbtn.click();
}
}
