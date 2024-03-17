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

}
