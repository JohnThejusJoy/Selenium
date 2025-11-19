package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.WaitUtility;

public class AdminPage {
	WaitUtility waitUtility = new WaitUtility();
	
public WebDriver driver;
public AdminPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement manageadmininfo;
public void adminInfo() {
	manageadmininfo.click();
}
@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newadmin;
public void newAdmin() {
	waitUtility.waitUntilClickable(driver, newadmin);
	newadmin.click();
}
@FindBy(xpath = "//input[@type='text' and @class='form-control' and @id='username']") WebElement adminusername;
public void adminUsername(String username) {
	adminusername.sendKeys(username);
}
@FindBy(xpath = "//input[@type='password' and @class='form-control' and @id='password']") WebElement adminpassword;
public void adminPassword(String password) {
	adminpassword.sendKeys(password);
}
@FindBy(xpath = "//select[@class='form-control' and @id='user_type']") WebElement dropdown;
public void adminDropdown() {
	Select select = new Select(dropdown);
	select.selectByVisibleText(Constant.ADMINNAME);
}
@FindBy(xpath = "//button[@type='submit' and @class='btn btn-block-sm btn-danger' and @name='Create']") WebElement savebtn;
public void adminSave() {
savebtn.click();
}
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public boolean isAlertDisplayed() {
	return alert.isDisplayed();
}
}
