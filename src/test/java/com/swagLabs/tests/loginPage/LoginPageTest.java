package com.swagLabs.tests.loginPage;

import com.swagLabs.Pages.LoginPage;
import com.swagLabs.tests.TestBase;
import com.swagLabs.utilities.ConfigurationReader;
import com.swagLabs.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginStandardUser() {

        driver.get(ConfigurationReader.get("url"));
        loginPage.loginAsStandardUser();

        String expectedUrl = "https://www.saucedemo.com/inventory.html";

       Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }
}
