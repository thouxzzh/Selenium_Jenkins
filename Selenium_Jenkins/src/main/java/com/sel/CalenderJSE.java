//package com.sel;
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CalenderJSE{
//    public static void main(String[] args) {
//        
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
//
//    
//        WebElement in = driver.findElement(By.id("datepicker"));
//
//    
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].value='01/29/2004';",in);
//        String val = (String) js.executeScript("return arguments[0].value;",in);
//        System.out.println("Selected Date: " +val);
//
//       // driver.quit();
//    }
//}

package com.sel;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderJSE {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        WebElement dateInput = driver.findElement(By.id("datepicker"));
        setDate(driver, dateInput, "01/29/2004");

        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        // driver.quit();
    }

    public static void setDate(WebDriver driver, WebElement element, String date) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='" +date+ "';", element);
    }
}
