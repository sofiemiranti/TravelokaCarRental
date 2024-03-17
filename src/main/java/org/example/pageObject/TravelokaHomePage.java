package org.example.pageObject;

import org.openqa.selenium.By;
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
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-zmljjp r-18u37iz r-1777fci r-edyy15']/input[@class='css-11aywtz r-cwxd7f r-13awgt0 r-t1w4ow r-ubezar r-majxgm r-135wba7 r-bcqeeo r-1ny4l3l r-10paoce r-13n6l4s']")
    private WebElement pickupLocationField;
    @FindBy(css = "[data-testid='rental-search-form-date-input-start']")
    private WebElement pickupDateField;
    @FindBy(css = ".r-1d2f490.r-1wh2hl7 > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) div:nth-of-type(28) div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1)")
    private WebElement pickupDateButton;
    @FindBy(css = "[data-testid='rental-search-form-time-input-start']")
    private WebElement pickupTimeField;
    @FindBy(css = "[data-testid='rental-search-form-date-input-end']")
    private WebElement dropoffDateField;
    @FindBy(css = ".r-zchlnj.r-1udh08x > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) div:nth-of-type(30) div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(1)")
    private WebElement dropoffDateButton;
    @FindBy(css = "[data-testid='rental-search-form-time-input-end']")
    private WebElement dropoffTimeField;
    @FindBy(css = "[data-id='IcSystemSearch']")
    private WebElement searchButton;

    public boolean verifyHomePage() {
        return navigationBarContainer.isDisplayed();
    }

    public void clickCarRental () {
        carRentalButton.click();
    }

    public void clickWithoutDriver () {
        withoutDriverButton.click();
    }

    public void inputPickupLocation (String pickupLocation) throws InterruptedException {
        pickupLocationField.sendKeys(pickupLocation);
        Thread.sleep(2000);
    }

    public void clickPickupLocation () {
        String locator = "[aria-label='Bali']";
        webDriver.findElement(By.cssSelector(locator)).click();
    }

    public void inputPickupDate (String pickupDate) {
        pickupDateField.sendKeys(pickupDate);
        pickupDateButton.click();
    }

    public void clickPickupTimeField () {
        pickupTimeField.click();
    }
    public void inputPickupHourTime () {
        String locatorHour = ".r-xyw6el.r-18u37iz div:nth-of-type(11) > .css-901oao";
        webDriver.findElement(By.cssSelector(locatorHour)).click();
    }

    public void inputPickupMinuteTime () {
        String locatorMinute = ".r-xyw6el.r-18u37iz div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2)";
        webDriver.findElement(By.cssSelector(locatorMinute)).click();
    }

    public void inputDropoffDate (String dropoffDate) {
        dropoffDateField.sendKeys(dropoffDate);
        dropoffDateButton.click();
    }

    public void clickDropoffField () {
        dropoffTimeField.click();
    }

    public void inputDropoffHourTime () {
        String locatorHour = ".r-xyw6el.r-18u37iz div:nth-of-type(16) > .css-901oao";
        webDriver.findElement(By.cssSelector(locatorHour)).click();
    }

    public void inputDropoffMinuteTime () {
        String locatorMinute = ".r-xyw6el.r-18u37iz > div:nth-of-type(3) > div:nth-of-type(2) div:nth-of-type(2) > div:nth-of-type(1)";
        webDriver.findElement(By.cssSelector(locatorMinute)).click();
    }

    public void clickSearchButton () {
        searchButton.click();
    }
}
