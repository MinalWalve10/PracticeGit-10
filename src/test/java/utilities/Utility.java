package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	 static WebDriver driver;
	 
	public static WebDriver LaunchURL (String url)
	{
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		driver.get(Utility.ReadProerty(url));
        driver.manage().window().maximize();
		return driver;
	}
//	
	//make static because we dont want to make object of ReadProperty
		public static String ReadProerty(String Key) 
	{
		//File represent by using file class
		File f= new File("src/test/resources/commondata.properties");
	    String value = null;
		// Read file- t read file connect with the system of fileinputstream
		try {
			FileInputStream fis = new FileInputStream(f);
			
			//properties class
			Properties p= new Properties();
			p.load(fis);
			value= p.getProperty(Key);
	    	}
			catch(IOException e) {			e.printStackTrace();          }
		return value;
	}
	
	public static ArrayList<Object> ReadExcel()
	{
		WebDriver driver= new ChromeDriver();
		driver.get(Utility.ReadProerty("newurl"));
        driver.manage().window().maximize();
		
        
		ArrayList<Object> data= new ArrayList<Object>();
		File F= new File("C:/Users/Dell/Desktop/SeleniumTestData.xlsx");
		
		try {
		FileInputStream fis= new FileInputStream(F);
		
		XSSFWorkbook x= new XSSFWorkbook(fis);

		XSSFSheet s= x.getSheet("Sheet1");
		
		int lastrow= s.getLastRowNum();


		for(int i=1; i<=lastrow; i++)
		{
			XSSFRow row= s.getRow(i);
			int lastcell= row.getLastCellNum();

			for(int j=0; j<=2; j++)
			{
			  
			  System.out.print(row.getCell(j));
//				if(row.getCell(j)==null)
//				{
//					continue;
//				}
//				if(row.getCell(j).getCellType()== CellType.STRING)
//				{
//					data.add(row.getCell(j).getStringCellValue());
//				}
//				if(row.getCell(j).getCellType()== CellType.NUMERIC)
//				{
//					data.add(row.getCell(j).getNumericCellValue());
//				}
				
			}
			x.close();
//			WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstName']"));
//			System.out.println(data.get(0));
			//FirstName.sendKeys(data.get(0).toString());
		}
		
		
	}
		catch(IOException e) {			e.printStackTrace();          }
		return data;
			
}
}