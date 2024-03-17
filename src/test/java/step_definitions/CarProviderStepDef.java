package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CarProviderPage;
import org.example.pageObject.CarRentalPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CarProviderStepDef {
    private final WebDriver driver = Hooks.driver;
    CarProviderPage carProviderPage = new CarProviderPage(driver);

    @Then("User will be redirected to car provider page")
    public void userWillBeRedirectedToCarProviderPage() {
        Assert.assertTrue(carProviderPage.verifyCarProviderPage());
    }


    @When("User click continue button on the chosen car provider")
    public void userClickContinueButtonOnTheChosenCarProvider() throws InterruptedException {
        carProviderPage.clickCarProviderContinueButton();
        Thread.sleep(5000);
    }
}
