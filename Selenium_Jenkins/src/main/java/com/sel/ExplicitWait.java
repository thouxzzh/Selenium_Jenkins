package com.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		WebElement ele=driver.findElement(By.xpath("//input[@id=\"reveal\"]"));
		ele.click();
		WebElement ele2=driver.findElement(By.xpath("//input[@id=\"revealed\"]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele2));
		ele2.sendKeys("Thoushi"+Keys.ENTER);
		System.out.println(ele2.isDisplayed());
		//System.out.println(ele2.getAttribute("value"));
		System.out.println(ele2.getDomProperty("value"));
		driver.quit();
		
	}
}

