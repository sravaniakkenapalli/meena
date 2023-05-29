import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class addtocart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver =  new ChromeDriver(options);
		
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
	WebElement x	=driver.findElement(By.xpath("(//input[@type='text'])"));
		x.sendKeys("mouse pad");
		x.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[contains(text(),'STRIFF Mpad Mouse Mat 230X190X3mm Gaming Mouse Pad, Non-Slip Rubber Base, Waterproof Surface, Premium-Textured, Compatible with Laser and Optical Mice(Universe Black)')])")).click();
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ArrayList A= new ArrayList(driver.getWindowHandles());
			driver.switchTo().window((String)A.get(1));
							
				Thread.sleep(6000);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(1000);
				driver.findElement(By.id("add-to-cart-button")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sravani");
				driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9110378637");
				driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ghanpur123");
				driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("ghanpur");
				driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("near busstand");
				driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();			
				
				
				

	}

}
