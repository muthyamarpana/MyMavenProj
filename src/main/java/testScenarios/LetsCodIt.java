package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LetsCodIt {

	@Test
	public void handlingAllWebElements()
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement bmwRad=driver.findElement(By.id("bmwradio"));
		bmwRad.click();
		if(bmwRad.isSelected())
		{
			System.out.println("BMW is selected");
		}
		else
		{
			System.out.println("BMW is not selected");
		}
		WebElement chkBenz=driver.findElement(By.id("benzcheck"));
		WebElement chkHonda=driver.findElement(By.id("hondacheck"));
		
		chkBenz.click();
		chkHonda.click();
		
		if(chkBenz.isSelected())
		{
			System.out.println("Benz is selected...");
		}
		else
		{
			System.out.println("Benz is not selected..");
		}
		if(chkHonda.isSelected())
		{
			System.out.println("Honda is selected");
		}
		else
		{
			System.out.println("Honda is not selected");
		}
	driver.quit();	
		
		
		
	}
}
