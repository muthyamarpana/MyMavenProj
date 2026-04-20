package testScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AutoSuggHandling {

	@Test
	public void googleAutoSugg() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("Bangalore");
		Thread.sleep(3000);
		List<WebElement> opts=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(WebElement opt:opts)
		{
			if(opt.getText().equalsIgnoreCase("bangalore weather"))
			{
				opt.click();
				Thread.sleep(3000);
				break;
			}
		}
		driver.quit();
	}
}
