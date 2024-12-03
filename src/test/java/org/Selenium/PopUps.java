package org.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class PopUps {

    @Test
    public void alertPopUpTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert Text: "+text);
        Thread.sleep(3000);
        alert.accept();

    }

    @Test
    public void TimerAlertPopUpTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", timerAlertButton);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Wait for up to 10 seconds
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();

    }

    @Test
    public void AlertConfirmTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        WebElement timerAlertButton = driver.findElement(By.id("confirmButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", timerAlertButton);

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert Text: "+text);
        Thread.sleep(3000);
        alert.dismiss();        /*For cancel*/
        alert.accept();         /*For OK*/

    }



    @Test
    public void testPromtAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        WebElement timerAlertButton = driver.findElement(By.id("promtButton"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", timerAlertButton);

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.sendKeys("Welcome everybody!!! ");
        System.out.println("Alert Text: "+text);
        Thread.sleep(3000);
        alert.accept();

    }
}

