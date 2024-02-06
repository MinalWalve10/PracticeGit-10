package SeleniumClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeLocators {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//By Name
		WebElement Name= driver.findElement(By.name("userid"));
	    Name.sendKeys("Minal Walve");
		
		//By Class Name
		WebElement ClassName= driver.findElement(By.className("title"));
		System.out.println(ClassName.getAttribute("innerHTML"));
		
		//By Id
		WebElement ID= driver.findElement(By.id("button9"));
		System.out.println(ID.getAttribute("innerHTML"));
		
		//By Tag Name
		WebElement TagName= driver.findElement(By.tagName("title"));
		System.out.println(TagName.getAttribute("innerHTML"));
		
		// By Linktext
		WebElement LinkText= driver.findElement(By.linkText("Page One"));
		System.out.println(LinkText.getText());
		
		//By Portial link text
		WebElement PartialLinkText= driver.findElement(By.partialLinkText("SeleniumTuto"));
		System.out.println(PartialLinkText.getText());
		
		//By Xpath- Relative Path
		WebElement RelativeXpath= driver.findElement(By.xpath("//a[@id='link1']"));
		System.out.println(RelativeXpath.getText());	
		
		//By Xpath- Relative Path
		WebElement AbsoluteXpath= driver.findElement(By.xpath("//*[@id=\"post-body-9023929218208337252\"]"));
		System.out.println(AbsoluteXpath.getText());	
		
		//By CSS selector-Id
		WebElement CSSselector= driver.findElement(By.cssSelector("a[id='link1']"));
		System.out.println(CSSselector.getText());
		
		WebElement CSSselector1= driver.findElement(By.cssSelector("#link1"));
		System.out.println(CSSselector1.getText());
		
		WebElement CSSselector2= driver.findElement(By.cssSelector(".title"));
		System.out.println(CSSselector2.getText());
		
		WebElement CSSselector3= driver.findElement(By.cssSelector("div[class*='widget HTML'][id='HTML2'] > h2[class^='title'] "));
		System.out.println(CSSselector3.getText());
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	   
		
		
	}

}
