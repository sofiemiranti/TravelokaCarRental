package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInstructionsPage {
    public static WebDriver webDriver;

    public PaymentInstructionsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".r-1x35g6")
    private WebElement paymentInstructionsLabel;

    public boolean verifyPaymentInstructionsPage () {
        return paymentInstructionsLabel.isDisplayed();
    }
}
