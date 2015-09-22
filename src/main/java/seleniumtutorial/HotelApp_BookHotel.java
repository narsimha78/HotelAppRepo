package seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelApp_BookHotel {
	
	private WebDriver driver;

	public HotelApp_BookHotel(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=("//*[@id='first_name']"))
	WebElement firstName;
	
	@FindBy(xpath=("//*[@id='last_name']"))
	WebElement lastName;
	
	@FindBy(xpath=("//*[@id='address']"))
	WebElement address;
	
	@FindBy(xpath=("//*[@id='cc_num']"))
	WebElement cc_num;
	
	@FindBy(xpath=("//*[@id='cc_type']"))
	WebElement cc_Type;
	
	@FindBy(xpath=("//*[@id='cc_exp_month']"))
	WebElement exp_Month;
	
	@FindBy(xpath=("//*[@id='cc_exp_year']"))
	WebElement exp_Year;
	
	@FindBy(xpath=("//*[@id='cc_cvv']"))
	WebElement cvv_Number;
	
	@FindBy(xpath=("//*[@id='book_now']"))
	WebElement book_Now;
	
	public WebElement FirstName(){
		
		return firstName;
		
	}
	
	public WebElement LastName(){
		
		return lastName;
	}
	
	public WebElement Address(){
		return address;
	}
	
	public WebElement creditCardNum(){
		
		return cc_num;
		
		}
	
	public WebElement creditCardType(){
		
		return cc_Type;
	}
	
	public WebElement expireMonth(){
		
		return exp_Month;
	}
	
	public WebElement expireYear(){
		
		return exp_Year;
	}
	
	public WebElement cvvNumber(){
		
		return cvv_Number;
	}
	
	public WebElement BookNowBtn(){
		
		return book_Now;
	}
	
	
	
	
	
	
	

}
