package SeleniumCocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static WebDriver chk;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		chk = new ChromeDriver();
		chk.get("http://echoecho.com/htmlforms09.htm");
		chk.findElement(By.xpath("\"//td[@class='table8']/input[2]\"")).click();

	}

}
