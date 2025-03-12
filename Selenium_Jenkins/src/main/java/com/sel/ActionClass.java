//package com.sel;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

//public class ActionClass {
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		ChromeOptions options=new ChromeOptions();
//		WebDriver driver=new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.bstackdemo.com/");
//		WebElement ele=driver.findElement(By.xpath("//select"));
//		Actions action=new Actions(driver);
//		action.moveToElement(ele).perform();
//		WebElement customOption=driver.findElement(By.xpath("//option[text()='Lowest to highest']"));
//		customOption.click();
//		driver.close();
//		
//	}		
//}

package com.sel;

import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class ActionClass{

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    driver.get("https://omayo.blogspot.com");

	    WebElement blog=driver.findElement(By.id("blogsmenu"));

	    Actions action=new Actions(driver);

	    action.moveToElement(blog).perform();

	    WebElement blog2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));

	    action.moveToElement(blog2).click().build().perform();
   //action.click().perform()
	    driver.quit();
	}



}
