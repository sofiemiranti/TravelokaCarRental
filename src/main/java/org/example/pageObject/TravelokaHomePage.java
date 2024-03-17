package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelokaHomePage {
    public static WebDriver webDriver;

    public TravelokaHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1e081e0 r-oyd9sg r-17yavnb r-184en5c']")
    private WebElement navigationBarContainer;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-9aw3ui']/div[@class='css-1dbjc4n r-1pi2tsx r-bnwqim r-184en5c']/div[.='Rental Mobil']")
    private WebElement carRentalButton;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1e081e0 r-136ojw6']//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr']/div[.='Tanpa Sopir']")
    private WebElement withoutDriverButton;
    @FindBy(xpath = "//input[@value='Jakarta']")
    private WebElement pickupLocationField;

    public boolean verifyHomePage() {
        return navigationBarContainer.isDisplayed();
    }

    public void clickCarRental () {
        carRentalButton.click();
    }

    public void clickWithoutDriver () {
        withoutDriverButton.click();
    }

    public void inputPickupLocation (String pickupLocation) {
        pickupLocationField.sendKeys(pickupLocation);
    }

}
