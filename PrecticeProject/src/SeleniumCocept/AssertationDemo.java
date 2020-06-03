package SeleniumCocept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertationDemo {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		driver = new ChromeDriver();
	}

	@Test
	public void testMethod() {
	//open the chapter1 page
		
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
		String myTitle=driver.getCurrentUrl();
		System.out.println(myTitle);
		Assert.assertTrue(myTitle.contains("chapter1"));
		System.out.println(myTitle);
		driver.findElement(By.name("selected(1234)")).click();
		
		
	}
}