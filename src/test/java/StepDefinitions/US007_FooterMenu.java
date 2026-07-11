package StepDefinitions;

import Pages.FooterContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US007_FooterMenu extends GWD {

    FooterContent fc = new FooterContent(GWD.getDriver());


    @When("User scrolls down the page.")
    public void scrollDownFooterContent() {
        ParentPage.scrollToElement(fc.siteHaritasiFooter);

    }

    // Yeni uyelik
    @And("User clicks 'Yeni üyelik'.")
    public void clickYeniUyelik() {
        ParentPage.myClick(fc.yeniUyelikFooter);

    }

    @Then("User directs to 'Yeni Üyelik' page.")
    public void confirmsYeniUyelik() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/uye-ol"));

    }

    // Uye girisi
    @And("User clicks 'Üye Girişi'.")
    public void clickUyeGirii() {
        ParentPage.myClick(fc.uyeGirisiFooter);

    }

    @Then("User directs to 'Üye Girişi' page.")
    public void confirmsUyeGirisi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/uye-girisi"));

    }

    // Sifremi unuttum
    @And("User clicks 'Şifremi Unuttum'.")
    public void clickSifremiUnuttum() {
        ParentPage.myClick(fc.sifremiUnuttumFooter);

    }

    @Then("User directs to 'Şifremi Unuttum' page.")
    public void confirmsSifremiUnuttum() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/sifremi-unuttum"));

    }

}
