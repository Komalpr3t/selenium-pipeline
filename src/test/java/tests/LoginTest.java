package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get(
                "https://practicetestautomation.com/practice-test-login/"
        );

        driver.findElement(By.id("username"))
                .sendKeys("student");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("submit"))
                .click();

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("logged-in-successfully")
        );
    }
}