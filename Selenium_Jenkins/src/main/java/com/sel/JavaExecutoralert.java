package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutoralert{
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('APjFqb').value='Java'");
	WebElement ele=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]"));
	jse.executeScript("arguments[0].click()",ele);
	String tit=(String)jse.executeScript("return document.domain");
	System.out.println(tit);
	driver.quit();
}
}