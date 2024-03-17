package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRentalPage {
    public static WebDriver webDriver;

    public CarRentalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".r-sqtsar .css-4rbku5")
    private WebElement carRentalLabel;
    @FindBy(css = ".r-1q2s4rl > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) div:nth-of-type(3) > div:nth-of-type(3) div:nth-of-type(2)")
    private WebElement continueCarButton;

    public boolean verifyCarRentalPage () {
        return carRentalLabel.isDisplayed();
    }

    public void clickCarButton () {
        continueCarButton.click();
    }

}
