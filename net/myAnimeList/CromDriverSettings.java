package net.myAnimeList;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

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
