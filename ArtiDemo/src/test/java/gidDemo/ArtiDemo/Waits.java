package gidDemo.ArtiDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends BaseClass {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("as.atuljangra");
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("dummy")));
		driver.findElement(By.name("pass")).sendKeys("****************");
		driver.quit();
	}
}
