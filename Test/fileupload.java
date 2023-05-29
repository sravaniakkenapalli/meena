package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement File= driver.findElement(By.xpath("//input[@type='file']"));
		File.sendKeys("C:\\Users\\srika\\Desktop\\sra.txt");
		driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

	}

}
