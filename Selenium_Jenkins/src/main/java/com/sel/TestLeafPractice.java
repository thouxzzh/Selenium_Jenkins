//package com.sel;
//
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
//public class TestLeafPractice {
//  public static void main(String args[]) {
//	  ChromeOptions options=new ChromeOptions();
//		WebDriver driver=new ChromeDriver(options);
//		driver.get("https://leafground.com/select.xhtml");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////		WebElement menu=driver.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
////	  	Select dropdown=new Select(menu);
//	  	
//	  	List<WebElement> op=driver.findElements(By.xpath("//option[@class=\"ui-selectonemenu-label\"]"));
//	  	System.out.println("options are"+op.size());
//	  	String option="Cypress";
//		for(int i=0;i<op.size();i++) {
//	  		if(op.get(i).getText().contains(option)) {
//	  			op.get(i).click();
//	  			System.out.println("Clicked");
//	  			break;
//	  		}
//	  	}
//	  }
//}

package com.sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLeafPractice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		  driver1.manage().window().maximize();
		  driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver1.get("https://leafground.com/select.xhtml");
		  WebElement drop=driver1.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]"));
		  Actions a=new Actions(driver1);
		  a.moveToElement(drop).perform();
		  WebElement f=driver1.findElement(By.xpath("//select[@class=\"ui-selectonemenu\"]//option[3]"));
		  f.click();
		  System.out.println("completed");
		  WebElement ele=driver1.findElement(By.xpath("//i[@class=\"pi pi-server layout-menuitem-icon\"]"));
		  ele.click();
		  WebElement checkbox=driver1.findElement(By.xpath("//li[@id=\"menuform:m_checkbox\"]"));
		  checkbox.click();
		  System.out.println("drop down completed");
		  WebElement check=driver1.findElement(By.xpath("//table[@class=\"ui-selectmanycheckbox ui-widget\"]//descendant::tr//td"));
		  check.click();
		  WebElement checkbox1=driver1.findElement(By.xpath("//div[@id=\"j_idt87:multiple\"]"));
		  checkbox1.click();
		  List<WebElement> checkboxes = driver1.findElements(By.xpath("//ul[@class=\"ui-selectcheckboxmenu-items ui-selectcheckboxmenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset\"]//li//label"));
	        for (WebElement box : checkboxes) {
	            if (!box.isSelected()) {
	                box.click();
	            }
	        }
	        
	        System.out.println("All checkboxes selected");
	    }
	
	}