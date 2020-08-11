package mvation.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import gidDemo.ArtiDemo.BaseClass;
import mvation.PageHelper.LoginPage;

public class LoginTestScript /* extends BaseClass */ {

	private static String url = "https://stage-mvation.drscloud.net/#/";
	private static String userName = "admin@mvation.com";
	private static String userPass = "UKMsfVeN";
	private static WebDriver driver = null;

	public static void main(String[] args) {
		loginTest();
	}

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Testing Softwares\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		System.out.println("Opening the URL " + url);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void quitBrowser() {
		System.out.println("Closing the browser.");
		driver.quit();
	}

	public static void loginTest() {
		
		openBrowser();
		getUrl(url);
		LoginPage loginPageObj = new LoginPage(driver);

		loginPageObj.enterUserName(userName);
		loginPageObj.enterPassword(userPass);
		loginPageObj.login();
		quitBrowser();
	}
}
