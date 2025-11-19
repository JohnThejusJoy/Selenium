package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {
	WaitUtility waitUtility = new WaitUtility();
	PageUtility pageUtility = new PageUtility();
	public WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement adminbtn;
public void adminButton() {
	waitUtility.waitUntilClickable(driver, adminbtn);
pageUtility.clickOnElement(adminbtn);
}
@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']") WebElement logoutbtn;
public void logOut() {
	waitUtility.waitUntilClickable(driver, logoutbtn);
	pageUtility.clickOnElement(logoutbtn);
}
}
