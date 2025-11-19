package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	WaitUtility waitUtility = new WaitUtility();
	PageUtility pageUtility = new PageUtility();
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
	this.driver = driver;	
	//Initializing PF
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//syntax
	}
	//Implementing PF
	@FindBy(xpath = "//input[@name='username']") WebElement username;
public void enterusername(String usernamevalue) {
	//username.sendKeys(usernamevalue);
	pageUtility.sendDataToElement(username, usernamevalue);
}
@FindBy(xpath = "//input[@name='password']") WebElement password;
public void enterPassword(String passwordvalue) {
pageUtility.sendDataToElement(password, passwordvalue);
}
@FindBy(xpath = "//button[@type='submit']") WebElement signin;
public void signIn() {
waitUtility.waitUntilClickable(driver, signin);	
pageUtility.clickOnElement(signin);
}
//Page Factory: Design pattern to avoid repetition
}