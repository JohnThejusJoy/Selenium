package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
@Test(priority = 1, description = "To verify the login using valid credentials")//Will  be displayed in report
public void verifyLoginwithValidCredentials() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
	String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
	//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	//username.sendKeys(usernamevalue);
	//WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	//password.sendKeys(passwordvalue);
	//WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	//signin.click();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin";
	Assert.assertEquals(actual, expected);
	}
@Test(priority = 2, description = "To verify the login using invalid username and valid password")
public void verifyLoginInvalidUsernameValidPassword() throws IOException {
String usernamevalue = ExcelUtility.getStringData(2, 0, "loginsheet");
String passwordvalue = ExcelUtility.getStringData(2, 1, "loginsheet");
LoginPage loginPage = new LoginPage(driver);
loginPage.enterusername(usernamevalue);
loginPage.enterPassword(passwordvalue);
loginPage.signIn();
}
@Test(priority = 3, description = "To verify the login using valid username and invalid password")
public void verifyLoginValidUsernameInvalidPassword() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(3, 0, "loginsheet");
	String passwordvalue = ExcelUtility.getStringData(3, 1, "loginsheet");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
}
@Test(priority = 4, description = "To verify the login using invalid credentials")
public void verifyLoginInvalidCredentials() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(4, 0, "loginsheet");
	String passwordvalue = ExcelUtility.getStringData(4, 1, "loginsheet");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
}
}
