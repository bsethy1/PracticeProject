package SeleniumCocept;

import org.omg.CORBA.Current;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption3")).click();
		String labelname= driver.findElement(By.cssSelector("[for='honda']")).getText();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(labelname);
		driver.findElement(By.id("name")).sendKeys(labelname);
		driver.findElement(By.id("alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		if(text.contains(labelname)) {
			System.out.println("Alert success msg");
		}
		driver.switchTo().alert().accept();
		
	}

}
