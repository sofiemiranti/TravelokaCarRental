package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    public static WebDriver webDriver;

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".r-1x35g6")
    private WebElement paymentPageLabel;
    @FindBy(css = "[data-testid='paymentOption-ALFAMART'] .css-901oao")
    private WebElement alfamartPaymentMethod;
    @FindBy(css = ".css-bfa6kz")
    private WebElement payWithAlfamartButton;

    public boolean verifyPaymentPage () {
        return paymentPageLabel.isDisplayed();
    }

    public void clickAlfamartPaymentMethod () {
        alfamartPaymentMethod.click();
    }

    public void clickPayWithAlfamartButton () {
        payWithAlfamartButton.click();
    }
}
