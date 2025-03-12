//package com.sel;
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//public class DropDown{
//
//public static void main(String[] args) {
//ChromeOptions options=new ChromeOptions();
//WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();

//driver.get("https://leafground.com/select.xhtml");
//WebElement auto=driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
//Select dropdown=new Select(auto);
//List<WebElement> list=dropdown.getOptions();
//System.out.println("The drop down options are:"+list.size());
//for(WebElement i:list) {
//System.out.println("The drop down options are:"+i.getText());
//}
//Boolean multiple=dropdown.isMultiple();
//System.out.println("The multiple options are:"+multiple);
//dropdown.selectByIndex(0); //0 index- means selected tool //
//dropdown.selectByVisibleText("Puppeteer");
//
//
//// dropdown.isMultiple()=checks if the dropdown allows multiple selections.
//// If isMultiple() returns false, it won't be called deselectByVisibleText(), avoiding the UnsupportedOperationException
//dropdown.deselectByVisibleText("Puppeteer");   //You may only deselect options of a multi-select
//
//}
//
//}

package com.sel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown{
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/selenium/web/formPage.html");
	WebElement dd=driver.findElement(By.xpath("//select[@id=\"multi\"]"));
	Select s=new Select(dd);
	List<WebElement> op=s.getOptions();
	for(WebElement ele:op) {
		System.out.println(ele.getText());
	}
	s.selectByVisibleText("Eggs");
	s.selectByValue("onion gravy");
	List<WebElement> sel=s.getAllSelectedOptions();
	for(WebElement ele:sel) {
		System.out.println(ele.getText());
	}
	s.deselectByVisibleText("Eggs");
	s.deselectAll();
}
}