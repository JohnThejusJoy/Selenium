package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class NewsPage {
	WaitUtility waitUtility = new WaitUtility();
	PageUtility pageUtility = new PageUtility();
public WebDriver driver;
public NewsPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenewsbtn;
public void manageNews() {
	pageUtility.clickOnElement(managenewsbtn);
}
@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newnewsbtn;
public void newNews()
{
	pageUtility.clickOnElement(newnewsbtn);
}
@FindBy(xpath = "//textarea[@id='news']") WebElement newstxt;
public void newsText()
{
	pageUtility.sendDataToElement(newstxt, "Breaking");
}
@FindBy(xpath = "//button[@type='submit']") WebElement savebtn;
public void saveNews()
{
	pageUtility.clickOnElement(savebtn);
}
@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement searchbtn;
public void searchButton()
{
		waitUtility.waitUntilClickable(driver, searchbtn);
	pageUtility.clickOnElement(searchbtn);
}
@FindBy(xpath = "//input[@class='form-control']") WebElement searchfield;
public void searchText() {
	pageUtility.sendDataToElement(searchfield, "Breaking");
}
@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") WebElement searchnewsbtn;
public void searchNews()
{
	pageUtility.clickOnElement(searchnewsbtn);
}
@FindBy(xpath = "//a[text()='Home']") WebElement homebtn;
public void returntoHome()
{
	pageUtility.clickOnElement(homebtn);
}
@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']") WebElement resetbtn;
public void resetButton()
{
	pageUtility.clickOnElement(resetbtn);
}
@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
public void isAlertDisplayed() {
	pageUtility.alertDisplay(alert);
}
}
