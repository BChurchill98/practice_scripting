package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rockstargames.com");

        WebElement closeButton = driver.findElement(By.xpath("my-text"));
    }
}
