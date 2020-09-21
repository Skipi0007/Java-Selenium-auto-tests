package net.myAnimeList;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CromDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "/Users/Skipi/IdeaProjects/JavaDrivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close() {
        driver.quit();
    }




}
