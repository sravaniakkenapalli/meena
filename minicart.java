import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class minicart {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Hello, sign in')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("sravaniamanaganti8@gmail.com");
		driver.findElement(By.xpath("(//input[@class='a-button-input'])")).click();
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("ricky@123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='nav-cart'])")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[7]")).click();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
	WebElement x	=driver.findElement(By.xpath("(//input[@type='text'])"));
		x.sendKeys("earphones");
		x.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.findElement(By.xpath(("(//span[contains(text(),'boAt BassHeads 100 in-Ear Wired Headphones with Mic (Black)')])[1]"))).click();
			@SuppressWarnings("rawtypes")
			ArrayList A= new ArrayList(driver.getWindowHandles());
			driver.switchTo().window((String)A.get(1));
							
		Thread.sleep(6000);
				System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
			
			driver.navigate().refresh();
			driver.switchTo().window((String)A.get(0));
			Thread.sleep(2000);
			driver.findElement(By.xpath(("(//span[contains(text(),'ZEBRONICS Zeb-Bro in Ear Wired Earphones with Mic, 3.5mm Audio Jack, 10mm Drivers, Phone/Tablet Compatible(Black)')])"))).click();
		ArrayList B= new ArrayList(driver.getWindowHandles());
			driver.switchTo().window((String)B.get(2));
			Thread.sleep(6000);
			System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])")).click();
		Thread.sleep(3000);
	}

}
