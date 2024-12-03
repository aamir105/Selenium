package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

//        XPAth using single attribute
        driver.findElement(By.xpath("//*[title='MacBook']"));
//        XPath using multiple attribute
        driver.findElement(By.xpath("//*[@name='search'][@class='form-control]"));

//        Relative XPath
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("API");
//        Absolute XPath
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/input[1]")).sendKeys("JAVA");

//        XPAth with inner Test     text()
        driver.findElement(By.xpath("//a[text()='Desktops'"));

//        XPath using contain method
        driver.findElement(By.xpath("//*[contains(@class,'_1UgUYI ')]")).click();
    }
}
