package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class LoginStepDefs {

    @Given("the user login the page")
    public void the_user_login_the_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("user")).sendKeys(ConfigurationReader.get("username"));
        Driver.get().findElement(By.id("password")).sendKeys(ConfigurationReader.get("password"));
        Driver.get().findElement(By.id("submit")).click();
    }

}
