package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase{
	@Test(priority = 1, description = "Logout function")
	public void verifyLogout() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernamevalue);
		loginPage.enterPassword(passwordvalue);
		loginPage.signIn();
		HomePage homePage = new HomePage(driver);
		homePage.adminButton();
		homePage.logOut();
		String current = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(current, expected);
		}
}
