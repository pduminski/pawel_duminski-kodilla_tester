package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroneFinderCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement dropdown = driver.findElement(By.cssSelector(".mr3m_1 > select"));
        Select select = new Select(dropdown);
        select.selectByValue("/kategoria/elektronika");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_56_m")));
        popup.click();

        WebElement input = driver.findElement(By.cssSelector("div > form > input"));
        input.sendKeys("Mavic mini");

        WebElement submitButton = driver.findElement(By.cssSelector("form > button"));
        submitButton.click();
    }
}

