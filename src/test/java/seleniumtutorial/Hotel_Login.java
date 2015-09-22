package seleniumtutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumtutorial.HotelApp_BusinessFuctions;

public class Hotel_Login extends HotelApp_BusinessFuctions {

	//static Properties prop;
	//static WebDriver driver;
	static String sUrl;
	//static String sBrowser;

	@BeforeClass
	public void setUp() throws FileNotFoundException, IOException{

		prop = new Properties();
		prop.load(new FileInputStream(".\\configuration\\configuration.properties"));
		setup();		
	}

	@Test
	public void login(){
		Login();
	}


	@Test(dependsOnMethods={"login"})
	public void testHotelApp() throws FileNotFoundException, IOException{

		// Search Page
		Search();
		
		//Select page
		HotelApp_SelectHotel rselect = new HotelApp_SelectHotel(driver);
		rselect.HotelSelection().click();
		rselect.conTinue().click();
		
		//Booking Page
		HotelApp_BookHotel book=new HotelApp_BookHotel(driver);
		book.FirstName().sendKeys("test");
		book.LastName().sendKeys("test");
		book.Address().sendKeys("test");
		book.creditCardNum().sendKeys("1234768956438796");
		new Select(book.creditCardType()).selectByVisibleText("Master Card");
		new Select(book.expireMonth()).selectByVisibleText("July");
		new Select(book.expireYear()).selectByVisibleText("2021");
		book.cvvNumber().sendKeys("2345");
		book.BookNowBtn().click();

		//Itenary Page
		HotelApp_Itenary Itenary=new HotelApp_Itenary(driver);
		Itenary.Bookeditenary().click();

		//Logout Page
		HotelApp_Logout logout=new HotelApp_Logout(driver);
		logout.LogoutLink().click();
		logout.loginAgain().click();	


	}

	@AfterClass
	public void terminate(){

		driver.quit();
	}


}
