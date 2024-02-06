package SeleniumClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        
        WebElement MoveCursor= driver.findElement(By.xpath("//span[@id=\'blogsmenu\']"));
        
        Actions a= new Actions(driver);
        //a.moveToElement(MoveCursor).build().perform();
        
        a.contextClick(MoveCursor).build().perform();
        
       WebElement UserId= driver.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
       a.sendKeys(UserId, "Minal").build().perform();
       
      // driver.quit();
        
        
	}

}
