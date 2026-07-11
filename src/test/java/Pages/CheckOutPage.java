package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends ParentPage {
    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //sepete ekleme adımı nasıl olucak

    @FindBy(xpath = "//div[@class = 'cart-menu']/a")
    public WebElement goToCartButton;

    @FindBy(xpath = "//div[@class = 'cart-content-button']/a")
    public WebElement odemeYapButton;

    @FindBy(xpath = "//div[@class = 'cart-panel-buttons form-group']/a")
    public WebElement alisverisiTamamlaButton;

    @FindBy(xpath = "//*[@href= '/order/step2']")
    public WebElement uyeOlmadanDevamEtButton;

    @FindBy(css = "#email")
    public WebElement email;

    @FindBy(css = "#firstname")
    public WebElement firstName;

    @FindBy(css = "#surname")
    public WebElement surname;

    @FindBy(css = "#shippingLocation")
    public WebElement selectTown;

    @FindBy(css = "#shippingSubLocation")
    public WebElement selectIlce;

    @FindBy(css = "#mobilePhoneNumber")
    public WebElement phoneNumber;

    @FindBy(css = "#address")
    public WebElement address;

    @FindBy(css = "#shippingSubLocation") // nasıl yapılıyodu bak sonra gerk de olmayabilir
    public WebElement kargoClick;

    @FindBy(xpath = "//*[@class = 'btn btn-block btn-primary']")
    public WebElement odemeIslemleriButton;

}
