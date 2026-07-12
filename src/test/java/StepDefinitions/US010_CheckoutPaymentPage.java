package StepDefinitions;

import Pages.CheckOutPage;
import Pages.DialogContent;
import Pages.ParentPage;
import Utilities.FakerClass;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class US010_CheckoutPaymentPage extends GWD {

    DialogContent dc = new DialogContent(getDriver());
    CheckOutPage cp = new CheckOutPage(getDriver());


    //sepete ekleme kısmını atladım direkt sepetten

    @And("User clicks on 'Alısverisi tamamla'.")
    public void alisverisiTamamlaButton() {
        //eklenen ürünlerin dogrulugu baska adımda kontrol edilmişti yine de eklemeli miyim?
        ParentPage.myClick(cp.alisverisiTamamlaButton);

    }

    @And("User clicks on 'Uye olmadan devam et'.")
    public void uyeOlmadanDevamEt() {
        ParentPage.myClick(cp.uyeOlmadanDevamEtButton);

    }

    @And("User enters email.")
    public void emailSend() {

        ParentPage.mySendKeys(cp.email, FakerClass.randomEmail());

    }

    @And("User enters name.")
    public void nameSend() {

        ParentPage.mySendKeys(cp.firstName, FakerClass.firstName());

    }

    @And("User enters surname.")
    public void surnameSend() {

        ParentPage.mySendKeys(cp.surname, FakerClass.lastName());

    }

    @And("User selects city.")
    public void citySelect() {
        Select selectCity = new Select(cp.selectTown);
        selectCity.selectByValue("11");

    }

    @And("User selects subcity.")
    public void subcitySelect() {
        Select selectCity = new Select(cp.selectIlce);
        selectCity.selectByValue("100");

    }

    @And("User enters mobile phone number.")
    public void phoneNumberSend() {
        ParentPage.mySendKeys(cp.phoneNumber, FakerClass.phoneNumber());

    }

    @And("User enters address.")
    public void addressSend() {
        ParentPage.mySendKeys(cp.address, FakerClass.fullAddress());

    }

    @And("User clicks 'Ödeme İşlemleri'.")
    public void odemeIslemleriClick() {
        ParentPage.myClick(cp.odemeIslemleriButton);

    }

    @Then("User directs to payment page.")
    public void directsToPaymentPage() {
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/order/step3"));

    }
}
