package SeleniumCocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class parent2  {
	
	// UserLogin Operation
		public void userLogin(WebDriver driver) throws InterruptedException {
			System.out.println("To validate Login functionality");
			
			driver.findElement(By.linkText("SIGN-ON")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("userName")).sendKeys("Bibuti.sethy@gmail.com");
			driver.findElement(By.name("password")).sendKeys("marcury9");
			driver.findElement(By.name("login")).click();
	}

}
