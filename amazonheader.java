import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonheader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]")).click();
		
		// driver.findElements(By.xpath("(//div[@class='nav-sprite'])[1]"));
		WebElement opentabs = driver.findElement(By.xpath("(//div[@id='nav-main'])"));
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
