package SeleniumCocept;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://www.demoqa.com/checkbox");
		driver.manage().window().maximize();
		//driver.findElement(By.id("userName"));
		//Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.findElementByid('userName').value = 'Bibhuti Sethy';");
		driver.findElement(By.cssSelector("span[class=rct-checkbox]")).click();
	}

}
