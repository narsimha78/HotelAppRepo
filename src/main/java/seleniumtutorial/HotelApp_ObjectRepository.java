package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelApp_ObjectRepository {

	private WebDriver driver;


	public HotelApp_ObjectRepository(WebDriver driver){
		
		this.driver=driver;
	}
		
		
		

		By userName = By.id("username");
		By passWord = By.id("password");
		By Login = By.id("login");
		
		public WebElement username(){
			return driver.findElement(userName);
		
		}
		
		public WebElement password(){
			return driver.findElement(passWord);
		
		}
		
		public WebElement login(){
			return driver.findElement(Login);
		
		}
		
		
}
