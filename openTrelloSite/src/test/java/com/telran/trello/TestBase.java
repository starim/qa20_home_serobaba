package com.telran.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wb;

    @BeforeMethod

    public void setUp() {

        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openSiteTrello("https://trello.com/");
        logine();
    }

    public void openSiteTrello(String urlAddress) {
        wb.get(urlAddress);
    }

    public void logine() {
        clickElementLogin();
        fillLoginForm("sierobaba@yahoo.com", "ZaeblO11");
        createLogin();



    }

    public void createLogin() {
    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
    }

    public void type(By locator, String text) {
        wb.findElement(locator).click();
        wb.findElement(locator).clear();
        wb.findElement(locator).sendKeys(text);
    }

    public void clickElementLogin() {
        click("//*[@class='btn btn-success btn-lg px-4']");
    }

    public void click(String locator) {
        wb.findElement(By.xpath(locator)).click();
    }


    @AfterMethod

    public void tearDown(){
        wb.quit();
    }
}

