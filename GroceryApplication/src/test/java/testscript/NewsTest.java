package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase{
	@Test(description = "Test case for news addition")
	public void addNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement managenewsbtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenewsbtn.click();
		WebElement newnewsbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newnewsbtn.click();
		WebElement newstxt = driver.findElement(By.xpath("//textarea[@id='news']"));
		newstxt.sendKeys("Breaking news!");
		WebElement savebtn = driver.findElement(By.xpath("//button[@type='submit']"));
		savebtn.click();
		
	}
	@Test(description = "Test case for news search")
public void searchNews() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement managenewsbtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenewsbtn.click();
		WebElement searchbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		searchbtn.click();
		WebElement searchfield = driver.findElement(By.xpath("//input[@class='form-control']"));
		searchfield.sendKeys("Breaking");
		WebElement searchnewsbtn = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
		searchnewsbtn.click();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/news/index";
		Assert.assertEquals(actual, expected);
	}
	@Test(description = "Return to home")
public void returntoHome() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement managenewsbtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenewsbtn.click();
		WebElement homebtn = driver.findElement(By.xpath("//a[text()='Home']"));
		homebtn.click();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actual, expected);
	}
	@Test(description = "Reset")
	public void reset() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement managenewsbtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenewsbtn.click();
		WebElement resetbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		resetbtn.click();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/list-news";
		Assert.assertEquals(actual, expected);
	}

}
