package step_definitions;

import io.cucumber.java.en.Then;
import org.example.pageObject.PaymentInstructionsPage;
import org.example.pageObject.PaymentPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PaymentInstructionsPageStepDef {
    private final WebDriver driver = Hooks.driver;
    PaymentInstructionsPage paymentInstructionsPage = new PaymentInstructionsPage(driver);
    @Then("User will be redirected to payment instructions page")
    public void userWillBeRedirectedToPaymentInstructionsPage() {
        Assert.assertTrue(paymentInstructionsPage.verifyPaymentInstructionsPage());
    }
}
