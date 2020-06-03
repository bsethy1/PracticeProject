package SeleniumCocept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	static String baseurl;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		driver = new ChromeDriver();
		baseurl = "https://s2.demo.opensourcecms.com/orangehrm/index.php";
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement userId = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement Pssword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement loginbuttn = driver.findElement(By.id("btnLogin"));
		userId.sendKeys("opensourcecms");
		Pssword.sendKeys("opensourcecms");
		loginbuttn.click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.name("empsearch[termination]"));
		Select webelements = new Select(element);
		List<WebElement> elements = webelements.getOptions();
		System.out.println(elements.size());
		for (WebElement ele : elements) {
			System.out.println("India".equals(ele.getText()));
			driver.getTitle();
		}
	}

}
