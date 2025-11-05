package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
@Test(priority = 1, description = "To verify the login using valid credentials")//Will  be displayed in report
public void verifyLoginwithValidCredentials() throws IOException {
	String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
	String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(usernamevalue);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passwordvalue);
	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
	}
@Test(priority = 2, description = "To verify the login using invalid username and valid password")
public void verifyLoginInvalidUsernameValidPassword() throws IOException {
String username2 = ExcelUtility.getStringData(2, 0, "loginsheet");
String password2 = ExcelUtility.getStringData(2, 1, "loginsheet");
WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
username.sendKeys(username2);
WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
password.sendKeys(password2);
WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
signin.click();
}
@Test(priority = 3, description = "To verify the login using valid username and invalid password")
public void verifyLoginValidUsernameInvalidPassword() throws IOException {
	String username3 = ExcelUtility.getStringData(3, 0, "loginsheet");
	String password3 = ExcelUtility.getStringData(3, 1, "loginsheet");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(username3);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(password3);
	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
}
@Test(priority = 4, description = "To verify the login using invalid credentials")
public void verifyLoginInvalidCredentials() throws IOException {
	String username4 = ExcelUtility.getStringData(4, 0, "loginsheet");
	String password4 = ExcelUtility.getStringData(4, 1, "loginsheet");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(username4);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(password4);
	WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
	signin.click();
}
}
