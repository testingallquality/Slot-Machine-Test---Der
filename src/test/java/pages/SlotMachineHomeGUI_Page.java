package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SlotMachineHomeGUI_Page {
	
	private static WebElement element = null;
	
	public static WebElement textbox_Search(WebDriver Driver)
	{
		 element = Driver.findElement(By.name("testdata"));
		return element;
	}

	public static WebElement button_search(WebDriver Driver)
	{
		//element = driver.findElement(By.name("testdata"));
		element = Driver.findElement(By.id("spinButton"));
				return element;
	}
}
