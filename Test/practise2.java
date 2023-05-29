package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class practise2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		//search item1
		WebElement x=driver.findElement(By.id("global-enhancements-search-query"));
         x.sendKeys(" girls watches");
         x.sendKeys(Keys.ENTER);
     	Thread.sleep(3000);
	   driver.findElement(By.xpath("(//h3[contains(text(),'Watches Top Brand Luxury Waterproof Watch Fashion Ladies Stainless Steel Wristwatch Casual Quartz, Super Flat')])")).click();
      @SuppressWarnings({ "unchecked", "rawtypes" })
       ArrayList A = new ArrayList(driver.getWindowHandles());
       driver.switchTo().window((String)A.get(1));
      Thread.sleep(6000);
      System.out.println(driver.getCurrentUrl());
    Select style = new Select(driver.findElement(By.id("variation-selector-0"))) ;
      style.selectByIndex(2);
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


//second item2
	driver.switchTo().window((String)A.get(0));
	Thread.sleep(2000);
	driver.findElement(By.xpath(("(//h3[contains(text(),'Starlight Apple Watch Band Series 8/7/6/5/4/3/SE for iWatch Band 38 40 41mm 42 44 45 49mm Apple Watch Straps Women Apple Watch Charms Ultra')])"))).click();
    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList B= new ArrayList(driver.getWindowHandles());
	driver.switchTo().window((String)B.get(2));
	
	Thread.sleep(3000);
	
	Select colour1 = new Select(driver.findElement(By.id("variation-selector-0")));
	colour1.selectByIndex(4);
	Thread.sleep(3000);
	Select size = new Select(driver.findElement(By.id("variation-selector-1")));
	size.selectByIndex(2);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


	}

}