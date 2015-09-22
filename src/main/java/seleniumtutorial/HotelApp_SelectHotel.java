package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelApp_SelectHotel {

	
	private WebDriver driver;

	public HotelApp_SelectHotel(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	By HotelRadio=By.xpath(".//*[@id='radiobutton_2']");
	By Continue=By.id("continue");
	
	
	public WebElement HotelSelection(){
		
		return driver.findElement(HotelRadio);
		
	}
	
	public WebElement conTinue(){
		
		return driver.findElement(Continue);
		
	}
}
