package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.Given;

public class MainSteps {
    // buraya neredeyse bütün sayfalarda kullanlacak olan ortak adımları yazabiliriz.

    @Given("User opens the website")
    public void openWebsite() {
        GWD.getDriver().get("https://www.teknikstore.com/");
    }

    @Given("User logs into website")
    public void loginTOWebsite() {
        // login testini yapacak olan kişi bu kısmı doldurabilir.

    }
}
