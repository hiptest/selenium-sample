package com.example;

import org.junit.Before;
import junit.framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ProjectTest extends TestCase {

    private WebDriver driver;
    public Actionwords actionwords;

    @Before
    public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
      driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      actionwords = new Actionwords(driver);
    }


    public void testSimpleTest() {
      actionwords.iOpenWebsite("google.fr");
      actionwords.iSearchForQuery("La poste");
      actionwords.siteAppearsInTheFirstPage("laposte.fr");
    }
}