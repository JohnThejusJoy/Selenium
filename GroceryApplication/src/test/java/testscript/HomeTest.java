package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase{
	@Test(priority = 1, description = "Logout function")
	public void verifyLogout() throws IOException {
		String usernamevalue = ExcelUtility.getStringData(1, 0, "loginSheet");//Data Driven approach: reading data from file
		String passwordvalue = ExcelUtility.getStringData(1, 1, "loginSheet");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement adminbtn = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		adminbtn.click();
		WebElement logoutbtn = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		logoutbtn.click();
		}
}
