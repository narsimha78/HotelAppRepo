package smoketest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	@Test
	public void DropD()
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[7]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Narsimha Reddy");
		driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("guduu2332");
		Select selc =new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[1]")));
		selc.selectByVisibleText("25");
		
		new Select(driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[2]"))).selectByValue("03");
		//new Select("driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[3]"))).selectByIndex(1);
		
		WebElement option = driver.findElement(By.xpath(".//*[@id='wrapper']/table[2]/tbody/tr[23]/td[3]/select[3]"));
		List<WebElement> count = option.findElements(By.tagName("option"));
		System.out.println(count.size());
		
		for(int i=0; i<count.size(); i++)
		{
			if(count.get(i).getText().equalsIgnoreCase("2007"))
			{
				count.get(i).click();
				break;
			}
		}
			
		
		
		

	}
}
