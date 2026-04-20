package testScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CountNoOfLinks {

	@Test
	public void CountLinks()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+links.size());
		
		int visibleLinks=0;
		for(WebElement link:links)
		{
			if(link.isDisplayed())
			{
				visibleLinks++;
				System.out.println(link.getText());
			}
		}
		System.out.println("Visible links="+visibleLinks);
		
		driver.quit();
		
	}
}
