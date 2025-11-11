package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
public WebDriver driver;
public AdminPage(WebDriver driver) {
	this.driver = driver;
}
public void adminInfo() {
	WebElement manageadmininfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
	manageadmininfo.click();
}
public void newAdmin() {
	WebElement newadmin = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newadmin.click();
}
public void adminUsername(String username) {
	WebElement adminusername = driver.findElement(By.xpath("//input[@type='text' and @class='form-control' and @id='username']"));
	adminusername.sendKeys(username);
}
public void adminPassword(String password) {
	WebElement adminpassword = driver.findElement(By.xpath("//input[@type='password' and @class='form-control' and @id='password']"));
	adminpassword.sendKeys(password);
}
public void adminDropdown() {
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control' and @id='user_type']"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Staff");
}
public void adminSave() {
WebElement savebtn = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-block-sm btn-danger' and @name='Create']"));
savebtn.click();
}
public boolean isAlertDisplayed() {
	WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
	return alert.isDisplayed();
}
}
