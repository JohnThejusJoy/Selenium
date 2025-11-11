package testscript;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constants.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
@Test(priority = 1, description = "To verify the login using valid credentials")//Will  be displayed in report
public void verifyLoginwithValidCredentials() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(1, 0, Constant.SHEETNAME);//Data Driven approach: reading data from file
	String passwordvalue = ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin";
	Assert.assertEquals(actual, expected);
	}
@Test(priority = 2, description = "To verify the login using invalid username and valid password")
public void verifyLoginInvalidUsernameValidPassword() throws IOException {
String usernamevalue = ExcelUtility.getStringData(2, 0, Constant.SHEETNAME);
String passwordvalue = ExcelUtility.getStringData(2, 1, Constant.SHEETNAME);
LoginPage loginPage = new LoginPage(driver);
loginPage.enterusername(usernamevalue);
loginPage.enterPassword(passwordvalue);
loginPage.signIn();
String actual = driver.getCurrentUrl();
String expected = "https://groceryapp.uniqassosiates.com/admin/login";
Assert.assertEquals(actual, expected);
}
@Test(priority = 3, description = "To verify the login using valid username and invalid password")
public void verifyLoginValidUsernameInvalidPassword() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(3, 0, Constant.SHEETNAME);
	String passwordvalue = ExcelUtility.getStringData(3, 1, Constant.SHEETNAME);
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual, expected);
}
@Test(priority = 4, description = "To verify the login using invalid credentials")
public void verifyLoginInvalidCredentials() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(4, 0, Constant.SHEETNAME);
	String passwordvalue = ExcelUtility.getStringData(4, 1, Constant.SHEETNAME);
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterusername(usernamevalue);
	loginPage.enterPassword(passwordvalue);
	loginPage.signIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual, expected);
}
}
