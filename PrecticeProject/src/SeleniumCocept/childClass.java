package SeleniumCocept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class childClass extends parent1{
	
	public static WebDriver driver;
	//To initialize Browser
	@Test
	public void setUp() {
		System.out.println("To initialize Browser");
		System.setProperty("webdriver.gecko.driver", "C:\\\\Bibhuti\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http:newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) throws InterruptedException {
		childClass cc = new childClass();
		cc.setUp();
		cc.userReg(driver);
		cc.userLogin(driver);
		cc.tearDown(driver);
		
		
		
		
		
		
	}

}
