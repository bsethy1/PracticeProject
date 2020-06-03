package SeleniumCocept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatesSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("travelDate")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("July")) {
			
				driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("DayPicker-Day"));
		int count = driver.findElements(By.className("DayPicker-Day")).size();
		for (int i = 0; i < count; i++) {

			driver.findElements(By.className("DayPicker-Day")).get(i);
			String text = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {

				driver.findElements(By.className("DayPicker-Day")).get(i).click();
				break;
			}

		}

	}

}
