package com.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {
  public static void main(String args[]) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.rediff.com/");
	  WebElement ele=driver.findElement(By.xpath("(//a[@class=\"linkcolor bold\"])[2]"));
	  ele.click();
      WebElement ele1=driver.findElement(By.xpath("//span[@id=\"bseindex\"]"));
      System.out.println(ele1.getText());
      driver.quit();
  }
}
