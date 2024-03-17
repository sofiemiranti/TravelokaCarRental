package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pageObject.TravelokaHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDef {
    private final WebDriver driver = Hooks.driver;
    TravelokaHomePage travelokaHomePage = new TravelokaHomePage(driver);

    @Given("User has already on traveloka home page")
    public void userHasAlreadyOnTravelokaHomePage() {
        Assert.assertTrue(travelokaHomePage.verifyHomePage());
    }

    @When("User click on Car Rental button")
    public void userClickOnCarRentalButton() throws InterruptedException {
        travelokaHomePage.clickCarRental();
        Thread.sleep(3000);
    }

    @And("User click on Without Driver button")
    public void userClickOnWithoutDriverButton() {
        travelokaHomePage.clickWithoutDriver();
    }

    @And("User input {string} in pick up location field")
    public void userInputAsPickUpLocation(String pickupLocation) throws InterruptedException {
        travelokaHomePage.inputPickupLocation(pickupLocation);
        travelokaHomePage.clickPickupLocation();
    }

    @And("User input {string} as pick up date")
    public void userInputAsPickUpDate(String pickupDate) {
        travelokaHomePage.inputPickupDate(pickupDate);
    }

    @And("User input 10:00 as pick up time")
    public void userInputHourAndMinuteAsPickUpTime() {
        travelokaHomePage.clickPickupTimeField();
        travelokaHomePage.inputPickupHourTime();
        travelokaHomePage.inputPickupMinuteTime();
    }

    @And("User input {string} as drop off date")
    public void userInputAsDropOffDate(String dropoffDate) {
        travelokaHomePage.inputDropoffDate(dropoffDate);
    }

    @And("User input 15:30 as drop off time")
    public void userInputHourAndMinuteAsDropOffTime() {
        travelokaHomePage.clickDropoffField();
        travelokaHomePage.inputDropoffHourTime();
        travelokaHomePage.inputDropoffMinuteTime();
    }

    @And("User click search button")
    public void userClickSearchButton() {
        travelokaHomePage.clickSearchButton();
    }
}
