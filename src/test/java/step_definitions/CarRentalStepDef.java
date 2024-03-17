package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CarRentalPage;
import org.example.pageObject.TravelokaHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CarRentalStepDef {
    private final WebDriver driver = Hooks.driver;
    CarRentalPage carRentalPage = new CarRentalPage(driver);

    @Then("User will be redirected to car rental page")
    public void userWillBeRedirectedToCarRentalPage() {
        Assert.assertTrue(carRentalPage.verifyCarRentalPage());
    }

    @When("User click continue button on the chosen rental car")
    public void userClickContinueButtonOnTheChosenRentalCar() throws InterruptedException {
        carRentalPage.clickCarButton();
        Thread.sleep(3000);
    }
}
