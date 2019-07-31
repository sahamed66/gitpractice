package selectClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class PracticeScripts {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// driver.get("http://www.google.com");
		 driver.get("http://www.amazon.com");
		 driver.findElement(By.id("nav-link-prime")).click();
		// Set<String> s = driver.getWindowHandles();
		//Iterator<String> it = s.iterator();
		//Object window1 = it.next();
		//driver.switchTo().window((String) window1);
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@class='prime-cta-signup-button-input']")).click();
		// driver.findElement(By.name("email")).sendKeys("sahamed");
		 //driver.findElement(By.xpath("//input[@id='ap_email'")).click();
		 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sahamed66");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Balaka#1");
		driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
		String str = driver.findElement(By.xpath("//h4[@class='a-alert-heading']")).getText();
		System.out.println(str);
		String expected = "There was a problem";
		Assert.assertEquals(str, expected);
		System.out.println("My name is Sheik");
			 
	}
}