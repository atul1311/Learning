package gidDemo.ArtiDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
	}
}

