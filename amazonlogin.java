import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazonlogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Hello, sign in')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("sravaniamanaganti8@gmail.com");
		driver.findElement(By.xpath("(//input[@class='a-button-input'])")).click();
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("ricky@123");
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
