package SeleniumCocept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {
	static WebDriver chkk;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		chkk = new ChromeDriver();
		chkk.get("http://echoecho.com/htmlforms09.htm");
		chkk.manage().window().maximize();
		List <WebElement> checks = chkk.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("number of checkboxes are :" + checks.size());
	for(WebElement check:checks) {
		if (check.isSelected()==false) {
				check.click();
				
			}
		}

	}

}
