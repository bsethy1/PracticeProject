package SeleniumCocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFbAccount {
	static WebDriver fb;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		fb = new ChromeDriver();
		fb.get("http://facebook.com");
		fb.manage().window().maximize();
		fb.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Bibhuti");
		fb.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Sethy");
		fb.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("bibhuti.sethy@gmail.com");
		fb.findElement(By.xpath("//input[@id='u_0_u']")).sendKeys("bibhuti.sethy@gmail.com");
		
		fb.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Radhaswamy");
		Select date = new Select(fb.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("11");
		Select month = new Select(fb.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Dec");
		Select year = new Select(fb.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1986");
		fb.findElement(By.className("_58mt")).click();
		fb.findElement(By.xpath("//button[@id='u_0_13']")).click();

	}

}
