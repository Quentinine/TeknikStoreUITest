package StepDefinitions;

import Pages.FooterContent;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class US007_FooterMenu extends GWD {

    FooterContent fc = new FooterContent(getDriver());


    @When("User scrolls down the page.")
    public void scrollDownFooterContent() {
        ParentPage.scrollToElement(fc.siteHaritasiFooter);

    }

    // Yeni uyelik
    @And("User clicks 'Yeni üyelik' on footer menu.")
    public void clickYeniUyelik() {
        ParentPage.myClick(fc.yeniUyelikFooter);

    }

    @Then("User directs to 'Yeni Üyelik' page.")
    public void confirmsYeniUyelik() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/uye-ol"));

    }

    // Uye girisi
    @And("User clicks 'Üye Girişi' on footer menu.")
    public void clickUyeGirii() {
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
        ParentPage.myClick(fc.iletisimFooter);


    }

    @Then("User directs to 'İletişim' page.")
    public void confirmsIletisim() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/iletisim"));

    }

    // İletişim formu
    @When("User clicks 'İletişim formu' on footer menu.")
    public void clickIletisimFormu() {
        ParentPage.myClick(fc.iletisimFormuFooter);


    }

    @Then("User directs to 'İletişim formu' page.")
    public void confirmsIletisimFormu() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/iletisim-formu"));

    }

    // Havale bildirim formu (Login olmak gerekiyor sonra tekrar bak)
    @When("User clicks 'Havale Bildirim Formu' on footer menu.")
    public void clickHavalebildirimFormu() {
        ParentPage.myClick(fc.havaleBildirimFooter);


    }

    @Then("User directs to 'Havale Bildirim Formu' page.")
    public void confirmsHavalebildirimFormu() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/havalebildirim-formu"));

    }

    // Kargo Takibi
    @When("User clicks 'Kargo takibi' on footer menu.")
    public void clickKargoTakibi() {
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
        ParentPage.myClick(fc.gizlilikVeGuvenlikFooter);


    }

    @Then("User directs to 'Gizlilik ve güvenlik' page.")
    public void confirmsGizlilikVeGizlilik() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/gizlilik-ve-gizlilik"));

    }

    // İade ve değişim koşulları
    @When("User clicks 'İade ve Değişim Koşulları' on footer menu.")
    public void clickIadeveDegisim() {
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
        ParentPage.myClick(fc.siteHaritasiFooter);


    }

    @Then("User directs to 'Site Haritası' page.")
    public void confirmSiteHaritasi() {
        String url = getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("/site-haritasi"));

    }

    // Safety Jogger
    // Outdoor Ayakkabılar
    // İş Ayakkabıları
    // Bosch Profesyonel
    // Karcher Ürünleri
    // Alüminyum Ürünler
    // Teknik Spreyler
    // Çekic ve Balyozlar
    // Matkap Uçları


}
