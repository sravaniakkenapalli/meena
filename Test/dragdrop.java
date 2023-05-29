package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		 WebElement a = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 WebElement b = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		 Actions x = new Actions(driver);
		 x.dragAndDrop(a, b).perform();
		 Thread.sleep(2000);
		 WebElement c = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		 WebElement d = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		 Actions y = new Actions(driver);
		 y.dragAndDrop(c, d).perform();
		 Thread.sleep(2000);
		 
		 WebElement g = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		 WebElement h = driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/div"));
		 Actions p = new Actions(driver);
		 p.dragAndDrop(g,h).perform();
		 Thread.sleep(1000);
		 
		 
		 WebElement e = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		 WebElement f  = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		 Actions z = new Actions(driver);
		 z.dragAndDrop(e,f).perform();
		 

	}

}





























































