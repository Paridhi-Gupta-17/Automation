package stepdefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import Pages.LoginPage;
// changing for push my second changes for jenkins pus again 

public class LoginSteps {

    public static WebDriver driver;
    LoginPage lp;

    @Given("user opens login page")
    public void openPage(){

        WebDriverManager.chromedriver().browserVersion("146").setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

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
