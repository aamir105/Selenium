package org.Selenium;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
    @Test
    public void takeScreenShot(){
       WebDriver driver = new ChromeDriver();

        //Creating an object of Date class
        Date d = new Date();
        //Printing the actual date
        String date1 = d.toString();
        System.out.println(date1);
        //replacing the colon present in the date timestamp format to "_" using replaceAll()
        //method of String class
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        //Enter the url
        driver.get("https://www.facebook.com/");
        //Typecasting the driver object to TakesScreenshot interface type.
        TakesScreenshot ts = (TakesScreenshot) driver;
        //getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
    /*Created a folder called "screenshot" in the project directory
Created another file by concatenating the date value which has "_" in it
(Underscore is the accepted character while creating a file in the project )*/
        File destFile = new File("C:\\Users\\g\\IdeaProjects\\untitled3\\src\\test\\java\\org\\Selenium\\SS"+date2+"__fbLoginPage.png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
