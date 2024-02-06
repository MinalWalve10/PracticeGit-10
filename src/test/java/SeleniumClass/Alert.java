package SeleniumClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='alert2']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		
	
	}
}
