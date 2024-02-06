package SeleniumClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FileUpload {
	
	public static void main(String[] args)
	{
	//	System.setProperty("wediver.chrome.driver", "src/test/resources/chrome.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ChooseFilebtn= driver.findElement(By.xpath("//input[@id='uploadfile']"));
		ChooseFilebtn.sendKeys("C:/Users/Dell/Downloads/MinalWalve_2.8YearsExperience.pdf");
		
		driver.quit();
	}

}
