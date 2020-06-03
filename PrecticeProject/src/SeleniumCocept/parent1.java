package SeleniumCocept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class parent1 extends parent2{
		
		// To perform user registration
		public void userReg(WebDriver driver) throws InterruptedException {
			
				System.out.println("User reg sript exeution");
				driver.findElement(By.linkText("Home")).click();
				driver.findElement(By.linkText("REGISTER")).click();
				driver.findElement(By.name("firstName")).sendKeys("BibhutiSethy");
				driver.findElement(By.name("email")).sendKeys("Bibuti.sethy@gmail.com");
				driver.findElement(By.name("password")).sendKeys("marcury9");
				driver.findElement(By.name("confirmPassword")).sendKeys("marcury9");
				driver.findElement(By.name("register")).click();
				Thread.sleep(5000);
		}
		
		
		// To close application
		public void tearDown(WebDriver driver) {
			driver.close();
		}
	
	
}
