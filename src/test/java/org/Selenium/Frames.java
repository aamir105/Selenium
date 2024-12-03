package org.Selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {
    WebDriver driver;
    @Test
    public void frameIndexOfTest() {
    driver = new ChromeDriver();
    driver.get("file:///C://Users//g//Documents//t1.html");

    //using index of the frame - [ int value] [ index of frames starts with zero]
    driver.switchTo().frame(0);
    driver.findElement(By.id("t1")).sendKeys("a");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("a");

    }

    @Test
    public void frameIdAttributeTest() {
    driver = new ChromeDriver();
    driver.get("file:///C://Users//g//Documents//t1.html");

    //using id attribute of the frame -string
    driver.switchTo().frame("f1");
    driver.findElement(By.id("t1")).sendKeys("b");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("b");
    }

    @Test
    public void frameNameAttributeTest() {
    driver = new ChromeDriver();
    driver.get("file:///C://Users//g//Documents//t2.html");

    //using name attribute of the frame -string
    driver.switchTo().frame("n1");
    driver.findElement(By.id("t1")).sendKeys("c");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("c");
    }

    @Test
    public void frameAddressTest() {
    driver = new ChromeDriver();
    driver.get("file:///C://Users//g//Documents//t2.html");

    //using address of the frame -webelement
    WebElement f = driver.findElement(By.className("c1"));
    driver.switchTo().frame(f);
    driver.findElement(By.id("t1")).sendKeys("d");
    driver.switchTo().defaultContent();
    driver.findElement(By.id("t2")).sendKeys("d");
    }
}
