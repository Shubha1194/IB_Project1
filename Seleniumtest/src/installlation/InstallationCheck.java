package installlation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstallationCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
	}

}
