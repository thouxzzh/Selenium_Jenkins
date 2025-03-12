package com.sel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWaitAccess2{
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://configureselenium.blogspot.com/");
	WebElement ele=driver.findElement(By.xpath("(//li[@class=\"overflowable-item\"]//a)[1]"));
	ele.click();
	WebElement c=driver.findElement(By.xpath("//span[@id=\"Stats1_totalCount\"]"));
	System.out.println(c.getText());
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(c));
	System.out.println(c.getText());
	driver.quit();
}
}