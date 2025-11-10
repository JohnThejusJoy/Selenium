package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsPage {
public WebDriver driver;
public NewsPage(WebDriver driver) {
	this.driver = driver;
}
public void manageNews() {
	WebElement managenewsbtn = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
	managenewsbtn.click();
}
public void newNews()
{
	WebElement newnewsbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newnewsbtn.click();	
}
public void newsText()
{
	WebElement newstxt = driver.findElement(By.xpath("//textarea[@id='news']"));
	newstxt.sendKeys("Breaking news!");
}
public void saveNews()
{
	WebElement savebtn = driver.findElement(By.xpath("//button[@type='submit']"));
	savebtn.click();
}
public void searchButton()
{
	WebElement searchbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
	searchbtn.click();
}
public void searchText() {
	WebElement searchfield = driver.findElement(By.xpath("//input[@class='form-control']"));
	searchfield.sendKeys("Breaking");
}
public void searchNews()
{
	WebElement searchnewsbtn = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-fix']"));
	searchnewsbtn.click();
}
public void returntoHome()
{
	WebElement homebtn = driver.findElement(By.xpath("//a[text()='Home']"));
	homebtn.click();
}
public void resetButton()
{
	WebElement resetbtn = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
	resetbtn.click();
}
}
