package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.BookingPage;
import org.example.pageObject.TravelokaHomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BookingPageStepDef {
    private final WebDriver driver = Hooks.driver;
    BookingPage bookingPage = new BookingPage(driver);

    @Then("User will redirected to booking page")
    public void userWillRedirectedToBookingPage() {
        Assert.assertTrue(bookingPage.verifyBookingPage());
    }

    @When("User input booker's full name {string}")
    public void userInputFullName(String fullName) {
        bookingPage.inputBookerFullName(fullName);
    }

    @And("User input booker's phone number {string}")
    public void userInputPhoneNumber(String phone) {
        bookingPage.inputBookerPhoneNumber(phone);
    }

    @And("User input booker's email {string}")
    public void userInputEmail(String email) {
        bookingPage.inputBookerEmail(email);
    }

    @And("User click save booker's data")
    public void userClickSaveBookerSData() {
        bookingPage.clickSaveBookerButton();
    }

    @And("User choose {string} as driver's title")
    public void userChooseAsDriverSTitle(String title) {
        bookingPage.selectTitleDriverDropDownMenu(title);
    }

    @And("User input driver's full name {string}")
    public void userInputDriverSFullName(String fullName) {
        bookingPage.inputDriverFullName(fullName);
    }

    @And("User input driver's phone number {string}")
    public void userInputDriverSPhoneNumber(String phone) {
        bookingPage.inputDriverPhoneNumber(phone);
    }

    @And("User click save driver's data")
    public void userClickSaveDriverSData() {
        bookingPage.clickSaveDriverButton();
    }

    @And("User click continue button in booking page")
    public void userClickContinueButtonInBookingPage() throws InterruptedException {
        bookingPage.clickContinueButton();
        Thread.sleep(3000);
    }
}
