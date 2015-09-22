package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelApp_Search {
	
	private WebDriver driver;
	
	public HotelApp_Search(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="location")
	WebElement location;

	@FindBy(id="Submit")
	WebElement submit;
	
	
	public WebElement Location(){
		
		return location;
	}
	
public WebElement Submit(){
		
		return submit;
	}
	
}
