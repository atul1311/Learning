package gidDemo.ArtiDemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.security.action.GetBooleanAction;

public class TakeScreenshot extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		openBrowser();
		getUrl("https://www.facebook.com/");
		takeSnapshot("second");
		quitBrowser();
	}
}