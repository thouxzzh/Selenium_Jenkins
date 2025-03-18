//package com.sel;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TutorialsNinjaBlink {
//public static void main(String[] args) throws InterruptedException {
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
//		WebElement ele=driver.findElement(By.name("firstname"));
//		ele.sendKeys("Thoushi");
//	    WebElement ele1=driver.findElement(By.name("lastname"));
//	    ele1.sendKeys("Francis");
//	    WebElement ele2=driver.findElement(By.name("email"));
//	    ele2.click();
//	    WebElement ele3=driver.findElement(By.name(""))
//  public static void flashElement(WebDriver driver,WebElement element) {
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  
//	  String originalColor=element.getCssValue("backgroundColor");
//	  for(int i=0;i<3;i++) {
//		  js.executeScript("arguments[0].style.backgroundColor='red;",element);
//		  try {
//			  Thread.sleep(500);
//		  }
//		  catch(InterruptedException e) {
//			  e.printStackTrace();
//		  }
//		  js.executeScript("arguments[0].style.backgroundColor='",+originalColor+"';",element);
//		  try {
//			  Thread.sleep(500);
//		  }
//		  catch(InterruptedException e) {
//			  e.printStackTrace();
//		  }
//	  }
//  }
//}
//}
