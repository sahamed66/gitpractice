package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement dropdown = driver.findElement(By.name("country"));
		Thread.sleep(3000);
		Select sel = new Select(dropdown);
		List<WebElement> alloptions = sel.getOptions();
		int count = alloptions.size();
		System.out.println(count);
		Thread.sleep(3000);
		for (WebElement mylist : alloptions) {
			String alloptionsText= mylist.getText();
			System.out.println(alloptionsText);
			
			
		}
		
		
		
		
		
		
		


	}

}
