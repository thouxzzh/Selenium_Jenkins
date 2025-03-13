package com.sel;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo_WindowHandle{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://omayo.blogspot.com/");
        
        // Store the parent window handle
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
        
        // Click to open child windows
        driver.findElement(By.id("selenium143")).click();
//        String ele=driver.findElement(By.linkText("What is Selenium?")).getText();
//        System.out.println(ele);
//     
        
        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total windows opened: " + allWindowHandles.size());
        
        // Iterate through all windows
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to window: " + windowHandle);
                
      
                    String text = driver.findElement(By.linkText("What is Selenium?")).getText();
                    System.out.println("Inner text: " +text);
                // Close the child window
                driver.close();
            }
        }
        
        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        String text1=driver.findElement(By.linkText("Page One")).getText();
        System.out.println("Text:"+text1);
        
        Set<String> allWindowHandles1= driver.getWindowHandles();
        System.out.println("Total windows opened: " + allWindowHandles1.size());
        
        // Close the parent window and quit the driver
        driver.quit();
    }
}