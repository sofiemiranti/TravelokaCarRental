package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CarRentalPolicyPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CarRentalPolicyStepDef {
    private final WebDriver driver = Hooks.driver;
    CarRentalPolicyPage carRentalPolicyPage = new CarRentalPolicyPage(driver);

    @Then("User will be redirected to car rental policy page")
    public void userWillBeRedirectedToCarRentalPolicy() {
        Assert.assertTrue(carRentalPolicyPage.verifyRentalPolicyPage());
    }

    @When("User select rental office as pick up location")
    public void userSelectRentalOfficeAsPickUpLocation() throws InterruptedException {
        carRentalPolicyPage.clickRentalOfficePickupRadioButton();
        carRentalPolicyPage.clickRentalOfficeDropdownButton();
        carRentalPolicyPage.selectRentalOfficeName();
        Thread.sleep(5000);
    }

    @And("User select other location as drop off location")
    public void userSelectOtherLocationAsDropOffLocation() throws InterruptedException {
        carRentalPolicyPage.clickOtherLocationDropoffRadioButton();
        carRentalPolicyPage.clickDetailLocationDropoffField();
        carRentalPolicyPage.clickNgurahRaiLocationDropoff();
        Thread.sleep(5000);
    }

    @And("User input drop off notes {string}")
    public void userInputDropOffNotes(String notes) {
        carRentalPolicyPage.inputDropoffNotesField(notes);
    }

    @And("User click continue button on car rental policy page")
    public void userClickContinueButtonOnCarRentalPolicyPage() throws InterruptedException {
        carRentalPolicyPage.clickContinueButton();
        Thread.sleep(3000);
    }
}
