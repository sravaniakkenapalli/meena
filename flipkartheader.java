import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkartheader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//String header = driver.findElement(By.xpath("(//div[@class='InyRMC _3Il5oO'])")).getText();
		//System.out.println(header);
		driver.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])")).click();
		WebElement opentabs = driver.findElement(By.xpath("(//div[@class='_331-kn _2tvxW'])"));
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


