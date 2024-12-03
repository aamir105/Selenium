package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    WebDriver driver;
    @Test
    public void contex() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        WebElement link = driver.findElement(By.linkText("Forgotten account?"));
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
        driver.quit();
    }
}
