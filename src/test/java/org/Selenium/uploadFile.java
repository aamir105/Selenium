package org.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class uploadFile {
    @Test
    public void FileUpload() throws IOException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://smallpdf.com/compress-pdf");
        driver.findElement(By.xpath("//span[@class='sc-8s01yt-4 dNifye']")).click();
        Runtime.getRuntime().exec("C:\\Users\\g\\IdeaProjects\\untitled3\\src\\test\\java\\org\\Selenium\\FileUploadAutoIt.exe");
        driver.findElement(By.xpath("//span[normalize-space()='Compress']"));
        driver.findElement(By.xpath("//span[normalize-space()='Download']"));

    }
}
