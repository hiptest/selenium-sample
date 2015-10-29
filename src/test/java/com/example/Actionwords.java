package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Actionwords {
    private WebDriver driver;

    Actionwords() {
      driver = new FirefoxDriver();
    }

    public void iOpenWebsite(String website) {
      driver.get(website);
    }

    public void iSearchForQuery(String query) {
      WebElement element = driver.findElement(By.name("q"));
      element.clear();
      element.sendKeys(query);
      element.submit();
    }

    public void siteAppearsInTheFirstPage(String site) {
    }
}
