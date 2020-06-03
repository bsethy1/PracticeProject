package SeleniumCocept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	static WebDriver rdo;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Bibhuti\\Chromenew\\chromedriver.exe");
		rdo = new ChromeDriver();
		rdo.get("https://www.facebook.com/");
		rdo.manage().window().maximize();
		List<WebElement> rds = rdo.findElements(By.className("_58mt"));
		System.out.println("number of radio buttons are: " + rds.size());
		for (WebElement buttons : rds) {
			System.out.println(buttons.getText());
			
	
		}

	}

}
