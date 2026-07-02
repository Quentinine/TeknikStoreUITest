package Utilities;

import StepDefinitions.Hooks;
import org.openqa.selenium.WebElement;

public class MyFunc {

    public static void myClick(WebElement element) {
        Hooks.setLastUsedElement(element); // son başarılı element kaydedilir
        element.click();
    }

    public static void mySendKeys(WebElement element, String text) {
        Hooks.setLastUsedElement(element); // son başarılı element kaydedilir
        element.clear();
        element.sendKeys(text);
    }
}