package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Pages.LoginPage;

public class LoginSteps {

    public static WebDriver driver;
    LoginPage lp;

    @Given("user opens login page")
    public void openPage(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        lp = new LoginPage(driver);
    }

    @When("user enters username and password")
    public void login(){

        lp.login();
    }

    @Then("user should see success message")
    public void verify(){

        Assert.assertTrue(lp.success());
        driver.quit();
    }
}