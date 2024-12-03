package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementMethods {
    @Test
    public void WEMethods(){
        WebDriver driver  = new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.findElement(By.id(""));
    }
}
