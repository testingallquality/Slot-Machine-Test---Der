package com.Der;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlotMachineMain {

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);

        System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromedriver/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get(projectPath+"\\src\\test\\Test_Task.html");
        //WebElement textBox1 = Driver.findElement(By.xpath("//input[@title='Search']"));
        WebElement textBox = Driver.findElement(By.id("testdata"));
        textBox.clear();
        textBox.sendKeys("55555");
        Driver.findElement(By.id("spinButton")).click();
        Driver.findElement(By.xpath("//*[@id=\"balance-value\"]")).click();

        String balance1 = Driver.findElement(By.xpath("//*[@id=\"balance-value\"]")).getTagName();

        if (balance1 != "input")

        {
            System.out.println("Test Step1 Pass - Current balance is displayed with Property value " + balance1);
        } else {
            System.out.println("Test Step1 Fail - Current balance is Not displayed with Property value ");

        }

        Boolean balanceExists =  Driver.findElement(By.id("balance-value")).isDisplayed();

        if (balanceExists)

        {
            System.out.println("Test Step2 Pass - Current balance is displayed with Property value " + balanceExists);
        } else {
            System.out.println("Test Step2 Fail - Current balance is Not displayed with Property value ");

        }

        System.out.println("textBox" + textBox);


    }
}
