package seleniumtutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelApp_BusinessFuctions{
	
	

	static Properties prop;
	static WebDriver driver;
	static String sUrl;
	static String sBrowser;


	public static void setup() throws FileNotFoundException, IOException
	{
		Browser();
		sUrl=prop.getProperty("url");
		driver.get(sUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void Browser() throws FileNotFoundException, IOException{
		
//		prop = new Properties();
//		prop.load(new FileInputStream(".\\configuration\\configuration.properties"));
//		String sbrowser = prop.getProperty("Fire_browser");
//		String sbrowser1=prop.getProperty("Chrome_browser");
//		String iebrowser=prop.getProperty("IE_browser");
		
//		System.out.println(sbrowser);
//		System.out.println(sbrowser1);
		sBrowser=prop.getProperty("browser");
		System.out.println(sBrowser);

		
		if(sBrowser.equals("firefox"))
				{
					driver = new FirefoxDriver();
				}else if(sBrowser.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
					driver = new ChromeDriver();
					
				}else if(sBrowser.equals("ie"))
				{
					System.setProperty("webdriver.ie.driver", ".\\lib\\IEDriverServer.exe");
					driver = new ChromeDriver();
					
				}
		
			
	}
	
	
	public static void Login(){
		
		HotelApp_ObjectRepository rp = new HotelApp_ObjectRepository(driver);
		
		rp.username().sendKeys("adactin123");
		rp.password().sendKeys("adactin123");
		rp.login().click();
	}
	
	public static void Search(){
		
		HotelApp_Search rs= new HotelApp_Search(driver);
		new Select(rs.Location()).selectByVisibleText("Melbourne");
		rs.Submit().click();
	}
	
	/*public static void main(String[] args) throws FileNotFoundException, IOException{
		
		Browser("chrome");
	}*/
	
	}
