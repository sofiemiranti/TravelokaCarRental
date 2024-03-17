package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.BookingPage;
import org.example.pageObject.PaymentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PaymentPageStepDef {
    private final WebDriver driver = Hooks.driver;
    PaymentPage paymentPage = new PaymentPage(driver);
    @Then("User will be redirected to payment page")
    public void userWillBeRedirectedToPaymentPage() {
        Assert.assertTrue(paymentPage.verifyPaymentPage());
    }

    @When("User choose alfamart as payment method")
    public void userChooseAlfamartAsPaymentMethod() throws InterruptedException {
        paymentPage.clickAlfamartPaymentMethod();
        Thread.sleep(3000);
    }

    @And("User click pay with alfamart button")
    public void userClickPayWithAlfamartButton() throws InterruptedException {
        paymentPage.clickPayWithAlfamartButton();
        Thread.sleep(6000);
    }
}
