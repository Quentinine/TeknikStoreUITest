package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class MainSteps {
    // buraya neredeyse bütün sayfalarda kullanlacak olan ortak adımları yazabiliriz.

    @Given("User opens the website.")
    public void openWebsite() {
        GWD.getDriver().get("https://www.teknikstore.com/");
    }

}
