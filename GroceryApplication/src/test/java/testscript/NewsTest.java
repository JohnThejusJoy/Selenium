package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constants.Constant;
import pages.LoginPage;
import pages.NewsPage;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase{
	@Test(description = "Test case for news addition")
	public void addNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, Constant.SHEETNAME);//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernamevalue);
		loginPage.enterPassword(passwordvalue);
		loginPage.signIn();
		NewsPage newsPage = new NewsPage(driver);
		newsPage.manageNews();
		newsPage.newNews();
		newsPage.newsText();
		newsPage.saveNews();
		boolean isalertDisplayed = newsPage.isAlertDisplayed();
		Assert.assertTrue(isalertDisplayed);
	}
	@Test(description = "Test case for news search")
public void searchNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, Constant.SHEETNAME);//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernamevalue);
		loginPage.enterPassword(passwordvalue);
		loginPage.signIn();
		NewsPage newsPage = new NewsPage(driver);
		newsPage.manageNews();
		newsPage.searchNews();
		newsPage.searchText();
		newsPage.searchButton();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/news/index";
		Assert.assertEquals(actual, expected);
	}
	@Test(description = "Return to home")
public void returntoHome() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, Constant.SHEETNAME);//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernamevalue);
		loginPage.enterPassword(passwordvalue);
		loginPage.signIn();
		NewsPage newsPage = new NewsPage(driver);
		newsPage.manageNews();
		newsPage.returntoHome();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actual, expected);
	}
	@Test(description = "Reset")
	public void reset() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, Constant.SHEETNAME);//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterusername(usernamevalue);
		loginPage.enterPassword(passwordvalue);
		loginPage.signIn();
		NewsPage newsPage = new NewsPage(driver);
		newsPage.manageNews();
		newsPage.resetButton();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/list-news";
		Assert.assertEquals(actual, expected);
	}

}
