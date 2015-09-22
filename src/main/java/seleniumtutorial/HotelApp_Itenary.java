package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelApp_Itenary {

	private WebDriver driver;

	public HotelApp_Itenary(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath=("//*[@id='my_itinerary']"))
	WebElement bookedItenary;
	
	public WebElement Bookeditenary(){
		
		return bookedItenary;
	}
}
