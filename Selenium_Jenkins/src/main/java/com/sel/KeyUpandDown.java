package com.sel;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class KeyUpandDown {
  public static void main(String args[]) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://omayo.blogspot.com/");
	  Actions action=new Actions(driver);
	  WebElement jqueryui=driver.findElement(By.linkText("jqueryui"));
	  action.keyDown(Keys.CONTROL).moveToElement(jqueryui).click().keyUp(Keys.CONTROL).build().perform();
  }
}
