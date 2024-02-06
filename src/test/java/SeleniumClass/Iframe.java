package SeleniumClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {
	
	public static void main(String[] agrs)
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//3 ways to handle Iframe
		//1- id
		//driver.switchTo().frame("navbar-iframe");

		//2-Name
		//driver.switchTo().frame(0);
		
		//3-WebElement
		System.out.println("finding frames");
		 driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")).click();
		System.out.println("not finding frames");

		//System.out.println(iframe.getText());
		//driver.switchTo().frame(Button);
		
		
	}

}
