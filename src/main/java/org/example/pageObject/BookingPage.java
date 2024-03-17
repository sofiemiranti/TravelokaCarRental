package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
    public static WebDriver webDriver;

    public BookingPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(css = ".r-1x35g6")
    private WebElement bookingLabel;
    @FindBy(css = "[aria-invalid='true'][aria-labelledby='name.full']")
    private WebElement bookerFullNameField;
    @FindBy(css = ".r-edyy15[aria-invalid='true']")
    private WebElement bookerPhoneField;
    @FindBy(css = "[aria-labelledby='emailAddress']")
    private WebElement bookerEmailField;
    @FindBy(css = ".r-tzxfm6 > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)")
    private WebElement saveBookerButton;
    @FindBy(css = "select.r-30o5oe")
    private WebElement dropdownMenu;
    @FindBy(css = ".r-majxgm[aria-invalid='false']")
    private WebElement driverFullNameField;
    @FindBy(css = "[aria-invalid='false'][aria-label='Phone Number']")
    private WebElement driverPhoneNumberField;
    @FindBy(css = ".r-tzxfm6 div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)")
    private WebElement saveDriverButton;
    @FindBy(css = ".r-13awgt0.r-1awozwy")
    private WebElement continueButton;
    @FindBy(xpath = "//textarea[@class='css-11aywtz r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']")
    private WebElement specialRequestField;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']")
    private WebElement requirementButton;
    @FindBy(css = ".r-150rngu > .css-1dbjc4n > .css-1dbjc4n > .r-1loqt21")
    private WebElement checkAllRequirements;
    @FindBy(css = ".r-150rngu .css-18t94o4 > .css-1dbjc4n")
    private WebElement saveRequirementsButton;
    @FindBy(css = ".r-1uirtdp")
    private WebElement continuePaymentButton;
    @FindBy(xpath = "//h2[.='Apakah pesanan Anda benar?']")
    private WebElement popUpLabel;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1wzrnnt']//div[@class='css-18t94o4 css-1dbjc4n r-kdyh1x r-1loqt21 r-10paoce r-1e081e0 r-5njf8e r-1otgn73 r-lrvibr']/div[@class='css-1dbjc4n r-1awozwy r-13awgt0 r-18u37iz r-1777fci']")
    private WebElement continueBookingButton;

    public boolean verifyBookingPage () {
        return bookingLabel.isDisplayed();
    }

    public void inputBookerFullName (String fullName) {
        bookerFullNameField.sendKeys(fullName);
    }

    public void inputBookerPhoneNumber (String phone) {
        bookerPhoneField.sendKeys(phone);
    }

    public void inputBookerEmail (String email) {
        bookerEmailField.sendKeys(email);
    }

    public void clickSaveBookerButton () {
        saveBookerButton.click();
    }

    public void selectTitleDriverDropDownMenu(String title) {
        // Initialize the Select class with the dropdown element
        Select select = new Select(dropdownMenu);

        // Select "Nona" from the dropdown
        select.selectByVisibleText(title);
    }

    public void inputDriverFullName (String fullName) {
        driverFullNameField.sendKeys(fullName);
    }

    public void inputDriverPhoneNumber (String phone) {
        driverPhoneNumberField.sendKeys(phone);
    }

    public void clickSaveDriverButton () {
        saveDriverButton.click();
    }

    public void clickContinueButton () {
        continueButton.click();
    }

    public void inputSpecialRequestField (String request) {
        specialRequestField.sendKeys(request);
    }

    public void clickRequirementButton () throws InterruptedException {
        requirementButton.click();
        Thread.sleep(2000);
    }

    public void checkAllRequirements () throws InterruptedException {
        checkAllRequirements.click();
        Thread.sleep(2000);
    }

    public void clickSaveRequirementsButton () throws InterruptedException {
        saveRequirementsButton.click();
        Thread.sleep(2000);
    }

    public void clickContinuePayment () throws InterruptedException {
        continuePaymentButton.click();
        Thread.sleep(3000);
    }

    public boolean verifyPopUp () {
        return popUpLabel.isDisplayed();
    }

    public void clickContinueBookingButton () {
        continueBookingButton.click();
    }
}
