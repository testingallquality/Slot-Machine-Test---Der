package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SlotMachinePageObjects {
	
	WebDriver Driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.id("gsr");
	
	public SlotMachinePageObjects(WebDriver Driver) {
		this.Driver = Driver;
	}

	public void setTextInSeachBox(String text) {
				Driver.findElement(textbox_search).sendKeys("A B C D");
			}
	
	 public void clickSearchButton() {
		 Driver.findElement(button_search).click();
	 }
	
}
