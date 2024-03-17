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

    @FindBy (xpath = "//div[@class='css-1dbjc4n r-1awozwy r-16uyjmq r-rs99b7 r-18yzcnr r-1777fci r-yc9v9c']/div[@class='css-1dbjc4n r-1fuqb1j r-d045u9 r-1472mwg r-u8s1d r-lrsllp']")
    private WebElement withoutDriverRadioButton;

}
