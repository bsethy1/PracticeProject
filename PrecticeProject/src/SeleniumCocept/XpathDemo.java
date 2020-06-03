package SeleniumCocept;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathDemo {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		driver = new ChromeDriver();
	}

	@Test
	public void LoginTest() {
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Bibhuti");
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Priyanka");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("document.findElementByXpath(//input[@name='email').value='bibhuti'");

		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);
		
       // for(int i=0; 0 ; i++)// this code will throw an error as loop demands a boolean value in 2nd part but we have provided int value
        	
        {  
            System.out.println("Hello Javatpoint");  
        }  
	}

}
