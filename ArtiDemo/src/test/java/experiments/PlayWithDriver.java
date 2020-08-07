package experiments;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithDriver {

	static ChromeDriver driver;
	
	private static void getUrl(String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			System.out.println("The problem is due to "+ e);
		}
		
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Softwares\\Testing Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		getUrl("https://www.google.co.	in/");
		

	}

}
