package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExe {
    @Test
    public void JSExecutor(){
        WebDriver driver  = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Aamir");
    }
}
