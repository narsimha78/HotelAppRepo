package smoketest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	
	@Test
	public void Dragable(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		driver.switchTo().frame(0);
		
		WebElement slide = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slide).dragAndDropBy(slide, 200, 0).build().perform();
		
		
		
		
		
		
	}

}
