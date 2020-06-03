package SeleniumCocept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
		public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Bibhuti\\\\geckodriver-v0.24.0-win64\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
