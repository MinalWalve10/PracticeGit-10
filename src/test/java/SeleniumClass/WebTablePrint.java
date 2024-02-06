package SeleniumClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePrint {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> header=driver.findElements(By.xpath("//table//thead"));
		for(WebElement Tablehead: header)
		{
			System.out.println(Tablehead.getText());
		}
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		List<WebElement> column= driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));

		for(int i=1; i<=rows.size(); i++)
		{
			for(int j=1; j<=column.size(); j++)
			{
			WebElement PrintTable= driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr["+i+"]/td["+j+"]"));
		    System.out.print(PrintTable.getText()+" ");
			}
		    System.out.println();

		}
		
		driver.quit();
				
	}

}
