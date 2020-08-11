package mvation.PageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;

	By userName_textbox = By.id("username");
	By passWord_textbox = By.id("password");
	By login_btn = By.xpath(".//*[contains(text(),'Login')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String userName){
		try {
			driver.findElement(userName_textbox).sendKeys(userName);
		} catch (Exception e) {
			System.out.println("The error is" + e);
		}

	}

	public void enterPassword(String password) {
		try {
			driver.findElement(passWord_textbox).sendKeys(password);			
		} catch (Exception e) {
			System.out.println("The error is" + e);
		}

	}

	public void login() {
		driver.findElement(login_btn).sendKeys(Keys.RETURN);
	}

}
