package SeleniumCocept;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input[title=Search]")).sendKeys("test");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("testbook")) {
				list.get(i).click();
			}

		}

	}

}
