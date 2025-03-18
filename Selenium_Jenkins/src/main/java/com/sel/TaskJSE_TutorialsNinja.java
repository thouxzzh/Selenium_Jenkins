package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TaskJSE_TutorialsNinja {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement ip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search")));
        sendKeys(driver, ip); 

        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='search']//button")));
        click(driver, ele); 

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("history.go(0);");
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight);");
        jse.executeScript("window.scrollBy(0,500);");

        //driver.quit();
    }

 
    public static void sendKeys(WebDriver driver, WebElement ele) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='HP;", ele); 
    }


    public static void click(WebDriver driver, WebElement ele) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", ele);
    }
}
