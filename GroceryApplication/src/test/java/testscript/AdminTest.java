package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
@Test(description = "To create an Admin user")
public void createAdmin() throws IOException{
	String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
	String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(usernamevalue);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passwordvalue);
	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	WebElement manageadmininfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
	manageadmininfo.click();
	WebElement newadmin = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newadmin.click();
	FakerUtility fakerUtility = new FakerUtility();
	String randomusername = fakerUtility.createRandomUserName();
	String randompassword = fakerUtility.createRandomPassword();
	WebElement adminusername = driver.findElement(By.xpath("//input[@type='text' and @class='form-control' and @id='username']"));
	adminusername.sendKeys(randomusername);
	WebElement adminpassword = driver.findElement(By.xpath("//input[@type='password' and @class='form-control' and @id='password']"));
	adminpassword.sendKeys(randompassword);
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control' and @id='user_type']"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Staff");
	WebElement savebtn = driver.findElement(By.xpath("//button[@type='submit' and @class='btn btn-block-sm btn-danger' and @name='Create']"));
	savebtn.click();
	
	System.out.println("Username = "+randomusername+", Password");
}
}
