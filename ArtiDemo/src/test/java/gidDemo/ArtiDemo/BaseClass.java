package gidDemo.ArtiDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	private static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void getUrl(String url) {
		System.out.println("Opening the URL " + url);
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void name() {
		System.out.println("ABC");
	}

	public static void takeSnapshot(String snapName) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\ebsadmin\\Desktop\\Screen\\destination\\first.png");
		// FileUtils.copyFile(srcFile, destFile);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\ebsadmin\\Desktop\\Screen\\destination\\" + snapName + ".jpg"));
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
