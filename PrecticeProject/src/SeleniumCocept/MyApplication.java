package SeleniumCocept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyApplication {

	@SuppressWarnings("deprecation")
	@Test
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertTrue(currentUrl.contains("auth/login"));
		
	}

	@Test(dependsOnMethods = "startApp")
	public void logInApp() {
		System.out.println("Logi App");
	}

	@Test(dependsOnMethods = "logInApp")
	public void TearDownApp() {

		System.out.println("Logout App");
	}
}
