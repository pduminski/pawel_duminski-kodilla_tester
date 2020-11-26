package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroneFinderXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement dropdown = driver.findElement(By.xpath("//*/select[contains(@class, \"mr3m_1\")]"));
        Select select = new Select(dropdown);
        select.selectByValue("/kategoria/elektronika");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[7]/div/div[2]/div/div[2]/button[2]")));
        popup.click();


//        WebElement input = driver.findElement(By.xpath("//*/input[@type=\"search\"]"));
        WebElement input = driver.findElement(By.xpath("//input"));
        input.sendKeys("Mavic mini");

        WebElement submitButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submitButton.click();
    }
}
