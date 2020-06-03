package SeleniumCocept;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoSuggestedDropDown {

	public static void main(String[] args) throws IOException {

		//Capturing SSL certifications 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		//DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		//ChromeOptions c = new ChromeOptions();
		//c.merge(ch);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Automation\\screenshot.png"));
	}

}
