package org.Selenium;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Fb {
    WebDriver driver;
@Test
    public void loginpg(){
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("10aamir5@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Aamir@105");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.findElement(By.linkText("Forgotten account?")).click();
    }

    @Test
    public void Registration(){
    driver = new EdgeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.findElement(By.name("firstname")).sendKeys("Mohammed");
        driver.findElement(By.name("lastname")).sendKeys("Aamir");
        driver.findElement(By.id("day")).sendKeys("8");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
        driver.findElement(By.id("year")).sendKeys("2001");
        driver.findElement(By.name("reg_email__")).sendKeys("10aamir5@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Aamir@123");
        driver.findElement(By.name("websubmit")).click();
        driver.quit();

    }
@Test
    public void WebDriverInterfaces() throws InterruptedException {
    driver = new ChromeDriver();
//    driver.get("https://www.flipkart.com/");
    driver.get("https://www.facebook.com/");
//    Thread.sleep(3000);
//    driver.getTitle();
//    driver.getPageSource();
//    driver.getCurrentUrl();
//    driver.getWindowHandle();
//    driver.navigate().forward();
//    driver.navigate().back();
//    driver.navigate().to("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fedit%2F%3F__coig_login%3D1");
//    driver.navigate().refresh();
    driver.findElement(By.cssSelector("input#email")).sendKeys("10aamir5@gmail.com");
//    List<WebElement> headerLinks = driver.findElements(By.className("_2-LWwB"));
//    System.out.println("Total Number of Header Links" + headerLinks.size());
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Total Links are: "+links.size());
}
@Test
    public void cssSelector(){
    driver = new ChromeDriver();
//    driver.get("https://www.facebook.com/");
        driver.get("https://www.flipkart.com/");
//
//    tag id
//    driver.findElement(By.cssSelector("input#email")).sendKeys("10aamir5@gmail.com");

//    tag class
//    driver.findElement(By.cssSelector("input.inputtext")).sendKeys("10aamir5@gmail.com");
//    driver.findElements(By.cssSelector("_3sdu8W emupdz"));

//    tag attribute
//    driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Mobiles");

//    tag class attribute
    driver.findElement(By.cssSelector("input.Pke_EE[title=\"Search for Products, Brands and More\"]")).sendKeys("POLO T-shirts");
}
}
