package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HotelApp_Logout {
	
	private WebDriver driver;

	public HotelApp_Logout(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By logout=By.linkText("Logout");
	By loginBack=By.partialLinkText("Click here to login");
	
	
	public WebElement LogoutLink(){
		
		return driver.findElement(logout);
	}
	
	public WebElement loginAgain(){
		
		return driver.findElement(loginBack);
	}
}
