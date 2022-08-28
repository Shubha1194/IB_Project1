package xpathpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Testxpath {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://tisyaimpex.com/bespoke-skylights/");
		Thread.sleep(3000);
		WebElement Candidatinformation=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		 Candidatinformation.sendKeys("Shubham");
		//File source= NewAcc.getScreenshotAs(OutputType.FILE);
		//File dest=new File("E:\\Selenium Screen Shot\\Sign up page1.jpg");
		//FileHandler.copy(source, dest);
	}

}
