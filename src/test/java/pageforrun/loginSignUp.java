package pageforrun;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginUp;
import utilities.ReusableMethod;
import utilities.ThreadSafeDriver;

public class loginSignUp {
    LoginUp loginPage = new LoginUp();


    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // Navigate to Campus
        ThreadSafeDriver.getDriver().get("https://magento.softwaretestingboard.com");

    }

    @When("Enter username and password in the text boxes")
    public void enter_username_and_password_in_the_text_boxes()  {
        ReusableMethod.wait(1);
        loginPage.emailLine.sendKeys("kdkjdjdfhfhfh@gmail.com");
        ReusableMethod.wait(1);
        loginPage.passwordLine.sendKeys("me124578*");
    }

    @When("click login button")
    public void click_login_button() {
        loginPage.singInButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        ReusableMethod.wait(2);
        loginPage.isWebElementDisplayed(loginPage.singInOpenButton);

    }
}
