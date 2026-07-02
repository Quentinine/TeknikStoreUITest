package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FooterContent extends ParentPage {
    public FooterContent(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
