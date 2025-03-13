package com.sel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround{
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://leafground.com/window.xhtml");
	
	 String parentWindow = driver.getWindowHandle();
     System.out.println("Parent Window Handle: " + parentWindow);
     
     driver.findElement(By.id("j_idt88:new")).click();
     //driver.close();
     
     // Click to open child windows
     driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
     driver.switchTo().window(parentWindow);
     
     WebElement open=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[1]"));
     open.click();
     System.out.println(open.getText());
     
     Set<String> allWindowHandles = driver.getWindowHandles();
     System.out.println("Total windows opened: " + allWindowHandles.size());
     
     driver.switchTo().window(parentWindow);
     WebElement openmultiple=driver.findElement(By.xpath("(//span[@class=\"ui-button-text ui-c\"])[2]"));
     openmultiple.click();
     System.out.println(openmultiple.getText());

     driver.close();
	}
}