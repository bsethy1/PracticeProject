package SeleniumCocept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		Iterator <String>itr = set.iterator();
		while(itr.hasNext()){
			String childwindow=itr.next();
			if(!mainwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
			
			}
		}
	}

}
