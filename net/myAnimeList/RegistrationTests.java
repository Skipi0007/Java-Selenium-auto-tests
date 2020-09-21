package net.myAnimeList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.CookieManager;
import java.util.Random;

public class RegistrationTests extends CromDriverSettings {





    @Test

    public void SearchTopComedy() {

        driver.get("https://myanimelist.net/");

        WebElement nav = driver.findElement(By.cssSelector(".small:first-child"));
        nav.click();
        nav.findElement(By.xpath(".//*[text()='Anime Search']/..")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/anime/genre/4/Comedy\"]")));
        driver.findElement(By.cssSelector("a[href=\"/anime/genre/4/Comedy\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-view-style:last-child")));
        driver.findElement(By.cssSelector(".btn-view-style:last-child")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-id=\"score\"]")));
        driver.findElement(By.cssSelector("a[data-id=\"score\"]")).click();

        WebElement content = driver.findElement(By.id("content"));
        content.findElement(By.xpath("//div[4]/table/tbody/tr[2]/td[1]/div/a")).click();

        close();

        }


    @Test

    public void Registration() {

        //driver.manage().deleteAllCookies();

        driver.get("https://myanimelist.net/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("MyAnimeList.net - Anime and Manga Database and Community"));

        driver.findElement(By.className("btn-signup")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));

        Random random = new Random();
        int n = random.nextInt(1000) + 1;

        driver.findElement(By.id("loginEmail")).sendKeys("example" + n + "@mail.com");
        driver.findElement(By.className("password_checker_user_name")).sendKeys("User" + n);
        driver.findElement(By.id("login-password")).sendKeys("Password1");
        driver.findElement(By.className("po-r")).click();
        driver.findElement(By.className("btn-form-submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("goodresult")));

        close();

        System.out.println("Registration test complete");
    }


}

