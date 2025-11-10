package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver = driver;
}
public void adminButton() {
	WebElement adminbtn = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	adminbtn.click();
}
public void logOut() {
	WebElement logoutbtn = driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
	logoutbtn.click();
}
}
