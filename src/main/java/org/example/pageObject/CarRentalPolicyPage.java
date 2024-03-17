package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRentalPolicyPage {
    public static WebDriver webDriver;

    public CarRentalPolicyPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//h3[.='Kebijakan Rental']")
    private WebElement rentalPolicyLabel;
    @FindBy(css = ".r-136ojw6.r-14lw9ot div:nth-of-type(3) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1)")
    private WebElement rentalOfficePickupRadioButton;
    @FindBy(css = ".r-edyy15.r-13awgt0")
    private WebElement rentalOfficeDropdownButton;
    @FindBy(css = ".r-kzbkwu.r-14lw9ot .r-13awgt0")
    private WebElement rentalOfficeNameSelectButton;
    @FindBy(css = ".r-184en5c.r-kdyh1x div:nth-of-type(5) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1)")
    private WebElement otherLocationDropoffRadioButton;
    @FindBy(css = ".r-184en5c.r-kdyh1x input:nth-of-type(1)")
    private WebElement detailLocationDropOffField;
    @FindBy(xpath = "//div[.='KutaBadung, Bali, Indonesia, Asia Tenggara, AsiaLandmark']")
    private WebElement detailDropoffLocation;
    @FindBy(css = ".r-bcqeeo")
    private WebElement dropoffNotesField;
    @FindBy(css = ".r-5wp0in")
    private WebElement continueButton;

    public boolean verifyRentalPolicyPage () {
        return rentalPolicyLabel.isDisplayed();
    }

    public void clickRentalOfficePickupRadioButton () {
        rentalOfficePickupRadioButton.click();
    }

    public void clickRentalOfficeDropdownButton () {
        rentalOfficeDropdownButton.click();
    }

    public void selectRentalOfficeName () {
        rentalOfficeNameSelectButton.click();
    }

    public void clickOtherLocationDropoffRadioButton () {
        otherLocationDropoffRadioButton.click();
    }

    public void inputDetailLocationDropoffField (String location) throws InterruptedException {
        detailLocationDropOffField.sendKeys(location);
        Thread.sleep(2000);
    }

    public void clickDetailLocation () {
        detailDropoffLocation.click();
    }

    public void inputDropoffNotesField (String notes) {
        dropoffNotesField.sendKeys(notes);
    }

    public void clickContinueButton () {
        continueButton.click();
    }
}
