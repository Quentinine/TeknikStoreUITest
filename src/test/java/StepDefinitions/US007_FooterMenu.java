package StepDefinitions;

import Pages.FooterContent;
import Pages.ParentPage;
import Utilities.GWD;
import Utilities.MyFunc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class US007_FooterMenu extends GWD {

    FooterContent fc = new FooterContent(getDriver());
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public static void scrolltoElementFalse(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    // Yeni uyelik
    @And("User clicks 'Yeni üyelik' on footer menu.")
    public void clickYeniUyelik() {

        scrolltoElementFalse(fc.yeniUyelikFooter);

        wait.until(ExpectedConditions.visibilityOf(fc.yeniUyelikFooter));
        MyFunc.myClick(fc.yeniUyelikFooter);
    }

    @Then("User directs to 'Yeni Üyelik' page.")
    public void confirmsYeniUyelik() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/uye-ol"));
    }

    // Uye girisi
    @And("User clicks 'Üye Girişi' on footer menu.")
    public void clickUyeGirii() {
        wait.until(ExpectedConditions.visibilityOf(fc.uyeGirisiFooter));
        ParentPage.myClick(fc.uyeGirisiFooter);
    }

    @Then("User directs to 'Üye Girişi' page.")
    public void confirmsUyeGirisi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/uye-girisi"));
    }

    // Sifremi unuttum
    @And("User clicks 'Şifremi Unuttum' on footer menu.")
    public void clickSifremiUnuttum() {
        wait.until(ExpectedConditions.visibilityOf(fc.sifremiUnuttumFooter));
        ParentPage.myClick(fc.sifremiUnuttumFooter);
    }

    @Then("User directs to 'Şifremi Unuttum' page.")
    public void confirmsSifremiUnuttum() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/sifremi-unuttum"));
    }

    // İletişim
    @When("User clicks 'İletişim' on footer menu.")
    public void clickIletisim() {
        scrolltoElementFalse(fc.iletisimFooter);

        wait.until(ExpectedConditions.visibilityOf(fc.iletisimFooter));
        MyFunc.myClick(fc.iletisimFooter);
    }

    @Then("User directs to 'İletişim' page.")
    public void confirmsIletisim() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/iletisim"));
    }

    // İletişim formu
    @When("User clicks 'İletişim formu' on footer menu.")
    public void clickIletisimFormu() {
        wait.until(ExpectedConditions.visibilityOf(fc.iletisimFormuFooter));
        ParentPage.myClick(fc.iletisimFormuFooter);
    }

    @Then("User directs to 'İletişim formu' page.")
    public void confirmsIletisimFormu() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/iletisim-formu"));
    }

    // Havale bildirim formu
    @When("User clicks 'Havale Bildirim Formu' on footer menu.")
    public void clickHavalebildirimFormu() {
        wait.until(ExpectedConditions.visibilityOf(fc.havaleBildirimFooter));
        ParentPage.myClick(fc.havaleBildirimFooter);
    }

    @Then("User directs to 'Havale Bildirim Formu' page.")
    public void confirmsHavalebildirimFormu() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/havalebildirim-formu"));
    } // öncesinde login istiyor login eklenince eklenecek

    // Kargo Takibi
    @When("User clicks 'Kargo takibi' on footer menu.")
    public void clickKargoTakibi() {
        wait.until(ExpectedConditions.visibilityOf(fc.kargoTakibiFooter));
        ParentPage.myClick(fc.kargoTakibiFooter);
    }

    @Then("User directs to 'Kargo Takibi' page.")
    public void confirmsKargoTakibi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/kargo-takibi"));
    }

    // Mesafeli Satış Sözleşmesi
    @When("User clicks 'Mesafeli Satış Sözleşmesi' on footer menu.")
    public void mesafeliSozlesmeClick() {
        wait.until(ExpectedConditions.visibilityOf(fc.mesafeliSatisFooter));
        ParentPage.myClick(fc.mesafeliSatisFooter);
    }

    @Then("User directs to 'Mesafeli Satış Sözleşmesi' page.")
    public void confirmsMesafeliSatis() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/mesafeli-satis"));
    }

    // Gizlilik ve güvenlik
    @When("User clicks 'Gizlilik ve güvenlik' footer menu.")
    public void clickGizlilikVeGizlilik() {
        wait.until(ExpectedConditions.visibilityOf(fc.gizlilikVeGuvenlikFooter));
        ParentPage.myClick(fc.gizlilikVeGuvenlikFooter);
    }

    @Then("User directs to 'Gizlilik ve güvenlik' page.")
    public void confirmsGizlilikVeGizlilik() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/gizlilik-ve-guvenlik"));
    }

    // İade ve değişim koşulları
    @When("User clicks 'İade ve Değişim Koşulları' on footer menu.")
    public void clickIadeveDegisim() {
        wait.until(ExpectedConditions.visibilityOf(fc.iadeVeDegisimFooter));
        ParentPage.myClick(fc.iadeVeDegisimFooter);
    }

    @Then("User directs to 'İade ve Değişim Koşulları' page.")
    public void confirmIadeveDegisim() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/iptal-ve-iade-sartlari"));
    }

    // Kişisel veriler politikası
    @When("User clicks 'Kişisel Veriler Politikası' on footer menu.")
    public void clickKiiselVerilerPolitikasi() {
        wait.until(ExpectedConditions.visibilityOf(fc.kisiselVerilerFooter));
        ParentPage.myClick(fc.kisiselVerilerFooter);
    }

    @Then("User directs to 'Kişisel Veriler Politikası' page.")
    public void confirmsKiiselVerilerPolitikasi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/kisisel-veriler-politikasi"));
    }

    // Sıkça sorulan sorular
    @When("User clicks 'Sıkça Sorulan Sorular' on footer page.")
    public void clickSikcaSorulanSorular() {
        wait.until(ExpectedConditions.visibilityOf(fc.sikcaSorulanFooter));
        ParentPage.myClick(fc.sikcaSorulanFooter);
    }

    @Then("User directs to 'Sıkça Sorulan Sorular' page.")
    public void confirmSikcaSorulanSorular() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/sikca-sorulanlar"));
    }

    // Site haritası
    @When("User clicks 'Site Haritası' on footer menu.")
    public void clickSiteHaritasi() {
        wait.until(ExpectedConditions.visibilityOf(fc.siteHaritasiFooter));
        ParentPage.myClick(fc.siteHaritasiFooter);
    }

    @Then("User directs to 'Site Haritası' page.")
    public void confirmSiteHaritasi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/site-haritasi"));
    }
}