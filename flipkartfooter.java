

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartfooter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])")).click();
		
		Thread.sleep(5000);
		Actions abc = new Actions(driver);
		//abc.keyUp(Keys.END);
		abc.keyDown(Keys.END);
		WebElement opentabs = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]"));
		System.out.println(opentabs.findElements(By.tagName("a")).size());
		{
		for ( int i=1;i<opentabs.findElements(By.tagName("a")).size();i++)
		 {
	
		String opentabsagain = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain);
		
	
	}
		}
	}
}
