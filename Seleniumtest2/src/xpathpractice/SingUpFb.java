package xpathpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingUpFb {

	

		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(1000);
			WebElement NewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			NewAcc.click();
			Thread.sleep(5000);
		     WebElement username=	driver.findElement(By.xpath("//input[@id='u_b_b_2c']"));
		  username.sendKeys("Shubham");
			driver.findElement(By.name("lastname")).sendKeys("purwat");
			driver.findElement(By.name("reg_email__")).sendKeys("9156303177");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Shubh1194");
			Thread.sleep(1000);
			WebElement day=driver.findElement(By.name("birthday_day"));
			Select d=new Select(day);
			d.selectByIndex(12);
			WebElement Month=driver.findElement(By.name("birthday_month"));
			Thread.sleep(1000);
			Select M=new Select(Month);
			M.selectByVisibleText("Nov");
			WebElement year=driver.findElement(By.name("birthday_month"));
			Thread.sleep(1000);
			Select Y=new Select(year);
			Y.selectByIndex(2);
			WebElement radio=driver.findElement(By.xpath("//label[text()='Male']"));
			
			radio.isSelected();
			Thread.sleep(1000);
			driver.findElement(By.name("websubmit")).click();
	}

}
