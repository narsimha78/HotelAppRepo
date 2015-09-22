package smoketest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class javaScriptExample {

	@Test
	public void JavaScriptExample() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath(".//*[@id='contentcolumn']/div[1]/table/tbody/tr/td[2]/form/input")).click();
		
		
//		Alert javaScriptAlert=driver.switchTo().alert();
//		Thread.sleep(5000);
//		System.out.println(javaScriptAlert.getText());
//		javaScriptAlert.accept();
		
		//((JavascriptExecutor) driver).executeScript("inform()");
		
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");
		
		

		
		
	}

}
