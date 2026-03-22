package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void takeScreenshot(Scenario scenario){

        if(scenario.isFailed()){

            byte[] screenshot =
                    ((TakesScreenshot) LoginSteps.driver)
                            .getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    "Failure Screenshot"
            );
        }
    }
}