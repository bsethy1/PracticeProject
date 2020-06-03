package SeleniumCocept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {
	static WebDriver driver;
	static String BaseUrl;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		BaseUrl = "https://automation-test.v6.nadeem.tv/";
		driver.get(BaseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys(Keys.SHIFT,"automation-tester@sharklasers.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Tester123");
		driver.findElement(By.xpath("//button[@id='Signin']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Automation Tester")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
