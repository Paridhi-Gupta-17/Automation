package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.cssSelector("button[type='submit']");
    By successMsg = By.id("flash");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(){
        driver.findElement(username).sendKeys("tomsmith");
        driver.findElement(password).sendKeys("wrongpassword");
        driver.findElement(loginBtn).click();
    }

    public boolean success(){

        String msg =
                driver.findElement(successMsg)
                        .getText();

        System.out.println("Flash Message = " + msg);

        return msg.contains("You logged into a secure area!");
    }
    }
