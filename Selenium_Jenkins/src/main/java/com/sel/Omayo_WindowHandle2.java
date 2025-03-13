package com.sel;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Omayo_WindowHandle2 {
     public static void main(String args[]) {
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         driver.get("https://omayo.blogspot.com/");
         
     }
}
