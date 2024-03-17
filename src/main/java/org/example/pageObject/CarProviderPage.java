package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarProviderPage {
    public static WebDriver webDriver;

    public CarProviderPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".r-5oul0u.css-4rbku5")
    private WebElement carProviderLabel;
    @FindBy(css = ".r-1guathk > .css-1dbjc4n")
    private WebElement carProviderContinueButton;

    public boolean verifyCarProviderPage () {
        return carProviderLabel.isDisplayed();
    }

    public void clickCarProviderContinueButton () {
        carProviderContinueButton.click();
    }
}
