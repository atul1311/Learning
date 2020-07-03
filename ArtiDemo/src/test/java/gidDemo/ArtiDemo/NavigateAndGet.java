package gidDemo.ArtiDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class NavigateAndGet extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivvver = new ChromeDriver();
		drivvver.get("https://dts.hrtransport.gov.in/TrainingApplicationNEW.aspx");
		drivvver.findElement(By.xpath("//*[@id='MainContent_txtApplicantName']")).sendKeys("ABC");
		Thread.sleep(10);
		System.out.println("Quiting");
		drivvver.quit();
	}
}
