package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{

    public DialogContent(WebDriver driver) {
        PageFactory.initElements(
                driver, this);
    }

    @FindBy(xpath = "//div[@class='header-whatsapp']/a")
    public WebElement headerWhatsapp; //header da bulunan WhatsApp butonu





}
