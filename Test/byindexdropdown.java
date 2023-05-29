package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class byindexdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\srika\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@rel='async'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Ricky");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcde");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9110378637");
		Select Day =new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		Day.selectByIndex(24);
		Select Month =new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		Month.selectByIndex(4);
		Select Year =new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		Year.selectByIndex(3);

	}

}
