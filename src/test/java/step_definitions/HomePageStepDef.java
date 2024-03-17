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
    public void userClickOnCarRentalButton() {
        travelokaHomePage.clickCarRental();
    }

    @And("User click on Without Driver button")
    public void userClickOnWithoutDriverButton() {
        travelokaHomePage.clickWithoutDriver();
    }

    @And("User input {string} as pick up location")
    public void userInputAsPickUpLocation(String pickupLocation) {
        travelokaHomePage.inputPickupLocation(pickupLocation);
    }
}
