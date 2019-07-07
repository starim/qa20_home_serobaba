package com.telran.trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenTrello {

    WebDriver wb;

    @BeforeMethod

    public void setUp() {

        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void openTrelloSite(){

        wb.get("https://trello.com/");
        System.out.println("Site have been opened");

    }

    @AfterMethod

    public void tearDown(){
        wb.quit();
    }
}
