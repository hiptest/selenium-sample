package com.example;
import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;

public class Actionwords {
    private Selenium selenium;

    Actionwords(WebDriver d) {
      selenium = new WebDriverBackedSelenium(d, "http://www.google.fr");
    }

    public void iOpenWebsite(String website) {
      selenium.open(website);
      selenium.waitForPageToLoad("");
    }

    public void iSearchForQuery(String query) {
      selenium.type("name=q", query);
      selenium.submit("name=f");
    }

    public void siteAppearsInTheFirstPage(String site) {

    }
}
